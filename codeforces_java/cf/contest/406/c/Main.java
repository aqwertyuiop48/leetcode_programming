import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        if (m % 2 == 1) { System.out.println("No solution"); return; }
        int[] head = new int[n + 1];
        Arrays.fill(head, -1);
        int[] nxt = new int[2 * m], to = new int[2 * m];
        for (int i = 0; i < m; i++) {
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;
            to[2 * i] = b; nxt[2 * i] = head[a]; head[a] = 2 * i;
            to[2 * i + 1] = a; nxt[2 * i + 1] = head[b]; head[b] = 2 * i + 1;
        }
        boolean[] used = new boolean[m];
        boolean[] vis = new boolean[n + 1];
        int[] pend = new int[n + 1];
        Arrays.fill(pend, -1);
        int[] par = new int[n + 1];
        int[] it = new int[n + 1];
        int[] stack = new int[n + 1];
        StringBuilder sb = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            if (vis[r]) continue;
            int sp = 0;
            stack[sp++] = r; vis[r] = true; par[r] = 0; it[r] = head[r];
            while (sp > 0) {
                int v = stack[sp - 1];
                if (it[v] != -1) {
                    int e = it[v];
                    it[v] = nxt[e];
                    if (used[e >> 1]) continue;
                    used[e >> 1] = true;
                    int u = to[e];
                    if (!vis[u]) {
                        vis[u] = true; par[u] = v; it[u] = head[u];
                        stack[sp++] = u;
                    } else {
                        if (pend[v] == -1) pend[v] = u;
                        else { sb.append(pend[v]).append(' ').append(v).append(' ').append(u).append('\n'); pend[v] = -1; }
                    }
                } else {
                    sp--;
                    int p = par[v];
                    if (pend[v] != -1) {
                        if (p == 0) { System.out.println("No solution"); return; }
                        sb.append(pend[v]).append(' ').append(v).append(' ').append(p).append('\n');
                        pend[v] = -1;
                    } else if (p != 0) {
                        if (pend[p] == -1) pend[p] = v;
                        else { sb.append(pend[p]).append(' ').append(p).append(' ').append(v).append('\n'); pend[p] = -1; }
                    }
                }
            }
        }
        System.out.print(sb);
    }
}
