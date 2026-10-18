import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long a
            && ((BiFunction<Long, Long, Long>) (n, m) -> BigInteger.valueOf(m) instanceof BigInteger bm
                ? IntStream.iterate(63 - Long.numberOfLeadingZeros(Math.max(n, 1)), i -> i >= 0, i -> i - 1).boxed()
                    .reduce(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE}, (st, i) -> st[0].multiply(st[1].shiftLeft(1).subtract(st[0])).mod(bm) instanceof BigInteger c
                        && st[0].multiply(st[0]).add(st[1].multiply(st[1])).mod(bm) instanceof BigInteger d
                        ? (n >> i & 1) == 1 ? new BigInteger[]{d, c.add(d).mod(bm)} : new BigInteger[]{c, d} : st, (x, y) -> x)[0].longValue()
                : 0L) instanceof BiFunction<Long, Long, Long> fib
            ? IntStream.rangeClosed(2, 13).boxed().reduce(
                    LongStream.range(0, 60).filter(n -> fib.apply(n, 10L) == a % 10).boxed().toList(),
                    (cands, k) -> Long.valueOf(Math.round(Math.pow(10, k))) instanceof Long M
                        && Long.valueOf(k <= 3 ? 5 : 10) instanceof Long f
                        && Long.valueOf(k == 2 ? 60 : k == 3 ? 300 : 15 * Math.round(Math.pow(10, k - 2))) instanceof Long P
                        ? cands.stream().flatMap(c -> LongStream.range(0, f).map(j -> c + j * P).boxed()).filter(n -> fib.apply(n, M) == a % M).toList() : cands,
                    (x, y) -> x).stream().min(Long::compare).map(Object::toString).orElse("-1")
            : "");
    }
}
