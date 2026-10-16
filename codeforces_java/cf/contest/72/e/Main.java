import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                s.next() instanceof String t
                && IntStream.range(0, t.length()).boxed()
                    .flatMap(i -> IntStream.rangeClosed(i + 1, t.length()).mapToObj(j -> t.substring(i, j)))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) instanceof Map<String, Long> cnt
                ? cnt.entrySet().stream()
                    .max(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue)
                        .thenComparingInt(e -> e.getKey().length())
                        .thenComparing(Map.Entry::getKey))
                    .get().getKey()
                : ""));
    }
}



