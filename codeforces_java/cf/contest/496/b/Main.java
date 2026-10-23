import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && sc.next() instanceof String s
            ? IntStream.range(0, n)
                .mapToObj(r -> IntStream.range(0, n)
                    .mapToObj(i -> (char) ('0' + (s.charAt((r + i) % n) - '0' + 10 - (s.charAt(r) - '0')) % 10))
                    .map(String::valueOf).collect(Collectors.joining()))
                .min(Comparator.naturalOrder()).get()
            : "");
    }
}
