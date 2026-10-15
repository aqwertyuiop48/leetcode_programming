import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                Integer.valueOf(nm[0]) instanceof Integer n
                && Integer.valueOf(nm[1]) instanceof Integer m
                && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
                && new int[n][26] instanceof int[][] ev
                && new int[n][26] instanceof int[][] od
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (j % 2 == 0 ? ev[i][g[i].charAt(j) - 'a']++ : od[i][g[i].charAt(j) - 'a']++) >= 0))
                && new long[n][26][26] instanceof long[][][] dp
                && new int[n][26][26] instanceof int[][][] par
                && IntStream.range(0, n).allMatch(i ->
                    new long[26][26] instanceof long[][] h
                    && (i == 0 || IntStream.range(0, 26).allMatch(a -> IntStream.range(0, 26).allMatch(c2 ->
                        (h[a][c2] = IntStream.range(0, 26).filter(b -> m == 1 || b != c2).mapToLong(b -> dp[i - 1][a][b] * 26 + b).min().getAsLong()) >= 0)))
                    && IntStream.range(0, 26).allMatch(c1 -> IntStream.range(0, 26).allMatch(c2 ->
                        Long.valueOf(i == 0 ? 0L : IntStream.range(0, 26).filter(a -> a != c1).mapToLong(a -> h[a][c2] / 26 * 676 + a * 26 + h[a][c2] % 26).min().getAsLong()) instanceof Long key
                        && (dp[i][c1][c2] = (m > 1 && c1 == c2) ? 1_000_000_000L : (i == 0 ? 0L : key / 676) + (m + 1) / 2 - ev[i][c1] + m / 2 - od[i][c2]) >= 0
                        && (par[i][c1][c2] = (int) (key % 676)) >= 0)))
                && Long.valueOf(IntStream.range(0, 676).mapToLong(x -> dp[n - 1][x / 26][x % 26] * 676 + x).min().getAsLong()) instanceof Long best
                && new int[n] instanceof int[] cc
                && (cc[n - 1] = (int) (best % 676)) >= 0
                && IntStream.range(1, n).map(k -> n - k).allMatch(i -> (cc[i - 1] = par[i][cc[i] / 26][cc[i] % 26]) >= 0)
                ? best / 676 + "\n" + IntStream.range(0, n).mapToObj(i ->
                    IntStream.range(0, m).mapToObj(j -> String.valueOf((char) ('a' + (j % 2 == 0 ? cc[i] / 26 : cc[i] % 26)))).collect(Collectors.joining()))
                    .collect(Collectors.joining("\n"))
                : "")));
    }
}


