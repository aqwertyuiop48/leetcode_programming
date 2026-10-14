import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long inf
            && IntStream.range(0, m).mapToObj(x -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] es
            && IntStream.rangeClosed(0, n).mapToObj(i -> LongStream.rangeClosed(0, n).map(j -> i == j && i > 0 ? 0 : inf).toArray()).toArray(long[][]::new) instanceof long[][] d
            && IntStream.rangeClosed(0, n).map(v -> (int) Arrays.stream(es).mapToLong(x -> (x[0] == v ? 1 : 0) + (x[1] == v ? 1 : 0)).sum()).toArray() instanceof int[] deg
            && Arrays.stream(es).filter(x -> x[0] != x[1]).allMatch(x -> x[2] >= d[x[0]][x[1]] || (d[x[0]][x[1]] = d[x[1]][x[0]] = x[2]) == x[2])
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
                ? (dp[(1 << odd.length) - 1] >= inf ? -1L : Arrays.stream(es).mapToLong(x -> x[2]).sum() + dp[(1 << odd.length) - 1])
                : -1L)
            : -1L));
    }
}

