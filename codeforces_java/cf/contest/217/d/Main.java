import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long P && new long[m + 1] instanceof long[] cnt
            && IntStream.range(0, k).allMatch(i -> Long.valueOf(sc.nextLong() % m) instanceof Long r && (r == 0 || cnt[(int) Math.min(r, m - r)]++ >= 0))
            && IntStream.rangeClosed(1, m / 2).filter(r -> cnt[r] > 0).toArray() instanceof int[] cl
            && BigInteger.ONE.shiftLeft(m).subtract(BigInteger.ONE) instanceof BigInteger full
            && new AtomicReference<BiFunction<BigInteger, Integer, Long>>() instanceof AtomicReference<BiFunction<BigInteger, Integer, Long>> f
            && f.compareAndSet(null, (T, i) -> (1 + IntStream.range(i, cl.length).filter(j -> !T.testBit(cl[j])).mapToLong(j -> Integer.valueOf(cl[j]) instanceof Integer r
                && T.or(T.shiftLeft(r).or(T.shiftRight(m - r))).or(T.shiftLeft(m - r).or(T.shiftRight(r))).and(full) instanceof BigInteger T2
                ? cnt[r] % P * f.get().apply(T2, j + 1) % P : 0).sum() % P) % P)
            ? f.get().apply(BigInteger.ONE, 0) : "");
    }
}
