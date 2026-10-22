import java.util.*;
import java.io.*;

public class Main {
    static long[][] C = new long[70][70];

    // numbers in [0, x] with exactly k ones
    static long cnt(long x, int k) {
        if (x < 0) return 0;
        long res = 0;
        int ones = 0;
        for (int b = 62; b >= 0; b--) {
            if (((x >> b) & 1L) != 0) {
                int need = k - ones;
                if (need >= 0 && need <= b) res += C[b][need];
                ones++;
            }
        }
        if (ones == k) res++;
        return res;
    }

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 70; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) C[i][j] = C[i - 1][j - 1] + (j <= i - 1 ? C[i - 1][j] : 0);
        }
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long n = Long.parseLong(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long lo = 1, hi = 1000000000000000000L;
        while (lo < hi) {
            long mid = (lo + hi) >>> 1;
            long c = cnt(2 * mid, k) - cnt(mid, k);
            if (c >= n) hi = mid;
            else lo = mid + 1;
        }
        System.out.println(lo);
    }
}
