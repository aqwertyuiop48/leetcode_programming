import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(n ->
            System.out.println(
                ((BiFunction<Long, Integer, Long>) ((nn, d) -> nn >= d ? (nn - d) / 9 + 1 : 0L)) instanceof BiFunction<Long, Integer, Long> cnt
                && ((Function<Long, Integer>) (x -> (int) (1 + (x - 1) % 9))) instanceof Function<Long, Integer> dr
                && new long[]{0} instanceof long[] sum
                && Stream.iterate(1L, i -> i <= n, i -> n / (n / i) + 1)
                    .allMatch(i -> (sum[0] += (n / i) * (n / (n / i) - i + 1)) >= 0)
                ? IntStream.rangeClosed(1, 9).boxed()
                    .flatMap(dA -> IntStream.rangeClosed(1, 9).mapToObj(dB -> cnt.apply(n, dA) * cnt.apply(n, dB) * cnt.apply(n, dr.apply((long) dA * dB))))
                    .mapToLong(Long::longValue)
                    .sum() - sum[0]
                : 0L)));
    }
}





