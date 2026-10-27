import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Long) s.nextLong() instanceof Long m
            && (Long) s.nextLong() instanceof Long k
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            ? n % 2 == 0
                ? 0
                : Math.min(IntStream.range(0, n).filter(i -> i % 2 == 0).mapToLong(i -> a[i]).min().getAsLong(), m / ((n + 1) / 2) * k)
            : 0));
    }
}





