import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(8 * n) instanceof Integer SC && new int[SC + 2][] instanceof int[][] S && new int[4 * n] instanceof int[] f
            && new int[2] instanceof int[] qp && new int[1] instanceof int[] ua && new int[]{-1} instanceof int[] cur
            && IntStream.range(0, SC + 2).allMatch(i -> (S[i] = new int[8]) != null)
            && ((LongPredicate) p -> S[(int) (p >> 40 & 0xFFFFF)] instanceof int[] o && S[(int) (p >> 20 & 0xFFFFF)] instanceof int[] x && S[(int) (p & 0xFFFFF)] instanceof int[] y
                && (o[0] = x[0] + y[0]) != Integer.MIN_VALUE
                && (o[1] = x[0] + y[1] > x[1] ? x[0] + y[1] : x[1]) != Integer.MIN_VALUE && (o[2] = x[0] + y[1] > x[1] ? y[2] : x[2]) != Integer.MIN_VALUE
                && (o[3] = y[0] + x[3] > y[3] ? y[0] + x[3] : y[3]) != Integer.MIN_VALUE && (o[4] = y[0] + x[3] > y[3] ? x[4] : y[4]) != Integer.MIN_VALUE
                && (o[5] = Math.max(Math.max(x[5], y[5]), x[3] + y[1])) != Integer.MIN_VALUE
                && (o[6] = x[3] + y[1] == o[5] ? x[4] : x[5] == o[5] ? x[6] : y[6]) != Integer.MIN_VALUE && (o[7] = x[3] + y[1] == o[5] ? y[2] : x[5] == o[5] ? x[7] : y[7]) != Integer.MIN_VALUE) instanceof LongPredicate mg
            && ((IntPredicate) v -> mg.test((long) (2 * v) << 40 | (long) (4 * v + f[2 * v]) << 20 | (4 * v + 2 + f[2 * v + 1]))
                && mg.test((long) (2 * v + 1) << 40 | (long) (4 * v + (1 ^ f[2 * v])) << 20 | (4 * v + 2 + (1 ^ f[2 * v + 1])))) instanceof IntPredicate pull
            && ((Predicate<int[]>) q -> (S[2 * q[0] + q[3]] = new int[]{q[2], q[2], q[1], q[2], q[1], q[2], q[1], q[1]}) != null && (S[2 * q[0] + 1 - q[3]] = new int[]{-q[2], -q[2], q[1], -q[2], q[1], -q[2], q[1], q[1]}) != null) instanceof Predicate<int[]> leaf
            && new AtomicReference<LongPredicate>() instanceof AtomicReference<LongPredicate> build && new AtomicReference<LongPredicate>() instanceof AtomicReference<LongPredicate> upd
            && new AtomicReference<LongPredicate>() instanceof AtomicReference<LongPredicate> frange && new AtomicReference<LongPredicate>() instanceof AtomicReference<LongPredicate> qry
            && build.compareAndSet(null, p -> (int) (p >> 20 & 0xFFFFF) == (int) (p & 0xFFFFF) ? leaf.test(new int[]{(int) (p >> 40 & 0xFFFFF), (int) (p >> 20 & 0xFFFFF), a[(int) (p >> 20 & 0xFFFFF)], 0})
                : build.get().test((long) (2 * (int) (p >> 40 & 0xFFFFF)) << 40 | (p >> 20 & 0xFFFFF) << 20 | ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2)
                    && build.get().test((long) (2 * (int) (p >> 40 & 0xFFFFF) + 1) << 40 | (long) (((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 + 1) << 20 | (p & 0xFFFFF))
                    && pull.test((int) (p >> 40 & 0xFFFFF)))
            && upd.compareAndSet(null, p -> (int) (p >> 20 & 0xFFFFF) == (int) (p & 0xFFFFF) ? leaf.test(new int[]{(int) (p >> 40 & 0xFFFFF), (int) (p >> 20 & 0xFFFFF), a[(int) (p >> 20 & 0xFFFFF)], (int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)]})
                : upd.get().test(ua[0] <= ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2
                        ? (long) (2 * (int) (p >> 40 & 0xFFFFF)) << 40 | (p >> 20 & 0xFFFFF) << 20 | ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 | (long) ((int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)]) << 60
                        : (long) (2 * (int) (p >> 40 & 0xFFFFF) + 1) << 40 | (long) (((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 + 1) << 20 | (p & 0xFFFFF) | (long) ((int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)]) << 60)
                    && pull.test((int) (p >> 40 & 0xFFFFF)))
            && frange.compareAndSet(null, p -> qp[0] <= (int) (p >> 20 & 0xFFFFF) && (int) (p & 0xFFFFF) <= qp[1] ? (f[(int) (p >> 40 & 0xFFFFF)] ^= 1) >= 0
                : (qp[0] > ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 || frange.get().test((long) (2 * (int) (p >> 40 & 0xFFFFF)) << 40 | (p >> 20 & 0xFFFFF) << 20 | ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2))
                    && (qp[1] <= ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 || frange.get().test((long) (2 * (int) (p >> 40 & 0xFFFFF) + 1) << 40 | (long) (((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 + 1) << 20 | (p & 0xFFFFF)))
                    && pull.test((int) (p >> 40 & 0xFFFFF)))
            && qry.compareAndSet(null, p -> qp[0] <= (int) (p >> 20 & 0xFFFFF) && (int) (p & 0xFFFFF) <= qp[1]
                ? cur[0] < 0 ? IntStream.range(0, 8).allMatch(i -> (S[SC][i] = S[2 * (int) (p >> 40 & 0xFFFFF) + ((int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)])][i]) != Integer.MIN_VALUE) && (cur[0] = 0) == 0
                    : mg.test((long) (SC + 1 - cur[0]) << 40 | (long) (SC + cur[0]) << 20 | (2 * (int) (p >> 40 & 0xFFFFF) + ((int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)]))) && (cur[0] = 1 - cur[0]) >= 0
                : (qp[0] > ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 || qry.get().test((long) (2 * (int) (p >> 40 & 0xFFFFF)) << 40 | (p >> 20 & 0xFFFFF) << 20 | ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 | (long) ((int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)]) << 60))
                    && (qp[1] <= ((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 || qry.get().test((long) (2 * (int) (p >> 40 & 0xFFFFF) + 1) << 40 | (long) (((int) (p >> 20 & 0xFFFFF) + (int) (p & 0xFFFFF)) / 2 + 1) << 20 | (p & 0xFFFFF) | (long) ((int) (p >> 60 & 1) ^ f[(int) (p >> 40 & 0xFFFFF)]) << 60)))
            && build.get().test(1L << 40 | n - 1)
            && Integer.valueOf(it.nextInt()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(qi -> it.nextInt() == 0
                ? (ua[0] = it.nextInt() - 1) >= 0 && (a[ua[0]] = it.nextInt()) != Integer.MIN_VALUE && upd.get().test(1L << 40 | n - 1) ? (String) null : (String) null
                : Integer.valueOf(it.nextInt() - 1) instanceof Integer l && Integer.valueOf(it.nextInt() - 1) instanceof Integer r && Integer.valueOf(it.nextInt()) instanceof Integer k
                    && new ArrayList<int[]>() instanceof ArrayList<int[]> done && new long[]{0} instanceof long[] ans
                    && (IntStream.range(0, k).allMatch(z -> (qp[0] = l) >= 0 && (qp[1] = r) >= 0 && (cur[0] = -1) < 0 && qry.get().test(1L << 40 | n - 1) && S[SC + cur[0]] instanceof int[] res && res[5] > 0
                        && (ans[0] += res[5]) > 0 && done.add(new int[]{res[6], res[7]}) && (qp[0] = res[6]) >= 0 && (qp[1] = res[7]) >= 0 && frange.get().test(1L << 40 | n - 1)) || true)
                    && done.stream().allMatch(d -> (qp[0] = d[0]) >= 0 && (qp[1] = d[1]) >= 0 && frange.get().test(1L << 40 | n - 1))
                    ? String.valueOf(ans[0]) : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
