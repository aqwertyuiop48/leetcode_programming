import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.rangeClosed(1, m).boxed().sorted(Comparator.comparingInt((Integer b) -> Math.abs(2 * b - (m + 1))).thenComparingInt(b -> b)).toList() instanceof List<Integer> order
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(order.get(i % m))).collect(Collectors.joining("\n")) : "");
    }
}

