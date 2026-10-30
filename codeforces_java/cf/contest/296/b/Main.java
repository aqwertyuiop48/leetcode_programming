import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String a && sc.next() instanceof String b
            && a.chars().map(c -> c == '?' ? -1 : c - '0').toArray() instanceof int[] x && b.chars().map(c -> c == '?' ? -1 : c - '0').toArray() instanceof int[] y
            && ((Function<IntToLongFunction, Long>) f -> IntStream.range(0, n).mapToLong(f).reduce(1L, (p, q) -> p * q % 1000000007L)) instanceof Function<IntToLongFunction, Long> prod
            ? Math.floorMod(prod.apply(i -> (x[i] < 0 ? 10 : 1) * (y[i] < 0 ? 10 : 1))
                - prod.apply(i -> x[i] < 0 && y[i] < 0 ? 55 : x[i] < 0 ? y[i] + 1 : y[i] < 0 ? 10 - x[i] : x[i] <= y[i] ? 1 : 0)
                - prod.apply(i -> x[i] < 0 && y[i] < 0 ? 55 : x[i] < 0 ? 10 - y[i] : y[i] < 0 ? x[i] + 1 : x[i] >= y[i] ? 1 : 0)
                + prod.apply(i -> x[i] < 0 && y[i] < 0 ? 10 : x[i] < 0 || y[i] < 0 ? 1 : x[i] == y[i] ? 1 : 0), 1000000007L) : "");
    }
}
