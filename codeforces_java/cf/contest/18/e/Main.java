import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
                new String(System.in.readAllBytes()).replace((char) 13, (char) 32).replace((char) 10, (char) 32).trim().split(" +") instanceof String[] tk
                && (Integer) Integer.parseInt(tk[0]) instanceof Integer n
                && (Integer) Integer.parseInt(tk[1]) instanceof Integer m
                && Arrays.copyOfRange(tk, 2, 2 + n) instanceof String[] g
                && new int[n][26] instanceof int[][] ev
                && new int[n][26] instanceof int[][] od
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (j % 2 == 0 ? ev[i][g[i].charAt(j) - 'a']++ : od[i][g[i].charAt(j) - 'a']++) >= 0))
                && new long[n][676] instanceof long[][] dp
                && new int[n][676] instanceof int[][] par
                && IntStream.range(0, 676).allMatch(x -> (dp[0][x] = (m > 1 && x / 26 == x % 26) ? 1_000_000_000L : (m + 1) / 2 - ev[0][x / 26] + m / 2 - od[0][x % 26]) >= 0)
                && IntStream.range(1, n).allMatch(i ->
                    IntStream.range(0, 26).mapToObj(a -> LongStream.range(0, 26).map(b -> dp[i - 1][(int) (a * 26 + b)] << 10 | (a * 26 + b)).sorted().limit(2).toArray()).toArray(long[][]::new) instanceof long[][] rowBest
                    && IntStream.range(0, 26).mapToObj(c2 -> LongStream.range(0, 26).map(a ->
                            m > 1 && (rowBest[(int) a][0] & 1023) % 26 == c2 ? rowBest[(int) a][1] : rowBest[(int) a][0]).sorted().limit(2).toArray()).toArray(long[][]::new) instanceof long[][] colBest
                    && IntStream.range(0, 676).allMatch(x ->
                        (Long) ((colBest[x % 26][0] & 1023) / 26 == x / 26 ? colBest[x % 26][1] : colBest[x % 26][0]) instanceof Long t
                        && (dp[i][x] = (m > 1 && x / 26 == x % 26 ? 1_000_000_000L : (m + 1) / 2 - ev[i][x / 26] + m / 2 - od[i][x % 26]) + (t >> 10)) >= 0
                        && (par[i][x] = (int) (t & 1023)) >= 0))
                && (Long) IntStream.range(0, 676).mapToLong(x -> dp[n - 1][x] << 10 | x).min().getAsLong() instanceof Long best
                && new int[n] instanceof int[] cc
                && (cc[n - 1] = (int) (best & 1023)) >= 0
                && IntStream.range(1, n).map(k -> n - k).allMatch(i -> (cc[i - 1] = par[i][cc[i]]) >= 0)
                ? (best >> 10) + "\n" + IntStream.range(0, n).mapToObj(i ->
                    IntStream.range(0, m).mapToObj(j -> String.valueOf((char) ('a' + (j % 2 == 0 ? cc[i] / 26 : cc[i] % 26)))).collect(Collectors.joining()))
                    .collect(Collectors.joining("\n"))
                : "");
    }
}
