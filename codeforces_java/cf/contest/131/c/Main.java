import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.<BiFunction<Integer, Integer, Long>>of((n, k) -> LongStream.rangeClosed(1, k).reduce(1L, (r, i) -> r * (n - k + i) / i)).ifPresent(c -> Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.print(IntStream.rangeClosed(4, a[2] - 1).mapToLong(b -> c.apply(a[0], b) * c.apply(a[1], a[2] - b)).sum()))));
    }
}
