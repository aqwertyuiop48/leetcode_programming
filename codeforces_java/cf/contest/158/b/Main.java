import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())) instanceof Map<Integer, Long> c
            && Long.valueOf(Math.max(0, c.getOrDefault(1, 0L) - c.getOrDefault(3, 0L) - (c.getOrDefault(2, 0L) % 2 == 1 ? 2 : 0))) instanceof Long ones
            ? c.getOrDefault(4, 0L) + c.getOrDefault(3, 0L) + c.getOrDefault(2, 0L) / 2 + c.getOrDefault(2, 0L) % 2 + (ones + 3) / 4
            : 0);
    }
}

