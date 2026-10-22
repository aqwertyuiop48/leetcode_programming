import java.util.*;
import java.io.*;

public class Main {
    static int[] head, nxt, to;
    static long[] cap;
    static int ec = 0;
    static int[] level, it;

    static void addEdge(int u, int v, long c) {
        to[ec] = v; cap[ec] = c; nxt[ec] = head[u]; head[u] = ec++;
        to[ec] = u; cap[ec] = 0; nxt[ec] = head[v]; head[v] = ec++;
    }

    static boolean bfs(int s, int t, int N) {
        Arrays.fill(level, -1);
        int[] q = new int[N];
        int qh = 0, qt = 0;
        q[qt++] = s;
        level[s] = 0;
        while (qh < qt) {
            int u = q[qh++];
            for (int e = head[u]; e >= 0; e = nxt[e]) {
                if (cap[e] > 0 && level[to[e]] < 0) {
                    level[to[e]] = level[u] + 1;
                    q[qt++] = to[e];
                }
            }
        }
        return level[t] >= 0;
    }

    static long dfs(int u, int t, long f) {
        if (u == t) return f;
        for (; it[u] >= 0; it[u] = nxt[it[u]]) {
            int e = it[u];
            int v = to[e];
            if (cap[e] > 0 && level[v] == level[u] + 1) {
                long d = dfs(v, t, Math.min(f, cap[e]));
                if (d > 0) {
                    cap[e] -= d;
                    cap[e ^ 1] += d;
                    return d;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        Thread th = new Thread(null, () -> {
            try {
                run();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, "main", 1L << 28);
        th.start();
        th.join();
    }

    static void run() throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        long[] a = new long[n], b = new long[n], c = new long[n];
        for (int i = 0; i < n; i++) {
            st.nextToken(); a[i] = (long) st.nval;
            st.nextToken(); b[i] = (long) st.nval;
            st.nextToken(); c[i] = (long) st.nval;
        }
        int[] lo = new int[n], hi = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken(); lo[i] = (int) st.nval;
            st.nextToken(); hi[i] = (int) st.nval;
        }
        int[] base = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            base[i] = cnt;
            cnt += hi[i] - lo[i] + 2;
        }
        int S = cnt, T = cnt + 1, N = cnt + 2;
        int maxE = 2 * (cnt + 2 * n + m * 205 + 10);
        head = new int[N];
        Arrays.fill(head, -1);
        nxt = new int[maxE];
        to = new int[maxE];
        cap = new long[maxE];
        level = new int[N];
        it = new int[N];
        final long BIG = 1000000000L, INF = 1000000000000000L;
        for (int i = 0; i < n; i++) {
            addEdge(S, base[i], INF);
            addEdge(base[i] + hi[i] - lo[i] + 1, T, INF);
            for (int x = lo[i]; x <= hi[i]; x++) {
                long f = a[i] * x * x + b[i] * x + c[i];
                addEdge(base[i] + x - lo[i], base[i] + x - lo[i] + 1, BIG - f);
            }
        }
        for (int k = 0; k < m; k++) {
            st.nextToken(); int u = (int) st.nval - 1;
            st.nextToken(); int v = (int) st.nval - 1;
            st.nextToken(); int d = (int) st.nval;
            for (int t = lo[u]; t <= hi[u]; t++) {
                int target = t - d;
                if (target <= lo[v]) continue;
                if (target > hi[v] + 1) target = hi[v] + 1;
                addEdge(base[u] + t - lo[u], base[v] + target - lo[v], INF);
            }
        }
        long flow = 0;
        while (bfs(S, T, N)) {
            System.arraycopy(head, 0, it, 0, N);
            long f;
            while ((f = dfs(S, T, Long.MAX_VALUE)) > 0) flow += f;
        }
        System.out.println(n * BIG - flow);
    }
}
