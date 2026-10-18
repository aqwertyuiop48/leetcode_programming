import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> s.next() instanceof String t && (Integer) s.nextInt() instanceof Integer k && t.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) instanceof Map<Integer, Long> m && new long[1] instanceof long[] a && m.entrySet().stream().sorted(Map.Entry.comparingByValue()).filter(e -> (a[0] += e.getValue()) <= k).map(Map.Entry::getKey).collect(Collectors.toSet()) instanceof Set<Integer> r ? (m.size() - r.size()) + "\n" + t.chars().filter(ch -> !r.contains(ch)).mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining()) : "").ifPresent(System.out::println);
    }
}
