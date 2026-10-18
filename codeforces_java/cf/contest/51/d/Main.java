import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                LongStream.generate(s::nextLong).limit(n).toArray() instanceof long[] a
                && ((Predicate<long[]>) b -> b.length < 2 || (b[0] == 0 ? LongStream.of(b).allMatch(x -> x == 0) : IntStream.range(2, b.length).allMatch(i -> b[i] * b[0] == b[i - 1] * b[1]))) instanceof Predicate<long[]> g
                ? (g.test(a) ? 0
                    : IntStream.of(0, 1,
                        IntStream.range(2, n).filter(i -> a[i] * a[0] != a[i - 1] * a[1]).findFirst().orElse(0),
                        IntStream.range(0, n).filter(i -> a[i] != 0).findFirst().orElse(0))
                        .filter(k -> k < n)
                        .anyMatch(k -> g.test(IntStream.range(0, n).filter(i -> i != k).mapToLong(i -> a[i]).toArray())) ? 1 : 2)
                : 0)));
    }
}




