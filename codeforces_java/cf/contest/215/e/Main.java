import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long l && Long.valueOf(s.nextLong()) instanceof Long r
            && ((LongUnaryOperator) x -> x < 3 ? 0 : Integer.valueOf(64 - Long.numberOfLeadingZeros(x)) instanceof Integer L
                && new long[64] instanceof long[] f
                && IntStream.rangeClosed(1, 62).allMatch(d -> (f[d] = (1L << (d - 1)) - IntStream.range(1, d).filter(e -> d % e == 0).mapToLong(e -> f[e]).sum()) > 0)
                && new long[64] instanceof long[] g
                && IntStream.range(1, L).filter(d -> L % d == 0).allMatch(d -> Long.valueOf(x >> (L - d)) instanceof Long pre
                    && (g[d] = pre - (1L << (d - 1)) + (IntStream.range(1, L / d).mapToObj(i -> i).reduce(pre, (acc, i) -> acc << d | pre, (u, v) -> u) <= x ? 1 : 0)
                        - IntStream.range(1, d).filter(e -> d % e == 0).mapToLong(e -> g[e]).sum()) > Long.MIN_VALUE)
                ? IntStream.range(2, L).mapToLong(n -> IntStream.range(1, n).filter(d -> n % d == 0).mapToLong(d -> f[d]).sum()).sum()
                    + IntStream.range(1, L).filter(d -> L % d == 0).mapToLong(d -> g[d]).sum() : 0L) instanceof LongUnaryOperator F
            ? F.applyAsLong(r) - F.applyAsLong(l - 1) : "");
    }


}
