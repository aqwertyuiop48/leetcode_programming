import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(mx ->
            Optional.of(s.nextInt()).ifPresent(my ->
            Optional.of(s.nextLong()).ifPresent(w ->
            Optional.of(IntStream.rangeClosed(0, Math.max(mx, my)).map(a -> a == 0 ? 0 : Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString())).toArray()).ifPresent(rv ->
            Optional.of(IntStream.rangeClosed(0, Math.max(mx, my)).mapToLong(a -> a == 0 ? 0 : (a / BigInteger.valueOf(a).gcd(BigInteger.valueOf(rv[a])).intValue()) * 1000003L + rv[a] / BigInteger.valueOf(a).gcd(BigInteger.valueOf(rv[a])).intValue()).toArray()).ifPresent(ka ->
            Optional.of(IntStream.rangeClosed(0, Math.max(mx, my)).mapToLong(a -> a == 0 ? 0 : (rv[a] / BigInteger.valueOf(a).gcd(BigInteger.valueOf(rv[a])).intValue()) * 1000003L + a / BigInteger.valueOf(a).gcd(BigInteger.valueOf(rv[a])).intValue()).toArray()).ifPresent(kb ->
            Optional.of(new HashMap<Long, Long>()).ifPresent(ca ->
            Optional.of(new HashMap<Long, Long>()).ifPresent(cb ->
            Optional.of(new long[]{0, my, Long.MAX_VALUE, -1, -1}).ifPresent(st ->
                System.out.print(IntStream.rangeClosed(1, my).allMatch(b -> cb.merge(kb[b], 1L, Long::sum) > 0)
                    && IntStream.rangeClosed(1, mx).allMatch(x -> (st[0] += cb.getOrDefault(ka[x], 0L)) >= 0 & ca.merge(ka[x], 1L, Long::sum) > 0
                        & Stream.generate(() -> 0).takeWhile(z -> st[1] > 0 && st[0] - ca.getOrDefault(kb[(int) st[1]], 0L) >= w && ((st[0] -= ca.getOrDefault(kb[(int) st[1]], 0L)) >= 0 & cb.merge(kb[(int) st[1]], -1L, Long::sum) >= 0 & --st[1] >= 0)).count() >= 0
                        & (st[0] >= w && x * st[1] <= st[2] ? (st[2] = x * st[1]) > 0 & (st[3] = x) > 0 & (st[4] = st[1]) > 0 : true))
                    ? (st[3] < 0 ? "-1" : st[3] + " " + st[4]) : "")))))))))));
    }
}


