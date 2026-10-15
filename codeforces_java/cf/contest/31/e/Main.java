import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                (Integer) sc.nextInt() instanceof Integer n
                && sc.next().trim().chars().map(c -> c - '0').toArray() instanceof int[] a
                && LongStream.iterate(1, x -> x * 10).limit(n + 1).toArray() instanceof long[] pw
                && IntStream.rangeClosed(0, 2 * n).mapToObj(i -> LongStream.generate(() -> -1L).limit(n + 1).toArray()).toArray(long[][]::new) instanceof long[][] best
                && (best[2 * n][n] = 0) == 0
                && ((IntPredicate) (state -> true)) instanceof IntPredicate unused
                && ((BiFunction<Integer, Integer, Long>) (i, h) -> h < n && best[i + 1][h + 1] >= 0 ? a[i] * pw[n - 1 - h] + best[i + 1][h + 1] : -1L) instanceof BiFunction<Integer, Integer, Long> optH
                && ((BiFunction<Integer, Integer, Long>) (i, h) -> i - h < n && best[i + 1][h] >= 0 ? a[i] * pw[n - 1 - (i - h)] + best[i + 1][h] : -1L) instanceof BiFunction<Integer, Integer, Long> optM
                && IntStream.iterate(2 * n - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                    IntStream.rangeClosed(0, Math.min(i, n)).allMatch(h ->
                        (best[i][h] = Math.max(optH.apply(i, h), optM.apply(i, h))) >= -1))
                ? Stream.iterate(new int[]{0, 0}, s -> s[0] < 2 * n, s ->
                        optH.apply(s[0], s[1]) == best[s[0]][s[1]] ? new int[]{s[0] + 1, s[1] + 1} : new int[]{s[0] + 1, s[1]})
                    .map(s -> optH.apply(s[0], s[1]) == best[s[0]][s[1]] ? "H" : "M")
                    .collect(Collectors.joining())
                : ""));
    }
}
