import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long l
            && Long.valueOf(sc.nextLong()) instanceof Long r
            && Long.valueOf(sc.nextLong()) instanceof Long k
            && ((Function<long[], String>) e ->
                LongStream.of(e).reduce(0, (a, b) -> a ^ b) + "\n" + e.length + "\n" + LongStream.of(e).mapToObj(Long::toString).collect(Collectors.joining(" "))) instanceof Function<long[], String> fmt
            && Long.valueOf(l + (l & 1)) instanceof Long ev
            ? r - l + 1 <= 4
                ? IntStream.range(1, 1 << (r - l + 1)).filter(m -> Integer.bitCount(m) <= k).boxed().min(Comparator.comparingLong(m ->
                    IntStream.range(0, 4).filter(i -> (m >> i & 1) == 1).mapToLong(i -> l + i).reduce(0, (a, b) -> a ^ b)))
                    .map(m -> fmt.apply(IntStream.range(0, 4).filter(i -> (m >> i & 1) == 1).mapToLong(i -> l + i).toArray())).get()
                : k == 1 ? fmt.apply(new long[]{l})
                : k == 2 ? fmt.apply(new long[]{ev, ev + 1})
                : k == 3
                    ? IntStream.rangeClosed(0, 40)
                        .filter(bb -> (1L << bb) <= r
                            && Math.min(r, (2L << bb) - 1) - (1L << bb) >= 1
                            && (1L << (64 - Long.numberOfLeadingZeros(Math.min(r, (2L << bb) - 1) - (1L << bb)))) - 1 >= l)
                        .mapToObj(bb -> new long[]{
                            (1L << (64 - Long.numberOfLeadingZeros(Math.min(r, (2L << bb) - 1) - (1L << bb)))) - 1,
                            (1L << bb) + (1L << (63 - Long.numberOfLeadingZeros(Math.min(r, (2L << bb) - 1) - (1L << bb)))),
                            (1L << bb) + (1L << (63 - Long.numberOfLeadingZeros(Math.min(r, (2L << bb) - 1) - (1L << bb)))) - 1})
                        .findFirst().map(fmt).orElse(fmt.apply(new long[]{ev, ev + 1}))
                    : fmt.apply(new long[]{ev, ev + 1, ev + 2, ev + 3})
            : "");
    }
}
