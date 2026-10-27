import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new String[]{s.next(), s.next()}).ifPresent(st ->
            Optional.of(IntStream.range(0, s.nextInt()).mapToObj(i -> s.next()).map(r -> new int[]{r.charAt(0) - 'a', r.charAt(3) - 'a', r.charAt(4) - 'a'}).toList()).ifPresent(rules ->
                System.out.println(
                    ((Function<String, int[][]>) t -> new int[t.length()][t.length()] instanceof int[][] m
                        && IntStream.range(0, t.length()).allMatch(i -> (m[i][i] = 1 << (t.charAt(i) - 'a')) > 0)
                        && IntStream.rangeClosed(2, t.length()).allMatch(len -> IntStream.rangeClosed(0, t.length() - len).allMatch(i ->
                            (m[i][i + len - 1] = rules.stream()
                                .filter(r -> IntStream.range(i, i + len - 1).anyMatch(k -> (m[i][k] >> r[1] & 1) == 1 && (m[k + 1][i + len - 1] >> r[2] & 1) == 1))
                                .mapToInt(r -> 1 << r[0]).reduce(0, (x, y) -> x | y)) >= 0))
                        ? m : null) instanceof Function<String, int[][]> build
                    && build.apply(st[0]) instanceof int[][] m1
                    && build.apply(st[1]) instanceof int[][] m2
                    && new int[st[0].length() + 1][st[1].length() + 1] instanceof int[][] dp
                    && Arrays.stream(dp).allMatch(row -> IntStream.range(0, row.length).allMatch(j -> (row[j] = 1000000) > 0))
                    && (dp[0][0] = 0) == 0
                    && IntStream.rangeClosed(1, st[0].length()).allMatch(i -> IntStream.rangeClosed(1, st[1].length()).allMatch(j ->
                        (dp[i][j] = Math.min(1000000, IntStream.range(0, i).flatMap(a -> IntStream.range(0, j)
                            .filter(b -> (m1[a][i - 1] & m2[b][j - 1]) != 0).map(b -> dp[a][b] + 1)).min().orElse(1000000))) > 0))
                    ? (dp[st[0].length()][st[1].length()] >= 1000000 ? -1 : dp[st[0].length()][st[1].length()])
                    : -2))));
    }
}





