import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(it.nextInt()) instanceof Integer k
            && Long.valueOf(1000000000000000000L) instanceof Long INF
            && new long[n + 2][n + 2] instanceof long[][] best && Arrays.stream(best).allMatch(row -> IntStream.range(0, n + 2).allMatch(i -> (row[i] = INF) > 0))
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.nextInt()) instanceof Integer l && Integer.valueOf(it.nextInt()) instanceof Integer r && Integer.valueOf(it.nextInt()) instanceof Integer c
                && (best[l][r] = Math.min(best[l][r], c)) > 0)
            && IntStream.rangeClosed(1, n).allMatch(l -> IntStream.iterate(n, r -> r >= l, r -> r - 1).allMatch(r -> (best[l][r] = Math.min(best[l][r], Math.min(best[l - 1][r], best[l][r + 1]))) > 0))
            && new long[n + 1][n + 1] instanceof long[][] dp && Arrays.stream(dp).allMatch(row -> IntStream.range(0, n + 1).allMatch(i -> (row[i] = INF) > 0)) && (dp[0][0] = 0) == 0
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(0, n).allMatch(j -> (dp[i][j] = Math.min(dp[i - 1][j],
                IntStream.range(Math.max(0, i - j), i).mapToLong(p -> dp[p][j - (i - p)] + best[p + 1][i]).min().orElse(INF))) >= 0))
            ? String.valueOf(IntStream.rangeClosed(k, n).mapToLong(j -> dp[n][j]).min().getAsLong() >= INF ? -1 : IntStream.rangeClosed(k, n).mapToLong(j -> dp[n][j]).min().getAsLong()) : "");
    }
}
