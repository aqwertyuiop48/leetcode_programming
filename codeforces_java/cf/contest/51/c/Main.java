import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                LongStream.generate(s::nextLong).limit(n).sorted().toArray() instanceof long[] a
                && ((LongFunction<long[]>) D -> Stream.of(new long[]{Long.MIN_VALUE / 2}).flatMapToLong(c -> LongStream.of(a).filter(x -> x > c[0] + D && (c[0] = x) == x)).toArray()) instanceof LongFunction<long[]> f
                && new long[]{-1} instanceof long[] lo
                && IntStream.iterate(31, b -> b >= 0, b -> b - 1).allMatch(b -> (lo[0] += f.apply(lo[0] + (1L << b)).length > 3 ? 1L << b : 0) > -2)
                && f.apply(lo[0] + 1) instanceof long[] st
                ? String.format(Locale.US, "%.6f", (lo[0] + 1) / 2.0) + "\n"
                    + IntStream.range(0, 3).mapToObj(i -> String.format(Locale.US, "%.6f", st[Math.min(i, st.length - 1)] + (lo[0] + 1) / 2.0)).collect(Collectors.joining(" "))
                : "")));
    }
}



