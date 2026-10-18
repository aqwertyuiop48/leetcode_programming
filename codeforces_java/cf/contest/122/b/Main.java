import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String s
            && IntStream.range(0, s.length()).boxed()
                .flatMap(i -> IntStream.rangeClosed(i + 1, s.length()).mapToObj(j -> s.substring(i, j)))
                .filter(t -> t.chars().allMatch(c -> c == '4' || c == '7'))
                .collect(Collectors.groupingBy(t -> t, Collectors.counting())) instanceof Map<String, Long> m
            && !m.isEmpty()
            ? m.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .findFirst().get().getKey()
            : "-1");
    }
}
