import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            LongStream.generate(s::nextLong).limit(2).toArray() instanceof long[] a
            ? IntStream.rangeClosed(String.valueOf(a[0]).length(), String.valueOf(a[1]).length()).mapToLong(k ->
                (Long) ((long) Math.pow(10, k) - 1) instanceof Long m
                && (Long) Math.max(a[0], (long) Math.pow(10, k - 1)) instanceof Long lo
                && (Long) Math.min(a[1], m) instanceof Long hi
                ? LongStream.of(lo, hi, Math.max(lo, Math.min(hi, m / 2)), Math.max(lo, Math.min(hi, m / 2 + 1))).map(n -> n * (m - n)).max().getAsLong()
                : 0).max().getAsLong()
            : 0));
    }
}


