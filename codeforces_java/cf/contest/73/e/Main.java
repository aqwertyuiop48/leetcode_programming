import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Long.valueOf(s.nextLong()) instanceof Long x
                && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
                && ((LongPredicate) v -> v >= 2 && LongStream.rangeClosed(2, (long) Math.sqrt(v)).noneMatch(d -> v % d == 0)) instanceof LongPredicate pr
                ? (x == 2
                    ? 0L
                    : LongStream.of(a).anyMatch(v -> v == 1)
                        ? 1L
                        : x - 1 > 1300000
                            ? -1L
                            : LongStream.rangeClosed(2, x - 1).filter(pr).count() == LongStream.of(a).filter(v -> v <= x - 1 && pr.test(v)).distinct().count()
                                ? LongStream.rangeClosed(2, x - 1).filter(pr).count()
                                : -1L)
                : 0L));
    }
}

