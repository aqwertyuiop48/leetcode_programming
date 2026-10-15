import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer a0 && Integer.valueOf(s.nextInt()) instanceof Integer b0 && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(IntStream.iterate(1, x -> x + 1).filter(x -> (long) x * x >= n).findFirst().getAsInt()) instanceof Integer sq
            && new int[sq + 1][34] instanceof int[][] t
            && ((BiPredicate<Integer, Integer>) (a, b) -> LongStream.range(0, b).reduce(1L, (x, i) -> Math.min(x * a, n)) >= n) instanceof BiPredicate<Integer, Integer> ge
            && ((BiFunction<Integer, Integer, Integer>) (a, b) -> b == 1 && a >= sq ? ((n - 1 - a) % 2 == 1 ? 1 : -1) : t[a][b]) instanceof BiFunction<Integer, Integer, Integer> v
            && ((BiFunction<Integer, Integer, Integer>) (a, b) -> ge.test(a, b) ? -1 : -v.apply(a, b)) instanceof BiFunction<Integer, Integer, Integer> mv
            && IntStream.iterate(sq - 1, a -> a >= 1, a -> a - 1).allMatch(a -> IntStream.iterate(32, b -> b >= 1, b -> b - 1).allMatch(b ->
                (t[a][b] = a == 1 && ge.test(2, b) ? 0 : Math.max(mv.apply(a + 1, b), mv.apply(a, b + 1))) > -5))
            ? (v.apply(a0, b0) == 1 ? "Masha" : v.apply(a0, b0) == -1 ? "Stas" : "Missing") : ""));
    }
}



