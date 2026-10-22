import java.util.*;
import java.io.*;

public class Main {
    static int n, k;
    static ArrayList<int[]>[] adj;
    static int[] par, parEdge, sz;
    static int[][] dp;
    static ArrayList<Integer>[] kids;
    static ArrayList<int[]>[] choice;
    static final int INF = 1000000;
    static ArrayList<Integer> cuts = new ArrayList<>();

    static void dfs(int v, int p) {
        par[v] = p;
        sz[v] = 1;
        dp[v] = new int[]{INF, 0};
        for (int[] e : adj[v]) {
            int c = e[0];
            if (c == p) continue;
            parEdge[c] = e[1];
            dfs(c, v);
            kids[v].add(c);
            int cs = Math.min(sz[v], k), ds = Math.min(sz[c], k);
            int ns = Math.min(sz[v] + sz[c], k);
            int[] nd = new int[ns + 1];
            int[] ch = new int[ns + 1];
            Arrays.fill(nd, INF);
            for (int j = 1; j <= cs; j++) {
                if (dp[v][j] >= INF) continue;
                if (dp[v][j] + 1 < nd[j]) { nd[j] = dp[v][j] + 1; ch[j] = 0; }
                for (int t = 1; t <= ds && j + t <= ns; t++) {
                    if (dp[c][t] >= INF) continue;
                    int val = dp[v][j] + dp[c][t];
                    if (val < nd[j + t]) { nd[j + t] = val; ch[j + t] = t; }
                }
            }
            sz[v] += sz[c];
            dp[v] = nd;
            choice[v].add(ch);
        }
    }
    static void gather(int v, int j) {
        for (int idx = kids[v].size() - 1; idx >= 0; idx--) {
            int c = kids[v].get(idx);
            int t = choice[v].get(idx)[j];
            if (t == 0) cuts.add(parEdge[c]);
            else { gather(c, t); j -= t; }
        }
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); n = (int) st.nval;
        st.nextToken(); k = (int) st.nval;
        adj = new ArrayList[n + 1];
        kids = new ArrayList[n + 1];
        choice = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) { adj[i] = new ArrayList<>(); kids[i] = new ArrayList<>(); choice[i] = new ArrayList<>(); }
        for (int i = 1; i < n; i++) {
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;
            adj[a].add(new int[]{b, i});
            adj[b].add(new int[]{a, i});
        }
        par = new int[n + 1]; parEdge = new int[n + 1]; sz = new int[n + 1];
        dp = new int[n + 1][];
        dfs(1, 0);
        int best = INF, bv = -1;
        for (int v = 1; v <= n; v++) {
            if (dp[v].length > k && dp[v][k] < INF) {
                int val = dp[v][k] + (v != 1 ? 1 : 0);
                if (val < best) { best = val; bv = v; }
            }
        }
        gather(bv, k);
        if (bv != 1) cuts.add(parEdge[bv]);
        StringBuilder sb = new StringBuilder();
        sb.append(cuts.size()).append('\n');
        if (!cuts.isEmpty()) {
            for (int i = 0; i < cuts.size(); i++) { if (i > 0) sb.append(' '); sb.append(cuts.get(i)); }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
