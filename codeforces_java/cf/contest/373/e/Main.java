import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Long.valueOf(t[2]) instanceof Long d
            && new long[n + 1] instanceof long[] dp && new long[]{1, 0} instanceof long[] pt
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(t[3 + 3 * i]) instanceof Integer a && Long.valueOf(t[4 + 3 * i]) instanceof Long b && Long.valueOf(t[5 + 3 * i]) instanceof Long tm
                && Integer.valueOf((int) Math.min(n, d * (tm - pt[0]))) instanceof Integer w && (pt[0] = tm) > 0
                && Integer.valueOf(2 * w + 1) instanceof Integer k && Integer.valueOf(w >= n - 1 ? 1 : n + 2 * w) instanceof Integer L && Long.valueOf(Arrays.stream(dp, 1, n + 1).max().getAsLong()) instanceof Long mxAll
                && new long[L] instanceof long[] Q && new long[L] instanceof long[] g && new long[L] instanceof long[] h
                && IntStream.range(0, L).allMatch(j -> (Q[j] = j >= w && j < w + n ? dp[j - w + 1] : Long.MIN_VALUE / 4) == Q[j])
                && IntStream.range(0, L).allMatch(j -> (g[j] = j % k == 0 ? Q[j] : Math.max(g[j - 1], Q[j])) == g[j])
                && IntStream.iterate(L - 1, j -> j >= 0, j -> j - 1).allMatch(j -> (h[j] = j % k == k - 1 || j == L - 1 ? Q[j] : Math.max(h[j + 1], Q[j])) == h[j])
                && IntStream.rangeClosed(1, n).allMatch(x -> (dp[x] = (w >= n - 1 ? mxAll : Math.max(h[x - 1], g[x - 1 + 2 * w])) + b - Math.abs(a - x)) == dp[x]))
            ? Arrays.stream(dp, 1, n + 1).max().getAsLong() : "");
    }
}
