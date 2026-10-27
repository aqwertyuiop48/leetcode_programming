import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer k
            && (Long) ((1L << k) - 1) instanceof Long N
            && new long[]{N} instanceof long[] rem
            && LongStream.of(0, 1).flatMap(z -> z == 0
                ? LongStream.iterate(2, d -> d + 1).takeWhile(d -> d * d <= rem[0]).filter(d -> rem[0] % d == 0
                    && (rem[0] = LongStream.iterate(rem[0], r -> r % d == 0, r -> r / d).reduce((a, b) -> b).getAsLong() / d) > 0)
                : LongStream.of(rem[0]).filter(r -> r > 1)).toArray() instanceof long[] ps
            && ((LongFunction<Boolean>) low ->
                ((LongUnaryOperator) r -> ((r << 1) & N) ^ ((r >>> (k - 1) & 1) == 1 ? low : 0)) instanceof LongUnaryOperator sh
                && ((LongBinaryOperator) (a, b) -> IntStream.iterate(k - 1, i -> i >= 0, i -> i - 1).boxed()
                    .reduce(0L, (res, i) -> sh.applyAsLong(res) ^ ((b >> i & 1) == 1 ? a : 0L), (x, y) -> x)) instanceof LongBinaryOperator mul
                && ((LongUnaryOperator) e -> IntStream.iterate(50, i -> i >= 0, i -> i - 1).boxed()
                    .reduce(1L, (r, i) -> (e >> i & 1) == 1 ? sh.applyAsLong(mul.applyAsLong(r, r)) : mul.applyAsLong(r, r), (x, y) -> x)) instanceof LongUnaryOperator px
                && px.applyAsLong(N) == 1
                && Arrays.stream(ps).allMatch(p -> px.applyAsLong(N / p) != 1)) instanceof LongFunction<Boolean> prim
            && (Long) LongStream.iterate(1, c -> c + 2).filter(c -> prim.apply(c)).findFirst().getAsLong() instanceof Long low
            ? IntStream.rangeClosed(1, k).mapToObj(i -> String.valueOf(low >> (k - i) & 1)).collect(Collectors.joining(" "))
                + "\n" + IntStream.range(0, k).mapToObj(i -> "1").collect(Collectors.joining(" "))
            : ""));
    }
}





