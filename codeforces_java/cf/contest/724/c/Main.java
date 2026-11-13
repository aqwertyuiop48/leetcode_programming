import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Long.valueOf(a[0]) instanceof Long n && Long.valueOf(a[1]) instanceof Long m && Integer.valueOf((int) a[2]) instanceof Integer k
            && Long.valueOf(BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).longValue()) instanceof Long gg
            && Long.valueOf(n / gg * m) instanceof Long lim && Long.valueOf(2 * gg) instanceof Long g
            && Long.valueOf(n / gg) instanceof Long A && Long.valueOf(m / gg) instanceof Long M
            && Long.valueOf(M == 1 ? 0 : LongStream.range(1, M).filter(i -> i * A % M == 1).findFirst().getAsLong()) instanceof Long inv
            ? IntStream.range(0, k).mapToObj(i -> LongStream.of(a[3 + 2 * i], 2 * n - a[3 + 2 * i]).flatMap(aa -> LongStream.of(a[4 + 2 * i], 2 * m - a[4 + 2 * i])
                    .filter(bb -> Math.floorMod(bb - aa, g) == 0).map(bb -> aa + 2 * n * Math.floorMod((bb - aa) / g * inv, M))).filter(tt -> tt < lim).min()
                    instanceof OptionalLong o && o.isPresent() ? "" + o.getAsLong() : "-1").collect(Collectors.joining("\n")) : "");
    }
}
