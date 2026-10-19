import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n
            && Long.valueOf(sc.nextLong()) instanceof Long s
            && new long[6] instanceof long[] c
            && LongStream.range(0, n).allMatch(i -> c[(int) sc.nextLong()]++ >= 0)
            && Long.valueOf(c[3]) instanceof Long c3
            && Long.valueOf(c[4]) instanceof Long c4
            && Long.valueOf(c[5]) instanceof Long c5
            && Long.valueOf(BigInteger.valueOf(c3).gcd(BigInteger.valueOf(c5)).longValue()) instanceof Long g
            && Long.valueOf(c5 / g) instanceof Long m
            && Long.valueOf(BigInteger.valueOf(c3 / g).modInverse(BigInteger.valueOf(m)).longValue()) instanceof Long inv
            && new long[]{Long.MAX_VALUE, -1, -1, -1} instanceof long[] best
            && LongStream.rangeClosed(0, s / c4).allMatch(k4 ->
                Long.valueOf(c4 * k4) instanceof Long a
                && Long.valueOf(s - a) instanceof Long r0
                && r0 % g == 0
                && r0 - c5 * k4 >= 0
                && Long.valueOf(Math.min(k4, (r0 - c5 * k4) / c3)) instanceof Long kk
                && Long.valueOf(((r0 / g) % m) * inv % m) instanceof Long r
                && r <= kk
                && Long.valueOf((Math.min(a, r0 - a) + c3 - 1) / c3) instanceof Long lo
                && Long.valueOf(Math.min(lo + ((r - lo) % m + m) % m, r + (kk - r) / m * m)) instanceof Long p
                && LongStream.of(p, p - m).filter(x -> x >= 0).allMatch(k3 ->
                    Long.valueOf(Math.abs(c3 * k3 - a) + Math.abs(a - (r0 - c3 * k3))) instanceof Long f
                    && (f >= best[0]
                        || ((best[0] = f) >= 0
                            && (best[1] = k3) >= 0
                            && (best[2] = k4) >= 0
                            && (best[3] = (r0 - c3 * k3) / c5) >= 0)))
                || true)
            ? (best[0] == Long.MAX_VALUE ? "-1" : best[1] + " " + best[2] + " " + best[3]) : "");
    }
}
