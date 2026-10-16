import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer n
            && (Integer) sc.nextInt() instanceof Integer m
            && new long[n] instanceof long[] a
            && new long[n] instanceof long[] b
            && IntStream.range(0, n).allMatch(i -> (a[i] = sc.nextLong()) >= 0 && (b[i] = sc.nextLong()) >= 0)
            ? IntStream.range(0, m).mapToObj(q ->
                (Integer) sc.nextInt() instanceof Integer l
                && (Integer) sc.nextInt() instanceof Integer r
                && (Long) sc.nextLong() instanceof Long t
                ? String.valueOf(IntStream.rangeClosed(l, r).boxed().max(
                    Comparator.comparingLong((Integer i) -> a[i - 1] + b[i - 1] * t)
                        .thenComparingLong(i -> b[i - 1]).thenComparingInt(i -> i)).get())
                : "").collect(Collectors.joining("\n"))
            : ""));
    }
}



