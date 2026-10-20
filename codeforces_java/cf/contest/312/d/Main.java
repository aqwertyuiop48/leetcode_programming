import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it
            && ((LongSupplier) () -> Long.parseLong(it.next())) instanceof LongSupplier nl
            && Integer.valueOf((int) nl.getAsLong()) instanceof Integer n && Integer.valueOf((int) nl.getAsLong()) instanceof Integer m && Integer.valueOf((int) nl.getAsLong()) instanceof Integer p
            && new long[n + 1] instanceof long[] D && IntStream.rangeClosed(2, n).allMatch(h -> (D[h] = D[h - 1] + nl.getAsLong()) >= 0)
            && LongStream.range(0, m).map(i -> -D[(int) nl.getAsLong()] + nl.getAsLong()).sorted().toArray() instanceof long[] a
            && new long[m + 1] instanceof long[] S && IntStream.rangeClosed(1, m).allMatch(i -> (S[i] = S[i - 1] + a[i - 1]) > Long.MIN_VALUE)
            && Long.valueOf(1000000000000000000L) instanceof Long INF
            && new long[m + 1] instanceof long[] dp0 && new long[m + 1] instanceof long[] dp1
            && IntStream.rangeClosed(1, m).allMatch(i -> (dp0[i] = INF) > 0)
            && new long[m + 2] instanceof long[] qk && new long[m + 2] instanceof long[] qb && new int[1] instanceof int[] hd && new int[1] instanceof int[] tl
            && ((ToIntFunction<long[]>) q -> Math.multiplyHigh(q[0], q[1]) != Math.multiplyHigh(q[2], q[3])
                ? Long.compare(Math.multiplyHigh(q[0], q[1]), Math.multiplyHigh(q[2], q[3])) : Long.compareUnsigned(q[0] * q[1], q[2] * q[3])) instanceof ToIntFunction<long[]> cmp
            && IntStream.rangeClosed(1, p).allMatch(layer -> (hd[0] = 0) == 0 && (tl[0] = 0) == 0 && (dp1[0] = 0) == 0
                && IntStream.rangeClosed(1, m).map(i -> ((dp0[i - 1] >= INF || (Long.valueOf(-(i - 1)) instanceof Long k && Long.valueOf(dp0[i - 1] + S[i - 1]) instanceof Long b
                        && IntStream.generate(() -> 0).anyMatch(z -> tl[0] - hd[0] < 2
                            || cmp.applyAsInt(new long[]{b - qb[tl[0] - 2], qk[tl[0] - 2] - qk[tl[0] - 1], qb[tl[0] - 1] - qb[tl[0] - 2], qk[tl[0] - 2] - k}) > 0
                            || (tl[0] -= 1) < 0)
                        && (qk[tl[0]] = k) < Long.MAX_VALUE && (qb[tl[0]++] = b) < Long.MAX_VALUE))
                    && Long.valueOf(a[i - 1]) instanceof Long x
                    && IntStream.generate(() -> 0).anyMatch(z -> hd[0] + 1 >= tl[0] || qk[hd[0] + 1] * x + qb[hd[0] + 1] > qk[hd[0]] * x + qb[hd[0]] || (hd[0] += 1) < 0)
                    && (dp1[i] = x * i - S[i] + qk[hd[0]] * x + qb[hd[0]]) > Long.MIN_VALUE) ? 0 : 1).sum() == 0
                && IntStream.rangeClosed(0, m).allMatch(i -> (dp0[i] = dp1[i]) > Long.MIN_VALUE))
            ? String.valueOf(dp0[m]) : "");
    }
}
