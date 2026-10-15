import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long inf
            && new long[n + 1][n + 1] instanceof long[][] d
            && Arrays.stream(d).allMatch(r -> IntStream.range(0, n + 1).allMatch(j -> (r[j] = inf) > 0))
            && new int[n + 1] instanceof int[] deg
            && new long[1] instanceof long[] tot
            && IntStream.range(0, m).allMatch(e ->
                (tot[0] += t[4 + 3 * e]) >= 0
                && ++deg[t[2 + 3 * e]] + ++deg[t[3 + 3 * e]] > 0
                && (t[2 + 3 * e] == t[3 + 3 * e] || t[4 + 3 * e] >= d[t[2 + 3 * e]][t[3 + 3 * e]]
                    || (d[t[2 + 3 * e]][t[3 + 3 * e]] = d[t[3 + 3 * e]][t[2 + 3 * e]] = t[4 + 3 * e]) > 0))
            && IntStream.rangeClosed(1, n).allMatch(i -> (d[i][i] = 0) == 0)
            && IntStream.rangeClosed(1, n).allMatch(k -> IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, n).allMatch(j ->
                d[i][k] + d[k][j] >= d[i][j] || (d[i][j] = d[i][k] + d[k][j]) >= 0)))
            && IntStream.rangeClosed(1, n).filter(i -> deg[i] % 2 == 1).toArray() instanceof int[] odd
            && IntStream.range(0, 1 << odd.length).mapToLong(i -> i == 0 ? 0 : inf).toArray() instanceof long[] dp
            && IntStream.range(0, 1 << odd.length).allMatch(mask ->
                Integer.valueOf(Integer.numberOfTrailingZeros(~mask)) instanceof Integer f && f < odd.length && dp[mask] < inf
                ? IntStream.range(f + 1, odd.length).filter(b -> (mask >> b & 1) == 0).allMatch(b ->
                    dp[mask] + d[odd[f]][odd[b]] >= dp[mask | 1 << f | 1 << b]
                    || (dp[mask | 1 << f | 1 << b] = dp[mask] + d[odd[f]][odd[b]]) >= 0)
                : true)
            ? (IntStream.rangeClosed(1, n).allMatch(v -> deg[v] == 0 || d[1][v] < inf)
                ? (dp[(1 << odd.length) - 1] >= inf ? -1L : tot[0] + dp[(1 << odd.length) - 1])
                : -1L)
            : -1L);
    }
}
