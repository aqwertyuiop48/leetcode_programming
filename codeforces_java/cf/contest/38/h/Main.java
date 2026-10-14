import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && Integer.valueOf(v[0]) instanceof Integer n
            && Integer.valueOf(v[1]) instanceof Integer m
            && Integer.valueOf(v[2 + 3 * m]) instanceof Integer g1
            && Integer.valueOf(v[3 + 3 * m]) instanceof Integer g2
            && Integer.valueOf(v[4 + 3 * m]) instanceof Integer s1
            && Integer.valueOf(v[5 + 3 * m]) instanceof Integer s2
            && new int[n][n] instanceof int[][] D
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (D[i][j] = i == j ? 0 : 1000000) >= 0))
            && IntStream.range(0, m).allMatch(e -> (D[v[2 + 3 * e] - 1][v[3 + 3 * e] - 1] = D[v[3 + 3 * e] - 1][v[2 + 3 * e] - 1] = v[4 + 3 * e]) > 0)
            && IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j ->
                (D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j])) >= 0)))
            && IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> j != i).map(j -> D[i][j]).min().getAsInt()).toArray() instanceof int[] lo
            && IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> j != i).map(j -> D[i][j]).max().getAsInt()).toArray() instanceof int[] hi
            && new long[g2 + 1][s2 + 1] instanceof long[][] z0
            && (z0[1][0] = 1L) > 0
            ? IntStream.range(0, n).boxed().flatMapToLong(a -> IntStream.range(0, n).filter(b -> b != a).mapToLong(b ->
                IntStream.range(0, n).filter(i -> i != a && i != b).boxed().reduce(z0, (dp, i) ->
                    new boolean[]{
                        lo[i] < lo[a] || lo[i] == lo[a] && i < a,
                        IntStream.range(0, n).anyMatch(j -> j != i && (lo[a] < D[i][j] || lo[a] == D[i][j] && a < i) && (D[i][j] < hi[b] || D[i][j] == hi[b] && i < b)),
                        hi[b] < hi[i] || hi[b] == hi[i] && b < i} instanceof boolean[] c
                    && new long[g2 + 1][s2 + 1] instanceof long[][] nd
                    && IntStream.rangeClosed(0, g2).allMatch(g -> IntStream.rangeClosed(0, s2).allMatch(s -> dp[g][s] == 0
                        || (!c[0] || g + 1 > g2 || (nd[g + 1][s] += dp[g][s]) >= 0)
                        && (!c[1] || s + 1 > s2 || (nd[g][s + 1] += dp[g][s]) >= 0)
                        && (!c[2] || (nd[g][s] += dp[g][s]) >= 0)))
                    ? nd : dp, (p, q) -> p) instanceof long[][] f
                ? IntStream.rangeClosed(g1, g2).mapToLong(g -> IntStream.rangeClosed(s1, s2).mapToLong(s -> f[g][s]).sum()).sum()
                : 0L)).sum()
            : 0L);
    }
}
