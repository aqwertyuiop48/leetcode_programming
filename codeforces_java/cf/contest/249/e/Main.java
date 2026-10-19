import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && ((LongFunction<BigInteger>) n -> BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).multiply(BigInteger.valueOf(2 * n + 1)).divide(BigInteger.valueOf(6))) instanceof LongFunction<BigInteger> s2
            && ((BiFunction<Long, Long, BigInteger>) (X, Y) -> Long.valueOf(Math.min(X, Y)) instanceof Long m
                && BigInteger.valueOf(m * m) instanceof BigInteger q
                && BigInteger.valueOf(m * (m + 1) / 2) instanceof BigInteger tri
                ? q.multiply(q.add(BigInteger.ONE)).shiftRight(1).add(X > Y
                    ? BigInteger.valueOf(m).multiply(s2.apply(X).subtract(s2.apply(m)).add(BigInteger.valueOf(X - m))).subtract(tri.multiply(BigInteger.valueOf(X - m)))
                    : BigInteger.valueOf(X).multiply(s2.apply(Y - 1).subtract(s2.apply(m - 1))).add(BigInteger.valueOf(X * (X + 1) / 2).multiply(BigInteger.valueOf(Y - m))))
                : BigInteger.ZERO) instanceof BiFunction<Long, Long, BigInteger> f
            ? IntStream.range(0, (int) a[0]).mapToObj(i -> f.apply(a[4 * i + 3], a[4 * i + 4]).subtract(f.apply(a[4 * i + 1] - 1, a[4 * i + 4])).subtract(f.apply(a[4 * i + 3], a[4 * i + 2] - 1)).add(f.apply(a[4 * i + 1] - 1, a[4 * i + 2] - 1)).toString() instanceof String r
                ? r.length() <= 10 ? r : "..." + r.substring(r.length() - 10) : "").collect(Collectors.joining("\n")) : "");
    }
}
