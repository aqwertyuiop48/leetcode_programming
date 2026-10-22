import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken(); int n = (int) in.nval;
        in.nextToken(); int m = (int) in.nval;
        in.nextToken(); long T = (long) in.nval;
        in.nextToken(); long tp = (long) in.nval;
        in.nextToken(); long tu = (long) in.nval;
        in.nextToken(); long td = (long) in.nval;
        int[][] h = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) { in.nextToken(); h[i][j] = (int) in.nval; }
        // A[r][c]: cost going right from col1 to c in row r; B[r][c]: cost going left from c to col1
        long[][] A = new long[n + 1][m + 1], B = new long[n + 1][m + 1], D = new long[n + 1][n == 0 ? 1 : m + 1], U = new long[n + 1][m + 1];
        for (int r = 1; r <= n; r++) {
            for (int c = 2; c <= m; c++) {
                int a = h[r][c - 1], b = h[r][c];
                A[r][c] = A[r][c - 1] + (a < b ? tu : a > b ? td : tp);
                B[r][c] = B[r][c - 1] + (b < a ? tu : b > a ? td : tp); // move from c to c-1
            }
        }
        for (int c = 1; c <= m; c++) {
            for (int r = 2; r <= n; r++) {
                int a = h[r - 1][c], b = h[r][c];
                D[r][c] = D[r - 1][c] + (a < b ? tu : a > b ? td : tp); // move down r-1 -> r
                U[r][c] = U[r - 1][c] + (b < a ? tu : b > a ? td : tp); // move up r -> r-1
            }
        }
        long best = Long.MAX_VALUE;
        int b1 = 0, b2 = 0, b3 = 0, b4 = 0;
        long[] keys = new long[m + 1];
        long[] g = new long[m + 1];
        long[] sortedKeys = new long[m + 1];
        int[] rankOf = new int[m + 1];
        long[] bits = new long[(m >> 6) + 2];
        for (int p1 = 1; p1 <= n; p1++) {
            for (int p2 = p1 + 2; p2 <= n; p2++) {
                for (int q = 1; q <= m; q++) {
                    g[q] = -A[p1][q] - B[p2][q] + U[p2][q] - U[p1][q];
                    keys[q] = g[q] * 512 + q;
                }
                int cntK = 0;
                for (int q = 1; q <= m - 2; q++) sortedKeys[cntK++] = keys[q];
                if (cntK == 0) continue;
                Arrays.sort(sortedKeys, 0, cntK);
                // rank of each q
                for (int i = 0; i < cntK; i++) rankOf[(int) (((sortedKeys[i] % 512) + 512) % 512)] = i;
                Arrays.fill(bits, 0);
                for (int q2 = 3; q2 <= m; q2++) {
                    int q1 = q2 - 2;
                    int rk = rankOf[q1];
                    bits[rk >> 6] |= 1L << (rk & 63);
                    long f = A[p1][q2] + B[p2][q2] + D[p2][q2] - D[p1][q2];
                    long x = T - f;
                    // lower bound of x in sorted values: first i with sortedKeys[i] >= x*512 (q>=1 so x*512+0)
                    long target = x * 512;
                    int lo = 0, hi = cntK;
                    while (lo < hi) { int md = (lo + hi) >>> 1; if (sortedKeys[md] >= target) hi = md; else lo = md + 1; }
                    // successor: first active rank >= lo
                    int s = -1;
                    {
                        int w = lo >> 6;
                        if (w < bits.length) {
                            long word = bits[w] & (-1L << (lo & 63));
                            while (true) {
                                if (word != 0) { s = (w << 6) + Long.numberOfTrailingZeros(word); break; }
                                w++;
                                if (w >= bits.length) break;
                                word = bits[w];
                            }
                        }
                    }
                    int pr = -1;
                    if (lo > 0) {
                        int pos = lo - 1;
                        int w = pos >> 6;
                        long mask = (pos & 63) == 63 ? -1L : ((1L << ((pos & 63) + 1)) - 1);
                        long word = bits[w] & mask;
                        while (true) {
                            if (word != 0) { pr = (w << 6) + 63 - Long.numberOfLeadingZeros(word); break; }
                            w--;
                            if (w < 0) break;
                            word = bits[w];
                        }
                    }
                    if (s >= 0 && s < cntK) {
                        int qq = (int) (sortedKeys[s] & 511);
                        long tot = f + g[qq];
                        long d = Math.abs(tot - T);
                        if (d < best) { best = d; b1 = p1; b2 = qq; b3 = p2; b4 = q2; }
                    }
                    if (pr >= 0) {
                        int qq = (int) (sortedKeys[pr] & 511);
                        long tot = f + g[qq];
                        long d = Math.abs(tot - T);
                        if (d < best) { best = d; b1 = p1; b2 = qq; b3 = p2; b4 = q2; }
                    }
                }
            }
        }
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
    }
}
