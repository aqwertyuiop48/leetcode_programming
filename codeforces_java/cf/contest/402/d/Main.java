import java.util.*;
import java.io.*;

public class Main {
    static int[] primes;
    static HashSet<Integer> bad = new HashSet<>();

    static int f(int x) {
        int res = 0;
        for (int p : primes) {
            if ((long) p * p > x) break;
            if (x % p == 0) {
                int c = 0;
                while (x % p == 0) { x /= p; c++; }
                res += bad.contains(p) ? -c : c;
            }
        }
        if (x > 1) res += bad.contains(x) ? -1 : 1;
        return res;
    }

    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (int) st.nval; }
        for (int i = 0; i < m; i++) { st.nextToken(); bad.add((int) st.nval); }
        int L = 31700;
        boolean[] comp = new boolean[L + 1];
        ArrayList<Integer> pl = new ArrayList<>();
        for (int i = 2; i <= L; i++) {
            if (!comp[i]) { pl.add(i); for (long j = (long) i * i; j <= L; j += i) comp[(int) j] = true; }
        }
        primes = new int[pl.size()];
        for (int i = 0; i < primes.length; i++) primes[i] = pl.get(i);
        int[] g = new int[n];
        g[0] = a[0];
        for (int i = 1; i < n; i++) g[i] = gcd(g[i - 1], a[i]);
        int d = 1;
        long total = 0;
        for (int i = n - 1; i >= 0; i--) {
            int cur = g[i] / d;
            if (f(cur) < 0) d = g[i];
            total += f(a[i] / d);
        }
        System.out.println(total);
    }
}
