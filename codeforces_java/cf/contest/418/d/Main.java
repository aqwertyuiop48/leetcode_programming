import java.util.*;
import java.io.*;

public class Main {
    static int n, LG;
    static int[] dep, tin, tout, order;
    static int[][] mn, up, DU, DV, DL;
    static int[] lg;

    static int dist(int u, int v) {
        if (u == v) return 0;
        int a = tin[u], b = tin[v];
        if (a > b) { int t = a; a = b; b = t; }
        a++;
        int k = lg[b - a + 1];
        int m = Math.min(mn[k][a], mn[k][b - (1 << k) + 1]);
        return dep[u] + dep[v] - 2 * (m - 1);
    }

    static int ru, rv, rl;
    static boolean has;

    static void add(int u, int v, int l) {
        if (!has) { ru = u; rv = v; rl = l; has = true; return; }
        int bu = ru, bv = rv, bl = rl;
        if (l > bl) { bu = u; bv = v; bl = l; }
        int[] x = {ru, rv}, y = {u, v};
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                int d = dist(x[i], y[j]);
                if (d > bl) { bl = d; bu = x[i]; bv = y[j]; }
            }
        ru = bu; rv = bv; rl = bl;
    }

    static void addRange(int l, int r) {
        if (l > r) return;
        int k = lg[r - l + 1];
        add(DU[k][l], DV[k][l], DL[k][l]);
        if (r - (1 << k) + 1 != l) {
            int p = r - (1 << k) + 1;
            add(DU[k][p], DV[k][p], DL[k][p]);
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        st.nextToken(); n = (int) st.nval;
        int[] head = new int[n], nxt = new int[2 * n], to = new int[2 * n];
        Arrays.fill(head, -1);
        int ec = 0;
        for (int i = 0; i < n - 1; i++) {
            st.nextToken(); int a = (int) st.nval - 1;
            st.nextToken(); int b = (int) st.nval - 1;
            to[ec] = b; nxt[ec] = head[a]; head[a] = ec++;
            to[ec] = a; nxt[ec] = head[b]; head[b] = ec++;
        }
        LG = 1; while ((1 << LG) <= n) LG++;
        lg = new int[n + 2];
        for (int i = 2; i < n + 2; i++) lg[i] = lg[i / 2] + 1;
        dep = new int[n]; tin = new int[n]; tout = new int[n]; order = new int[n];
        up = new int[LG][n];
        int[] stack = new int[n], it = new int[n];
        int sp = 0, timer = 0;
        stack[sp++] = 0; up[0][0] = 0; tin[0] = timer; order[timer++] = 0;
        for (int i = 0; i < n; i++) it[i] = head[i];
        while (sp > 0) {
            int u = stack[sp - 1];
            if (it[u] >= 0) {
                int e = it[u]; it[u] = nxt[e];
                int v = to[e];
                if (v == up[0][u] && u != 0 || (u == 0 && false)) continue;
                if (u != 0 && v == up[0][u]) continue;
                up[0][v] = u; dep[v] = dep[u] + 1;
                tin[v] = timer; order[timer++] = v;
                stack[sp++] = v;
            } else {
                tout[u] = timer - 1;
                sp--;
            }
        }
        for (int j = 1; j < LG; j++)
            for (int i = 0; i < n; i++) up[j][i] = up[j - 1][up[j - 1][i]];
        mn = new int[LG][];
        mn[0] = new int[n];
        for (int i = 0; i < n; i++) mn[0][i] = dep[order[i]];
        for (int j = 1; j < LG; j++) {
            if ((1 << j) > n) { mn[j] = new int[0]; continue; }
            mn[j] = new int[n - (1 << j) + 1];
            for (int i = 0; i + (1 << j) <= n; i++)
                mn[j][i] = Math.min(mn[j - 1][i], mn[j - 1][i + (1 << (j - 1))]);
        }
        DU = new int[LG][]; DV = new int[LG][]; DL = new int[LG][];
        DU[0] = new int[n]; DV[0] = new int[n]; DL[0] = new int[n];
        for (int i = 0; i < n; i++) { DU[0][i] = order[i]; DV[0][i] = order[i]; DL[0][i] = 0; }
        for (int j = 1; j < LG; j++) {
            if ((1 << j) > n) { DU[j] = new int[0]; DV[j] = new int[0]; DL[j] = new int[0]; continue; }
            int sz = n - (1 << j) + 1;
            DU[j] = new int[sz]; DV[j] = new int[sz]; DL[j] = new int[sz];
            for (int i = 0; i < sz; i++) {
                int h = i + (1 << (j - 1));
                has = false;
                add(DU[j - 1][i], DV[j - 1][i], DL[j - 1][i]);
                add(DU[j - 1][h], DV[j - 1][h], DL[j - 1][h]);
                DU[j][i] = ru; DV[j][i] = rv; DL[j][i] = rl;
            }
        }
        st.nextToken(); int q = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            st.nextToken(); int a = (int) st.nval - 1;
            st.nextToken(); int b = (int) st.nval - 1;
            if (dep[a] < dep[b]) { int t = a; a = b; b = t; }
            int D = dist(a, b);
            int k = D == 0 ? 0 : (D - 1) / 2;
            int mid = a;
            for (int j = 0; j < LG; j++) if (((k >> j) & 1) != 0) mid = up[j][mid];
            has = false;
            addRange(tin[mid], tout[mid]);
            int ans = Math.max(dist(a, ru), dist(a, rv));
            has = false;
            addRange(0, tin[mid] - 1);
            addRange(tout[mid] + 1, n - 1);
            if (has) ans = Math.max(ans, Math.max(dist(b, ru), dist(b, rv)));
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
