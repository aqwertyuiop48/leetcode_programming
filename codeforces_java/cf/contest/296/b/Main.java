import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String a && sc.next() instanceof String b && Long.valueOf(1000000007L) instanceof Long M
            && ((BiFunction<Integer, BiPredicate<Integer, Integer>, Long>) (i, f) -> IntStream.range(0, 10).filter(x -> a.charAt(i) == '?' || a.charAt(i) - '0' == x).mapToLong(x -> IntStream.range(0, 10).filter(y -> (b.charAt(i) == '?' || b.charAt(i) - '0' == y) && f.test(x, y)).count()).sum()) instanceof BiFunction<Integer, BiPredicate<Integer, Integer>, Long> cnt
            && ((Function<BiPredicate<Integer, Integer>, Long>) f -> IntStream.range(0, n).mapToLong(i -> cnt.apply(i, f)).reduce(1, (p, q) -> p * q % M)) instanceof Function<BiPredicate<Integer, Integer>, Long> prod
            ? Math.floorMod(prod.apply((x, y) -> true) - prod.apply((x, y) -> x <= y) - prod.apply((x, y) -> x >= y) + prod.apply((x, y) -> x.equals(y)), M) : "");
    }
}

