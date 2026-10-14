import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            new int[]{25, 18, 15, 12, 10, 8, 6, 4, 2, 1} instanceof int[] pts
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> m
            && IntStream.range(0, s.nextInt()).allMatch(r -> IntStream.range(0, s.nextInt()).allMatch(pos ->
                m.computeIfAbsent(s.next(), k -> new long[51]) instanceof long[] a
                && (a[0] += pos < 10 ? pts[pos] : 0) >= 0
                && ++a[1 + pos] > 0))
            ? m.entrySet().stream().max(Map.Entry.comparingByValue((a, b) -> Arrays.compare(a, b))).get().getKey() + "\n"
                + m.entrySet().stream().max(Map.Entry.comparingByValue(
                    Comparator.<long[]>comparingLong(a -> a[1]).thenComparingLong(a -> a[0]).thenComparing((a, b) -> Arrays.compare(a, b)))).get().getKey()
            : ""));
    }
}

