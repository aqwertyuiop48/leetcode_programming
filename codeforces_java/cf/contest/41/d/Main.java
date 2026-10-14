import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt() + 1) instanceof Integer K
            && IntStream.range(0, n).mapToObj(i -> s.next()).map(r -> r.chars().map(ch -> ch - '0').toArray()).toArray(int[][]::new) instanceof int[][] g
            && new int[n][m][K] instanceof int[][][] dp
            && IntStream.range(0, m).allMatch(j -> (dp[n - 1][j][g[n - 1][j] % K] = g[n - 1][j] + 1) > 0)
            && IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(0, m).allMatch(j -> IntStream.range(0, K).allMatch(r ->
                Optional.of(Math.max(j > 0 ? dp[i + 1][j - 1][r] : 0, j < m - 1 ? dp[i + 1][j + 1][r] : 0))
                    .map(c -> c == 0 || (dp[i][j][(r + g[i][j]) % K] = Math.max(dp[i][j][(r + g[i][j]) % K], c + g[i][j])) > 0).get())))
            && Integer.valueOf(Arrays.stream(dp[0]).mapToInt(x -> x[0]).max().getAsInt()) instanceof Integer best && best > 0
            && Integer.valueOf(IntStream.range(0, m).filter(j -> dp[0][j][0] == best).findFirst().getAsInt()) instanceof Integer j0
            && new int[]{j0, 0, best} instanceof int[] st
            && IntStream.range(0, n - 1).mapToObj(i ->
                Integer.valueOf(g[i][st[0]]) instanceof Integer d
                && Integer.valueOf(((st[1] - d) % K + K) % K) instanceof Integer rp
                && Integer.valueOf(st[2] - d) instanceof Integer vp
                && Integer.valueOf(st[0] > 0 && dp[i + 1][st[0] - 1][rp] == vp ? st[0] - 1 : st[0] + 1) instanceof Integer jp
                && Integer.valueOf(jp < st[0] ? 1 : 0) instanceof Integer isR
                && (st[0] = jp) >= 0 && (st[1] = rp) >= 0 && (st[2] = vp) >= 0
                ? (isR == 1 ? "R" : "L") : "").collect(Collectors.joining()) instanceof String path
            ? (best - 1) + "\n" + (st[0] + 1) + "\n" + new StringBuilder(path).reverse() : "-1"));
    }
}
