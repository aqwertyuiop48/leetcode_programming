import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer k
            && tk[2] instanceof String s
            && new long[n + 1][k + 1] instanceof long[][] dp && new long[k + 1] instanceof long[] cum && (dp[0][0] = 1) > 0 && (cum[0] = 1) > 0
            && IntStream.rangeClosed(1, n).allMatch(p -> Integer.valueOf(s.charAt(p - 1) - 'a') instanceof Integer c1 && Integer.valueOf(n - p + 1) instanceof Integer d && new long[k + 1] instanceof long[] acc
                && (IntStream.rangeClosed(1, Math.min(p, k / d)).allMatch(t -> dp[p - t] instanceof long[] row && Integer.valueOf(t * d) instanceof Integer sh && IntStream.rangeClosed(sh, k).allMatch(j -> (acc[j] += row[j - sh]) >= 0)))
                && IntStream.rangeClosed(0, k).allMatch(j -> (dp[p][j] = c1 * cum[j] + (25 - c1) * acc[j]) >= 0 && (dp[p][j] -= (long) (dp[p][j] * (1.0 / 1000000007)) * 1000000007L) > Long.MIN_VALUE && (dp[p][j] += dp[p][j] < 0 ? 1000000007L : dp[p][j] >= 1000000007L ? -1000000007L : 0) >= 0)
                && IntStream.rangeClosed(0, k).allMatch(j -> (cum[j] += dp[p][j]) >= 0 & (cum[j] < 1000000007L || (cum[j] -= 1000000007L) >= 0)))
            ? IntStream.rangeClosed(0, n).mapToLong(q -> dp[q][k]).sum() % 1000000007L : "");
    }
}

