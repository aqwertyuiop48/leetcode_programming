import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && new long[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53} instanceof long[] p
            && ((BinaryOperator<Long>) (x, y) -> x > Long.MAX_VALUE / y ? Long.MAX_VALUE : x * y) instanceof BinaryOperator<Long> mul
            && new AtomicReference<Function<int[], Long>>() instanceof AtomicReference<Function<int[], Long>> h
            && h.getAndSet(q -> q[1] == 1 ? 1L : IntStream.rangeClosed(2, q[1]).filter(d -> q[0] < 16 && q[1] % d == 0 && d - 1 <= q[2])
                .mapToObj(d -> mul.apply(LongStream.generate(() -> p[q[0]]).limit(d - 1).boxed().reduce(1L, mul),
                    h.get().apply(new int[]{q[0] + 1, q[1] / d, d - 1})))
                .min(Long::compare).orElse(Long.MAX_VALUE)) == null
            ? h.get().apply(new int[]{0, n, 1000})
            : Long.valueOf(0)));

    }
}




