import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 998244353L;
    static long pw(long b, long e) {
        long r = 1; b %= MOD; if (b < 0) b += MOD;
        while (e > 0) { if ((e & 1) == 1) r = r * b % MOD; b = b * b % MOD; e >>= 1; }
        return r;
    }
    static void ntt(long[] a, boolean inv) {
        int n = a.length;
        for (int i = 1, j = 0; i < n; i++) {
            int bit = n >> 1;
            for (; (j & bit) != 0; bit >>= 1) j ^= bit;
            j ^= bit;
            if (i < j) { long t = a[i]; a[i] = a[j]; a[j] = t; }
        }
        for (int len = 2; len <= n; len <<= 1) {
            long w = pw(3, (MOD - 1) / len);
            if (inv) w = pw(w, MOD - 2);
            int half = len >> 1;
            long[] ws = new long[half];
            ws[0] = 1;
            for (int i = 1; i < half; i++) ws[i] = ws[i - 1] * w % MOD;
            for (int i = 0; i < n; i += len) {
                for (int j = 0; j < half; j++) {
                    long u = a[i + j], v = a[i + j + half] * ws[j] % MOD;
                    long x = u + v; if (x >= MOD) x -= MOD;
                    long y = u - v; if (y < 0) y += MOD;
                    a[i + j] = x; a[i + j + half] = y;
                }
            }
        }
        if (inv) {
            long ni = pw(n, MOD - 2);
            for (int i = 0; i < n; i++) a[i] = a[i] * ni % MOD;
        }
    }
    static long[] mul(long[] a, long[] b, int lim) {
        int need = a.length + b.length - 1;
        int sz = 1; while (sz < need) sz <<= 1;
        long[] fa = Arrays.copyOf(a, sz), fb = Arrays.copyOf(b, sz);
        ntt(fa, false); ntt(fb, false);
        for (int i = 0; i < sz; i++) fa[i] = fa[i] * fb[i] % MOD;
        ntt(fa, true);
        return Arrays.copyOf(fa, lim);
    }
    static long[] inverse(long[] a, int n) {
        long[] b = new long[]{pw(a[0], MOD - 2)};
        int len = 1;
        while (len < n) {
            len <<= 1;
            long[] ac = Arrays.copyOf(a, Math.min(a.length, len));
            ac = Arrays.copyOf(ac, len);
            long[] t = mul(ac, b, len);   // a*b
            // b*(2 - a*b)
            for (int i = 0; i < len; i++) t[i] = (MOD - t[i]) % MOD;
            t[0] = (t[0] + 2) % MOD;
            b = mul(b, t, len);
        }
        return Arrays.copyOf(b, n);
    }
    static long[] sqrt(long[] a, int n) {
        long[] g = new long[]{1};
        long inv2 = (MOD + 1) / 2;
        int len = 1;
        while (len < n) {
            len <<= 1;
            long[] gi = inverse(Arrays.copyOf(g, len), len);
            long[] ac = Arrays.copyOf(a, len);
            long[] t = mul(ac, gi, len);
            long[] ng = new long[len];
            for (int i = 0; i < len; i++) {
                long gv = i < g.length ? g[i] : 0;
                ng[i] = (gv + t[i]) % MOD * inv2 % MOD;
            }
            g = ng;
        }
        return Arrays.copyOf(g, n);
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        int N = m + 1;
        long[] a = new long[N];
        a[0] = 1;
        for (int i = 0; i < n; i++) {
            st.nextToken(); int c = (int) st.nval;
            if (c <= m) a[c] = (a[c] + MOD - 4) % MOD;
        }
        long[] s = sqrt(a, N);
        s[0] = (s[0] + 1) % MOD;
        long[] f = inverse(s, N);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) sb.append(f[i] * 2 % MOD).append('\n');
        System.out.print(sb);
    }
}
