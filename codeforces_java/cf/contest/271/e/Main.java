import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long m
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> s.nextLong() - 1).reduce(0, (x, y) -> y == 0 ? x : x == 0 ? y : java.math.BigInteger.valueOf(x).gcd(java.math.BigInteger.valueOf(y)).longValue())) instanceof Long g
            ? g == 0 ? m * (m - 1) / 2
                : LongStream.rangeClosed(1, 31623).filter(d -> g % d == 0).boxed().flatMap(d -> Stream.of(d, g / d)).distinct().filter(d -> d % 2 == 1)
                    .mapToLong(d -> LongStream.iterate(d, D -> D < m, D -> D * 2).map(D -> m - D).sum()).sum() : "");
    }
}
