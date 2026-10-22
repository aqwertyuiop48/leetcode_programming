import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken();
        int n = (int) in.nval;
        long[] cost = new long[n];
        for (int i = 0; i < n; i++) { in.nextToken(); cost[i] = (long) in.nval; }
        in.nextToken();
        int m = (int) in.nval;
        int[] head = new int[n], nxt = new int[m], to = new int[m];
        Arrays.fill(head, -1);
        for (int i = 0; i < m; i++) {
            in.nextToken(); int a = (int) in.nval - 1;
            in.nextToken(); int b = (int) in.nval - 1;
            to[i] = b; nxt[i] = head[a]; head[a] = i;
        }
        // iterative Tarjan
        int[] idx = new int[n], low = new int[n], comp = new int[n], it = new int[n];
        Arrays.fill(idx, -1);
        Arrays.fill(comp, -1);
        boolean[] on = new boolean[n];
        int[] stack = new int[n], call = new int[n];
        int sp = 0, cnt = 0, nc = 0;
        for (int s = 0; s < n; s++) {
            if (idx[s] != -1) continue;
            int cp = 0;
            call[cp++] = s;
            idx[s] = low[s] = cnt++;
            stack[sp++] = s; on[s] = true; it[s] = head[s];
            while (cp > 0) {
                int u = call[cp - 1];
                if (it[u] != -1) {
                    int e = it[u];
                    it[u] = nxt[e];
                    int v = to[e];
                    if (idx[v] == -1) {
                        idx[v] = low[v] = cnt++;
                        stack[sp++] = v; on[v] = true; it[v] = head[v];
                        call[cp++] = v;
                    } else if (on[v]) {
                        low[u] = Math.min(low[u], idx[v]);
                    }
                } else {
                    if (low[u] == idx[u]) {
                        while (true) {
                            int w = stack[--sp];
                            on[w] = false;
                            comp[w] = nc;
                            if (w == u) break;
                        }
                        nc++;
                    }
                    cp--;
                    if (cp > 0) {
                        int p = call[cp - 1];
                        low[p] = Math.min(low[p], low[u]);
                    }
                }
            }
        }
        long[] mn = new long[nc];
        long[] ways = new long[nc];
        Arrays.fill(mn, Long.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            int c = comp[i];
            if (cost[i] < mn[c]) { mn[c] = cost[i]; ways[c] = 1; }
            else if (cost[i] == mn[c]) ways[c]++;
        }
        long MOD = 1000000007L, total = 0, w = 1;
        for (int c = 0; c < nc; c++) { total += mn[c]; w = w * (ways[c] % MOD) % MOD; }
        System.out.println(total + " " + w);
    }
}
