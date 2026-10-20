import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b
            && ((BiFunction<Integer, Integer, Long>) (x, p) -> IntStream.iterate(x, v -> v % p == 0, v -> v / p).count()) instanceof BiFunction<Integer, Integer, Long> ex
            && ((BiFunction<Integer, Integer, Integer>) (x, z) -> IntStream.of(2, 3, 5).reduce(x, (v, p) -> IntStream.iterate(v, w -> w % p == 0, w -> w / p).reduce(v, (u, w) -> w / p))) instanceof BiFunction<Integer, Integer, Integer> rest
            ? rest.apply(a, 0).equals(rest.apply(b, 0)) ? IntStream.of(2, 3, 5).mapToLong(p -> Math.abs(ex.apply(a, p) - ex.apply(b, p))).sum() : -1 : "");
    }
}
