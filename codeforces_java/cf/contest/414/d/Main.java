import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); long k = (long) st.nval;
        st.nextToken(); long p = (long) st.nval;
        int[] head = new int[n + 1];
        Arrays.fill(head, -1);
        int[] nxt = new int[2 * n], to = new int[2 * n];
        int ec = 0;
        for (int i = 0; i < n - 1; i++) {
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;
            to[ec] = b; nxt[ec] = head[a]; head[a] = ec++;
            to[ec] = a; nxt[ec] = head[b]; head[b] = ec++;
        }
        int[] dep = new int[n + 1];
        Arrays.fill(dep, -1);
        int[] q = new int[n];
        int qh = 0, qt = 0;
        q[qt++] = 1; dep[1] = 0;
        while (qh < qt) {
            int u = q[qh++];
            for (int e = head[u]; e >= 0; e = nxt[e]) {
                int v = to[e];
                if (dep[v] < 0) { dep[v] = dep[u] + 1; q[qt++] = v; }
            }
        }
        // q is in BFS order => depth non-decreasing; skip root
        int m = n - 1;
        long[] d = new long[m];
        long[] pre = new long[m + 1];
        for (int i = 0; i < m; i++) { d[i] = dep[q[i + 1]]; pre[i + 1] = pre[i] + d[i]; }
        int best = 0;
        int l = 0;
        for (int r = 0; r < m; r++) {
            while (true) {
                long size = r - l + 1;
                long cost = d[r] * size - (pre[r + 1] - pre[l]);
                if (size > k || cost > p) l++; else break;
            }
            best = Math.max(best, r - l + 1);
        }
        System.out.println(best);
    }
}
