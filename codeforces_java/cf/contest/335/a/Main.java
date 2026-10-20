import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && s.chars().map(c -> c - 'a').boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())) instanceof Map<Integer, Long> cnt
            ? IntStream.rangeClosed(1, s.length()).filter(k -> cnt.values().stream().mapToLong(c -> (c + k - 1) / k).sum() <= n).findFirst() instanceof OptionalInt ok && ok.isPresent()
                ? (cnt.entrySet().stream().map(e -> String.valueOf((char) ('a' + e.getKey())).repeat((int) ((e.getValue() + ok.getAsInt() - 1) / ok.getAsInt()))).collect(Collectors.joining()) instanceof String sheet
                    ? ok.getAsInt() + "\n" + sheet + "a".repeat(n - sheet.length()) : "") : "-1" : "");
    }
}
