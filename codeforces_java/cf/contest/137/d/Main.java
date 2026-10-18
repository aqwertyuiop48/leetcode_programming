import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && sc.next().toCharArray() instanceof char[] c
            && Integer.valueOf(c.length) instanceof Integer n
            && Integer.valueOf(Math.min(sc.nextInt(), n)) instanceof Integer k
            && new int[n + 1][n + 1] instanceof int[][] cost
            && IntStream.rangeClosed(2, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(i ->
                (cost[i][i + len] = (c[i] != c[i + len - 1] ? 1 : 0) + cost[i + 1][i + len - 1]) >= 0))
            && new int[k + 1][n + 1] instanceof int[][] dp
            && new int[k + 1][n + 1] instanceof int[][] par
            && Arrays.stream(dp).allMatch(r -> (r[0] = 1000000) > 0 && IntStream.rangeClosed(1, n).allMatch(j -> (r[j] = 1000000) > 0))
            && (dp[0][0] = 0) == 0
            && IntStream.rangeClosed(1, k).allMatch(m -> IntStream.rangeClosed(1, n).allMatch(j ->
                Long.valueOf(IntStream.range(0, j).mapToLong(i -> ((long) (dp[m - 1][i] + cost[i][j]) << 12) | i).min().getAsLong()) instanceof Long b
                && (dp[m][j] = (int) (b >> 12)) >= 0
                && (par[m][j] = (int) (b & 4095)) >= 0))
            && IntStream.rangeClosed(1, k).boxed().min(Comparator.comparingInt(m -> dp[m][n])).get() instanceof Integer bm
            ? dp[bm][n] + "\n" + Stream.iterate(new int[]{n, bm}, st -> st[1] > 0, st -> new int[]{par[st[1]][st[0]], st[1] - 1})
                .map(st -> new int[]{par[st[1]][st[0]], st[0]})
                .sorted(Comparator.comparingInt(p -> p[0]))
                .map(p -> IntStream.range(p[0], p[1]).mapToObj(t -> String.valueOf(c[Math.min(t, p[0] + p[1] - 1 - t)])).collect(Collectors.joining()))
                .collect(Collectors.joining("+"))
            : "");
    }
}
