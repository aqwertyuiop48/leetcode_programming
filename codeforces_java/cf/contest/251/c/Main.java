import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long a && Long.valueOf(sc.nextLong()) instanceof Long b && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf((int) IntStream.rangeClosed(2, k).asLongStream().reduce(1, (x, y) -> x / java.math.BigInteger.valueOf(x).gcd(java.math.BigInteger.valueOf(y)).longValue() * y)) instanceof Integer L
            && ((BiFunction<Integer, Integer, Long>) (hi, lo) -> new int[L + 1] instanceof int[] d
                && IntStream.range(0, L + 1).allMatch(i -> (d[i] = 1 << 29) > 0) && (d[hi] = 0) == 0
                && IntStream.iterate(hi, i -> i > lo, i -> i - 1).allMatch(i -> (d[i - 1] = Math.min(d[i - 1], d[i] + 1)) > 0
                    && IntStream.rangeClosed(2, k).allMatch(x -> i - i % x < lo || (d[i - i % x] = Math.min(d[i - i % x], d[i] + 1)) >= 0))
                ? (long) d[lo] : 0L) instanceof BiFunction<Integer, Integer, Long> f
            ? a / L == b / L ? f.apply((int) (a % L), (int) (b % L))
                : f.apply((int) (a % L), 0) + (a / L - b / L - 1) * f.apply(L, 0) + f.apply(L, (int) (b % L)) : "");
    }
}
