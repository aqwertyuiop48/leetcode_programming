import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Long.valueOf(t[2]) instanceof Long d
            && new long[n + 2] instanceof long[] dp && new long[n + 2] instanceof long[] g && new long[n + 2] instanceof long[] hr && new long[]{1} instanceof long[] pt && new int[3] instanceof int[] cn
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(t[3 + 3 * i]) instanceof Integer a && Long.valueOf(t[4 + 3 * i]) instanceof Long b && Long.valueOf(t[5 + 3 * i]) instanceof Long tm
                && Integer.valueOf((int) Math.min(n, d * (tm - pt[0]))) instanceof Integer w && (pt[0] = tm) > 0
                && Integer.valueOf(2 * w + 1) instanceof Integer k && Boolean.valueOf(w >= n - 1) instanceof Boolean full && Integer.valueOf((n - 1) % k) instanceof Integer e0
                && Long.valueOf(full ? Arrays.stream(dp, 1, n + 1).max().getAsLong() : 0L) instanceof Long mxAll
                && (full || Stream.of(0).peek(z -> Arrays.setAll(g, j -> j < 1 || j > n ? 0L : (cn[0] = j == 1 || cn[0] + 1 == k ? 0 : cn[0] + 1) == 0 ? dp[j] : Math.max(g[j - 1], dp[j]))).findFirst().isPresent()
                    && Stream.of(0).peek(z -> Arrays.setAll(hr, q -> q < 1 || q > n ? 0L : (cn[1] = q == 1 ? e0 : cn[1] == 0 ? k - 1 : cn[1] - 1) == k - 1 || q == 1 ? dp[n + 1 - q] : Math.max(hr[q - 1], dp[n + 1 - q]))).findFirst().isPresent())
                && Stream.of(0).peek(z -> Arrays.setAll(dp, x -> x < 1 || x > n ? 0L
                    : (cn[2] = x <= w + 1 ? 0 : cn[2] + 1 == k ? 0 : cn[2] + 1) < 0 ? 0L
                    : (full ? mxAll : cn[2] + Math.min(n, x + w) - Math.max(1, x - w) >= k ? Math.max(hr[n + 1 - Math.max(1, x - w)], g[Math.min(n, x + w)]) : cn[2] == 0 ? g[Math.min(n, x + w)] : hr[n + 1 - Math.max(1, x - w)]) + b - Math.abs(a - x))).findFirst().isPresent())
            ? Arrays.stream(dp, 1, n + 1).max().getAsLong() : "");
    }
}

