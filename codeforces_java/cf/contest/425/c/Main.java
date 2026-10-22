import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken(); int n = (int) in.nval;
        in.nextToken(); int m = (int) in.nval;
        in.nextToken(); long s = (long) in.nval;
        in.nextToken(); long e = (long) in.nval;
        int[] a = new int[n + 1], b = new int[m + 1];
        for (int i = 1; i <= n; i++) { in.nextToken(); a[i] = (int) in.nval; }
        for (int i = 1; i <= m; i++) { in.nextToken(); b[i] = (int) in.nval; }
        int MAXV = 100001;
        int[] start = new int[MAXV + 2];
        for (int i = 1; i <= m; i++) start[b[i] + 1]++;
        for (int i = 1; i < start.length; i++) start[i] += start[i - 1];
        int[] pos = new int[m];
        int[] fill = new int[MAXV + 1];
        for (int i = 1; i <= m; i++) { pos[start[b[i]] + fill[b[i]]++] = i; }
        int INF = Integer.MAX_VALUE / 2;
        int K = (int) Math.min(n, s / e);
        int[] prev = new int[n + 1], cur = new int[n + 1];
        Arrays.fill(prev, 0); // dp[0][i] = 0
        int ans = 0;
        for (int k = 1; k <= K; k++) {
            cur[0] = INF;
            boolean any = false;
            for (int i = 1; i <= n; i++) {
                int v = cur[i - 1];
                int p = prev[i - 1];
                if (p < INF) {
                    int lo = start[a[i]], hi = start[a[i] + 1];
                    // first position > p
                    int l = lo, r = hi;
                    while (l < r) { int md = (l + r) >>> 1; if (pos[md] > p) r = md; else l = md + 1; }
                    if (l < hi && pos[l] < v) v = pos[l];
                }
                cur[i] = v;
                if (v < INF && (long) k * e + i + v <= s) any = true;
            }
            if (any) ans = k;
            int[] t = prev; prev = cur; cur = t;
        }
        System.out.println(ans);
    }
}
