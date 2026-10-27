import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer k && sc.next() instanceof String s
            && s.chars().boxed().collect(Collectors.groupingBy(c -> c, TreeMap::new, Collectors.counting())) instanceof Map<Integer, Long> cnt
            ? cnt.values().stream().anyMatch(c -> c % k != 0) ? "-1"
                : cnt.entrySet().stream().map(e -> String.valueOf((char) (int) e.getKey()).repeat((int) (e.getValue() / k))).collect(Collectors.joining()).repeat(k) : "");
    }
}

