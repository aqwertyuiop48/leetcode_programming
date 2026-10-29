import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] dg
            && IntStream.rangeClosed(0, 6).map(j -> IntStream.range(0, j).reduce(1, (x, y) -> x * k)).toArray() instanceof int[] P
            && ((Predicate<String>) t -> t.length() == 1 || t.charAt(0) != '0' && Integer.parseInt(t) <= 255) instanceof Predicate<String> ok
            && IntStream.rangeClosed(4, 12).boxed().flatMap(len -> Integer.valueOf((len + 1) / 2) instanceof Integer half
                ? IntStream.range(0, P[half]).filter(i -> IntStream.range(0, half).map(j -> 1 << (i / P[j] % k)).reduce(0, (x, y) -> x | y) == (1 << k) - 1)
                    .mapToObj(i -> IntStream.range(0, half).mapToObj(j -> "" + dg[i / P[j] % k]).collect(Collectors.joining()))
                    .map(h -> h + new StringBuilder(len % 2 == 1 ? h.substring(0, half - 1) : h).reverse())
                    .flatMap(p -> IntStream.range(0, 27).filter(x -> Integer.valueOf(len - x / 9 - x / 3 % 3 - x % 3 - 3) instanceof Integer d && d >= 1 && d <= 3)
                        .mapToObj(x -> Integer.valueOf(x / 9 + 1) instanceof Integer a && Integer.valueOf(x / 3 % 3 + 1) instanceof Integer b && Integer.valueOf(x % 3 + 1) instanceof Integer c
                            ? List.of(p.substring(0, a), p.substring(a, a + b), p.substring(a + b, a + b + c), p.substring(a + b + c)) : List.<String>of())
                        .filter(parts -> parts.stream().allMatch(ok)).map(parts -> String.join(".", parts)))
                : Stream.<String>empty()).sorted().toList() instanceof List<String> res
            ? res.size() + (res.isEmpty() ? "" : "\n" + String.join("\n", res)) : "");
    }
}

