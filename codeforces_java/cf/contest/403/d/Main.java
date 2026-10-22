import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 1_000_000_007L;

    static long pw(long b, long e) {
        long r = 1; b %= MOD;
        while (e > 0) { if ((e & 1) == 1) r = r * b % MOD; b = b * b % MOD; e >>= 1; }
        return r;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        int N = 1000, K = 50;
        int F = N + K + 5;
        long[] fact = new long[F], inv = new long[F];
        fact[0] = 1;
        for (int i = 1; i < F; i++) fact[i] = fact[i - 1] * i % MOD;
        inv[F - 1] = pw(fact[F - 1], MOD - 2);
        for (int i = F - 1; i > 0; i--) inv[i - 1] = inv[i] * i % MOD;
        long[][] d = new long[K + 1][N + 1];
        d[0][0] = 1;
        for (int j = 1; j <= K; j++)
            for (int s = j; s <= N; s++)
                d[j][s] = (d[j][s - j] + d[j - 1][s - j]) % MOD;
        long[][] ans = new long[K + 1][N + 1];
        for (int k = 1; k <= K; k++) {
            for (int n = 1; n <= N; n++) {
                long sum = 0;
                for (int s = k; s <= n; s++) {
                    if (d[k][s] == 0) continue;
                    int m = n - s + k;
                    long c = fact[m] * inv[k] % MOD * inv[m - k] % MOD;
                    sum = (sum + d[k][s] * c) % MOD;
                }
                ans[k][n] = sum * fact[k] % MOD;
            }
        }
        st.nextToken(); int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st.nextToken(); int n = (int) st.nval;
            st.nextToken(); int k = (int) st.nval;
            sb.append(ans[k][n]).append('\n');
        }
        System.out.print(sb);
    }
}
