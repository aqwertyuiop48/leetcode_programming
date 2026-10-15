import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && s.next() instanceof String t
            && Boolean.valueOf(n % 2 == 1) instanceof Boolean odd
            && Integer.valueOf(Math.max(0, (n - 3) / 4)) instanceof Integer b
            ? IntStream.range(0, odd ? (n - 3) / 2 + 1 : n / 2)
                .mapToObj(i -> t.substring(2 * i + (odd && i > b ? 1 : 0), 2 * i + (odd && i > b ? 1 : 0) + (odd && i == b ? 3 : 2)))
                .collect(Collectors.joining("-"))
            : ""));
    }
}


