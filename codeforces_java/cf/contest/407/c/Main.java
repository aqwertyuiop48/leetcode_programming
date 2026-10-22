import java.util.*;
import java.io.*;
public class Main {
    static final long M = 1000000007L;
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; i++) { st.nextToken(); a[i] = (int) st.nval; }
        int F = n + 205;
        long[] f = new long[F], inv = new long[F];
        f[0] = 1;
        for (int i = 1; i < F; i++) f[i] = f[i - 1] * i % M;
        inv[F - 1] = pw(f[F - 1], M - 2);
        for (int i = F - 1; i > 0; i--) inv[i - 1] = inv[i] * i % M;
        int K = 101;
        long[][] d = new long[K + 2][n + 3];
        for (int q = 0; q < m; q++) {
            st.nextToken(); int l = (int) st.nval;
            st.nextToken(); int r = (int) st.nval;
            st.nextToken(); int k = (int) st.nval;
            k++;
            d[k][l] = (d[k][l] + 1) % M;
            for (int j = 1; j <= k; j++) {
                int t = k - j; int tot = t + r - l;
                long c = f[tot] * inv[t] % M * inv[r - l] % M;
                d[j][r + 1] = ((d[j][r + 1] - c) % M + M) % M;
            }
        }
        long[] prev = new long[n + 3];
        long[] cur = new long[n + 3];
        for (int j = K; j >= 1; j--) {
            long run = 0;
            for (int i = 1; i <= n; i++) {
                run = (run + d[j][i] + prev[i]) % M;
                cur[i] = run;
            }
            long[] tmp = prev; prev = cur; cur = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append((a[i] + prev[i]) % M).append(i < n ? ' ' : '\n');
        }
        System.out.print(sb);
    }
    static long pw(long b, long e) { long r = 1; b %= M; while (e > 0) { if ((e & 1) == 1) r = r * b % M; b = b * b % M; e >>= 1; } return r; }
}
