import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken(); int n = (int) in.nval;
        in.nextToken(); int m = (int) in.nval;
        in.nextToken(); int k = (int) in.nval;
        int[][] g = new int[n][m];
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) { in.nextToken(); g[i][j] = (int) in.nval; }
        int best = Integer.MAX_VALUE;
        if (n <= k) {
            // enumerate pattern over rows (column vector); each column equals it or complement
            int[] colMask = new int[m];
            for (int j = 0; j < m; j++) { int mk = 0; for (int i = 0; i < n; i++) if (g[i][j] == 1) mk |= 1 << i; colMask[j] = mk; }
            for (int pat = 0; pat < (1 << n); pat++) {
                int tot = 0;
                for (int j = 0; j < m; j++) {
                    int d = Integer.bitCount(pat ^ colMask[j]);
                    tot += Math.min(d, n - d);
                }
                best = Math.min(best, tot);
            }
        } else {
            for (int r = 0; r < n; r++) {
                int tot = 0;
                for (int i = 0; i < n; i++) {
                    int d = 0;
                    for (int j = 0; j < m; j++) if (g[i][j] != g[r][j]) d++;
                    tot += Math.min(d, m - d);
                }
                best = Math.min(best, tot);
            }
        }
        System.out.println(best <= k ? best : -1);
    }
}
