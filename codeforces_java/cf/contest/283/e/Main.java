import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && IntStream.range(0, n).map(i -> v[2 + i]).sorted().toArray() instanceof int[] s
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * n - 1))) instanceof Integer N
            && new int[2 * N + 2] instanceof int[] nlo && new int[2 * N + 2] instanceof int[] nhi
            && IntStream.range(1, 2 * N).allMatch(u -> (nlo[u] = (u - Integer.highestOneBit(u)) * (N / Integer.highestOneBit(u))) >= 0 && (nhi[u] = nlo[u] + N / Integer.highestOneBit(u) - 1) >= 0)
            && new int[2 * N + 2] instanceof int[] ones && new int[2 * N + 2] instanceof int[] fl
            && IntStream.range(0, m).map(t -> Arrays.binarySearch(s, v[2 + n + 2 * t]) >= 0 ? Arrays.binarySearch(s, v[2 + n + 2 * t]) : -Arrays.binarySearch(s, v[2 + n + 2 * t]) - 1).toArray() instanceof int[] Ls
            && IntStream.range(0, m).map(t -> Arrays.binarySearch(s, v[3 + n + 2 * t]) >= 0 ? Arrays.binarySearch(s, v[3 + n + 2 * t]) : -Arrays.binarySearch(s, v[3 + n + 2 * t]) - 2).toArray() instanceof int[] Rs
            && LongStream.concat(IntStream.range(0, m).filter(t -> Ls[t] <= Rs[t]).mapToLong(t -> ((long) Ls[t] << 20) | t),
                IntStream.range(0, m).filter(t -> Ls[t] <= Rs[t]).mapToLong(t -> ((long) (Rs[t] + 1) << 20) | t)).sorted().toArray() instanceof long[] ev
            && new AtomicReference<LongUnaryOperator>() instanceof AtomicReference<LongUnaryOperator> flipR && new AtomicReference<LongUnaryOperator>() instanceof AtomicReference<LongUnaryOperator> qryR
            && flipR.compareAndSet(null, x -> (int) ((x >> 17) & 131071) <= nlo[(int) ((x >>> 34) & 33554431)] && nhi[(int) ((x >>> 34) & 33554431)] <= (int) (x & 131071) ? (fl[(int) ((x >>> 34) & 33554431)] ^= 1) * 0L + (ones[(int) ((x >>> 34) & 33554431)] = nhi[(int) ((x >>> 34) & 33554431)] - nlo[(int) ((x >>> 34) & 33554431)] + 1 - ones[(int) ((x >>> 34) & 33554431)]) * 0L
                : ((int) ((x >> 17) & 131071) <= nhi[2 * (int) ((x >>> 34) & 33554431)] ? flipR.get().applyAsLong(x + ((long) (int) ((x >>> 34) & 33554431) << 34)) : 0L) + ((int) (x & 131071) >= nlo[2 * (int) ((x >>> 34) & 33554431) + 1] ? flipR.get().applyAsLong(x + ((long) (int) ((x >>> 34) & 33554431) << 34) + (1L << 34)) : 0L)
                    + (ones[(int) ((x >>> 34) & 33554431)] = fl[(int) ((x >>> 34) & 33554431)] == 1 ? nhi[(int) ((x >>> 34) & 33554431)] - nlo[(int) ((x >>> 34) & 33554431)] + 1 - (ones[2 * (int) ((x >>> 34) & 33554431)] + ones[2 * (int) ((x >>> 34) & 33554431) + 1]) : ones[2 * (int) ((x >>> 34) & 33554431)] + ones[2 * (int) ((x >>> 34) & 33554431) + 1]) * 0L)
            && qryR.compareAndSet(null, x -> (int) ((x >> 17) & 131071) <= nlo[(int) ((x >>> 34) & 33554431)] && nhi[(int) ((x >>> 34) & 33554431)] <= (int) (x & 131071) ? (((x >> 60) & 1) == 1 ? nhi[(int) ((x >>> 34) & 33554431)] - nlo[(int) ((x >>> 34) & 33554431)] + 1 - ones[(int) ((x >>> 34) & 33554431)] : ones[(int) ((x >>> 34) & 33554431)])
                : ((int) ((x >> 17) & 131071) <= nhi[2 * (int) ((x >>> 34) & 33554431)] ? qryR.get().applyAsLong((x ^ ((long) fl[(int) ((x >>> 34) & 33554431)] << 60)) + ((long) (int) ((x >>> 34) & 33554431) << 34)) : 0L) + ((int) (x & 131071) >= nlo[2 * (int) ((x >>> 34) & 33554431) + 1] ? qryR.get().applyAsLong((x ^ ((long) fl[(int) ((x >>> 34) & 33554431)] << 60)) + ((long) (int) ((x >>> 34) & 33554431) << 34) + (1L << 34)) : 0L))
            && flipR.get() instanceof LongUnaryOperator flip && qryR.get() instanceof LongUnaryOperator qry
            && new int[]{0} instanceof int[] ptr && new long[1] instanceof long[] sub
            && IntStream.range(0, n).allMatch(i -> IntStream.iterate(ptr[0], e -> e < ev.length && (ev[e] >> 20) == i, e -> e + 1).allMatch(e ->
                    flip.applyAsLong((1L << 34) | ((long) Ls[(int) (ev[e] & 1048575)] << 17) | Rs[(int) (ev[e] & 1048575)]) >= 0 && (ptr[0] = e + 1) > 0)
                && Long.valueOf(i - (i == 0 ? 0L : qry.applyAsLong((1L << 34) | (i - 1))) + (i == n - 1 ? 0L : qry.applyAsLong((1L << 34) | ((long) (i + 1) << 17) | (n - 1)))) instanceof Long w
                && (sub[0] += w * (w - 1) / 2) >= 0)
            ? Long.valueOf(n) * (n - 1) * (n - 2) / 6 - sub[0] : "");
    }
}
