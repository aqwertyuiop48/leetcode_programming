import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s
            && new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} instanceof int[] dm
            && IntStream.rangeClosed(0, s.length() - 10).mapToObj(i -> s.substring(i, i + 10)).filter(t -> t.matches("\\d\\d-\\d\\d-201[345]")
                && Integer.valueOf(t.substring(3, 5)) instanceof Integer mo && mo >= 1 && mo <= 12 && Integer.valueOf(t.substring(0, 2)) instanceof Integer d && d >= 1 && d <= dm[mo - 1])
                .collect(Collectors.groupingBy(t -> t, Collectors.counting())) instanceof Map<String, Long> cnt
            ? cnt.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey() : "");
    }
}
