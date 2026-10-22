import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        st.nextToken();
        int k = (int) st.nval;
        st.nextToken();
        int Ll = (int) st.nval;
        int[] l = new int[Ll];
        for (int i = 0; i < Ll; i++) {
            st.nextToken();
            l[i] = (int) st.nval;
        }
        st.nextToken();
        int Lr = (int) st.nval;
        int[] r = new int[Lr];
        for (int i = 0; i < Lr; i++) {
            st.nextToken();
            r[i] = (int) st.nval;
        }
        int maxNodes = 1;
        int[][] pat = new int[n][];
        int[] pv = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            int len = (int) st.nval;
            pat[i] = new int[len];
            for (int j = 0; j < len; j++) {
                st.nextToken();
                pat[i][j] = (int) st.nval;
            }
            st.nextToken();
            pv[i] = (int) st.nval;
            maxNodes += len;
        }
        int[][] go = new int[maxNodes][m];
        for (int[] g : go) Arrays.fill(g, -1);
        long[] val = new long[maxNodes];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            int u = 0;
            for (int c : pat[i]) {
                if (go[u][c] < 0) go[u][c] = cnt++;
                u = go[u][c];
            }
            val[u] += pv[i];
        }
        int[] fail = new int[cnt];
        int[] queue = new int[cnt];
        int qh = 0, qt = 0;
        for (int c = 0; c < m; c++) {
            if (go[0][c] < 0) go[0][c] = 0;
            else {
                fail[go[0][c]] = 0;
                queue[qt++] = go[0][c];
            }
        }
        while (qh < qt) {
            int u = queue[qh++];
            val[u] += val[fail[u]];
            for (int c = 0; c < m; c++) {
                int v = go[u][c];
                if (v < 0) go[u][c] = go[fail[u]][c];
                else {
                    fail[v] = go[fail[u]][c];
                    queue[qt++] = v;
                }
            }
        }
        int N = cnt;
        int[] vv = new int[N];
        for (int i = 0; i < N; i++) vv[i] = (int) Math.min(val[i], k + 1);
        int K = k + 1;
        int[][] cur = new int[N][K];
        int[][] nw = new int[N][K];
        int off = Lr - Ll;
        int nodeR = 0, sumR = 0;
        boolean aliveR = true;
        int nodeL = 0, sumL = 0;
        boolean aliveL = true;
        for (int p = 0; p < Lr; p++) {
            for (int[] row : nw) Arrays.fill(row, 0);
            if (p > 0) {
                for (int u = 0; u < N; u++) {
                    int[] cr = cur[u];
                    for (int d = 0; d < m; d++) {
                        int v = go[u][d];
                        int w = vv[v];
                        if (w > k) continue;
                        int[] nr = nw[v];
                        for (int s = 0; s + w <= k; s++) {
                            int x = cr[s];
                            if (x != 0) {
                                int y = nr[s + w] + x;
                                if (y >= MOD) y -= MOD;
                                nr[s + w] = y;
                            }
                        }
                    }
                }
            }
            if (aliveR) {
                for (int d = (p == 0 ? 1 : 0); d < r[p]; d++) {
                    int v = go[nodeR][d];
                    int ns = sumR + vv[v];
                    if (ns <= k) nw[v][ns] = (nw[v][ns] + 1) % MOD;
                }
                nodeR = go[nodeR][r[p]];
                sumR += vv[nodeR];
                if (sumR > k) aliveR = false;
            }
            if (p >= off && aliveL) {
                int i = p - off;
                for (int d = (i == 0 ? 1 : 0); d < l[i]; d++) {
                    int v = go[nodeL][d];
                    int ns = sumL + vv[v];
                    if (ns <= k) nw[v][ns] = (nw[v][ns] + MOD - 1) % MOD;
                }
                nodeL = go[nodeL][l[i]];
                sumL += vv[nodeL];
                if (sumL > k) aliveL = false;
            }
            if (p >= 1 && p <= off) {
                for (int d = 1; d < m; d++) {
                    int v = go[0][d];
                    int ns = vv[v];
                    if (ns <= k) nw[v][ns] = (nw[v][ns] + 1) % MOD;
                }
            }
            int[][] t = cur;
            cur = nw;
            nw = t;
        }
        long total = aliveR ? 1 : 0;
        for (int u = 0; u < N; u++)
            for (int s = 0; s <= k; s++) total += cur[u][s];
        total %= MOD;
        System.out.println(total);
    }
}
