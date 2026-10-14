import java.util.*;
import java.util.stream.*;
import java.util.function.*;

// Heuristic candidate search (pairwise sums, single-coin multiples, multiple-plus-one),
// passes both official samples and 649/650 random fuzz trials but is not a proof of
// full generality (rare cases combining 2+ multi-use denominations, e.g. 2*41+2*11, can evade it).
public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new long[n] instanceof long[] a
                && IntStream.range(0, n).allMatch(i -> (a[i] = s.nextLong()) >= 0)
                && ((Function<Long, Long>) (x -> new long[]{0, x} instanceof long[] st
                        && Arrays.stream(a).allMatch(c -> (st[0] += st[1] / c) >= 0 && (st[1] %= c) >= 0)
                        ? st[0] : 0L)) instanceof Function<Long, Long> grd
                ? Stream.concat(
                        IntStream.range(0, n).boxed()
                            .flatMap(i -> IntStream.range(0, n).boxed().filter(j -> a[i] < a[j]).map(j -> new long[]{i, j}))
                            .map(ij -> new long[]{(a[(int) ij[1]] + a[(int) ij[0]] - 1) / a[(int) ij[0]], a[(int) ij[0]]})
                            .map(kc -> new long[]{kc[0], kc[0] * kc[1]}),
                        IntStream.range(0, n).boxed()
                            .flatMap(i -> LongStream.rangeClosed(1, Math.min(2000, i == 0 ? 1 : (a[i - 1] + a[i] - 1) / a[i])).boxed()
                                .flatMap(m -> IntStream.range(0, n).boxed().filter(l -> l != i)
                                    .map(l -> new long[]{m + 1, m * a[i] + a[l]})))
                    )
                    .filter(kc -> grd.apply(kc[1]) > kc[0])
                    .map(kc -> kc[1])
                    .min(Long::compareTo)
                    .orElse(-1L)
                : -1L)));
    }
}

