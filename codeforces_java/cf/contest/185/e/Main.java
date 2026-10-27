import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((nums[(int) st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Long.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf((int) nums[1]) instanceof Integer k
            && Integer.valueOf(n + k) instanceof Integer N
            && IntStream.range(0, N).mapToLong(t -> t < k ? nums[2 + 2 * n + 2 * t] : nums[2 + 2 * (t - k)]).toArray() instanceof long[] X
            && IntStream.range(0, N).mapToLong(t -> t < k ? nums[3 + 2 * n + 2 * t] : nums[3 + 2 * (t - k)]).toArray() instanceof long[] Y
            && LongStream.range(0, n).map(i -> Long.MAX_VALUE / 4).toArray() instanceof long[] dist
            && IntStream.range(0, N).mapToLong(t -> (((((X[t] + 100000000L) << 1) | (t >= k ? 1 : 0)) << 18) | t)).sorted().toArray() instanceof long[] xa1
            && IntStream.range(0, N).mapToLong(t -> (((((X[t] + 100000000L) << 1) | (t >= k ? 0 : 1)) << 18) | t)).sorted().toArray() instanceof long[] xa2
            && IntStream.range(0, N).mapToLong(t -> (((((Y[t] + 100000000L) << 1) | (t >= k ? 1 : 0)) << 18) | t)).sorted().toArray() instanceof long[] ya1
            && IntStream.range(0, N).mapToLong(t -> (((((Y[t] + 100000000L) << 1) | (t >= k ? 0 : 1)) << 18) | t)).sorted().toArray() instanceof long[] ya2
            && (k == 0 || IntStream.range(0, 4).allMatch(o ->
                (Long) (((o & 1) == 0) ? 1L : -1L) instanceof Long sx
                && (Long) (((o & 2) == 0) ? 1L : -1L) instanceof Long sy
                && IntStream.range(0, N).mapToLong(p -> sx == 1 ? xa1[p] : xa2[N - 1 - p]).toArray() instanceof long[] ev
                && IntStream.range(0, N).mapToLong(p -> sy == 1 ? ya1[p] : ya2[N - 1 - p]).toArray() instanceof long[] yk
                && new int[N] instanceof int[] rk
                && IntStream.range(0, N).allMatch(p -> (rk[(int) (yk[p] & 262143)] = p + 1) > 0)
                && LongStream.rangeClosed(0, N).map(p -> Long.MIN_VALUE / 4).toArray() instanceof long[] bit
                && Arrays.stream(ev).allMatch(e ->
                    (Integer) (int) (e & 262143) instanceof Integer t
                    && (t < k
                        ? IntStream.iterate(rk[t], p -> p <= N, p -> p + (p & -p)).allMatch(p -> (bit[p] = Math.max(bit[p], sx * X[t] + sy * Y[t])) != Long.MIN_VALUE)
                        : (Long) IntStream.iterate(rk[t], p -> p > 0, p -> p - (p & -p)).mapToLong(p -> bit[p]).max().orElse(Long.MIN_VALUE / 4) instanceof Long mx
                            && (mx < -1000000000000L || (dist[t - k] = Math.min(dist[t - k], sx * X[t] + sy * Y[t] - mx)) >= 0)))))
            && (k == 0 ? new long[n] : dist) instanceof long[] aa
            && IntStream.range(0, n).mapToLong(i -> ((1073741824L - aa[i]) << 17) | i).sorted().toArray() instanceof long[] srt
            && IntStream.range(0, n).mapToLong(j -> nums[2 + 2 * (int) (srt[j] & 131071)] + nums[3 + 2 * (int) (srt[j] & 131071)]).toArray() instanceof long[] sU
            && IntStream.range(0, n).mapToLong(j -> nums[2 + 2 * (int) (srt[j] & 131071)] - nums[3 + 2 * (int) (srt[j] & 131071)]).toArray() instanceof long[] sV
            && LongStream.rangeClosed(0, n).map(j -> j < n ? aa[(int) (srt[(int) j] & 131071)] : 0L).toArray() instanceof long[] sA
            && new long[n + 1] instanceof long[] pMaxU
            && new long[n + 1] instanceof long[] pMinU
            && new long[n + 1] instanceof long[] pMaxV
            && new long[n + 1] instanceof long[] pMinV
            && (pMaxU[0] = -4000000000L) < 0 && (pMinU[0] = 4000000000L) > 0
            && (pMaxV[0] = -4000000000L) < 0 && (pMinV[0] = 4000000000L) > 0
            && IntStream.range(0, n).allMatch(j ->
                (pMaxU[j + 1] = Math.max(pMaxU[j], sU[j])) > Long.MIN_VALUE
                && (pMinU[j + 1] = Math.min(pMinU[j], sU[j])) > Long.MIN_VALUE
                && (pMaxV[j + 1] = Math.max(pMaxV[j], sV[j])) > Long.MIN_VALUE
                && (pMinV[j + 1] = Math.min(pMinV[j], sV[j])) > Long.MIN_VALUE)
            && IntStream.range(0, k).mapToLong(t -> ((X[t] + Y[t] + 200000000L) << 17) | t).sorted().toArray() instanceof long[] sk
            && Arrays.stream(sk).map(e -> 2 * ((e >> 17) - 200000000L)).toArray() instanceof long[] SU2
            && Arrays.stream(sk).map(e -> 2 * (X[(int) (e & 131071)] - Y[(int) (e & 131071)])).toArray() instanceof long[] v2
            && IntStream.rangeClosed(0, 17).mapToObj(l ->
                LongStream.range(0, k).map(i -> ((i >> l) << 33) | (v2[(int) i] + 2147483648L)).sorted().map(x -> (x & 8589934591L) - 2147483648L).toArray()).toArray(long[][]::new) instanceof long[][] LV
            && ((Function<long[], Boolean>) h ->
                (Integer) (int) (h[1] << h[0]) instanceof Integer from
                && (Integer) (int) ((h[1] + 1) << h[0]) instanceof Integer to
                && (Integer) (-Arrays.binarySearch(LV[(int) h[0]], from, to, h[2]) - 1) instanceof Integer ins
                && ins < to && LV[(int) h[0]][ins] <= h[3]) instanceof Function<long[], Boolean> has
            && ((Function<long[], Boolean>) q ->
                (Integer) (-Arrays.binarySearch(SU2, 2 * q[0] - 1) - 1) instanceof Integer lo
                && (Integer) (-Arrays.binarySearch(SU2, 2 * q[1] + 1) - 1) instanceof Integer hi
                && new long[] {lo, hi} instanceof long[] s2
                && IntStream.range(0, 18).anyMatch(l ->
                    s2[0] < s2[1]
                    && (((s2[0] & 1) == 1 && has.apply(new long[] {l, s2[0]++, 2 * q[2] - 1, 2 * q[3]}))
                        || ((s2[1] & 1) == 1 && has.apply(new long[] {l, --s2[1], 2 * q[2] - 1, 2 * q[3]}))
                        || ((s2[0] >>= 1) + (s2[1] >>= 1) < 0)))) instanceof Function<long[], Boolean> exists
            && ((BiPredicate<Integer, Long>) (j, tt) ->
                (Long) (pMaxU[j] - tt) instanceof Long ul
                && (Long) (pMinU[j] + tt) instanceof Long uh
                && (Long) (pMaxV[j] - tt) instanceof Long vl
                && (Long) (pMinV[j] + tt) instanceof Long vh
                && ul <= uh && vl <= vh
                && (ul - uh != 0 || vl - vh != 0 || ((ul - vl) & 1) == 0)
                && (Long) (ul - uh == 0 && ((vl - ul) & 1) != 0 ? vl + 1 : vl) instanceof Long vl2
                && (Long) (ul - uh == 0 && ((vh - ul) & 1) != 0 ? vh - 1 : vh) instanceof Long vh2
                && (Long) (vl - vh == 0 && ((ul - vl) & 1) != 0 ? ul + 1 : ul) instanceof Long ul2
                && (Long) (vl - vh == 0 && ((uh - vl) & 1) != 0 ? uh - 1 : uh) instanceof Long uh2
                && (j - n == 0 || (tt >= sA[j]
                    && exists.apply(new long[] {ul2 - (tt - sA[j]), uh2 + (tt - sA[j]), vl2 - (tt - sA[j]), vh2 + (tt - sA[j])})))) instanceof BiPredicate<Integer, Long> feas
            && ((ToLongFunction<long[]>) w ->
                new long[] {w[1], w[2]} instanceof long[] bd
                && IntStream.range(0, 31).allMatch(s ->
                    bd[0] >= bd[1]
                    || (feas.test((int) w[0], (bd[0] + bd[1]) / 2)
                        ? (bd[1] = (bd[0] + bd[1]) / 2) >= 0
                        : (bd[0] = (bd[0] + bd[1]) / 2 + 1) >= 0))
                ? bd[0] : -1L) instanceof ToLongFunction<long[]> bsr
            && new long[] {bsr.applyAsLong(new long[] {n, 0, 400000000L})} instanceof long[] best
            && new java.util.Random(7).longs(n).toArray() instanceof long[] rnd
            && IntStream.range(0, n).mapToLong(j -> ((rnd[j] >>> 21) << 17) | j).sorted().toArray() instanceof long[] ord
            && (k == 0 || Arrays.stream(ord).allMatch(e ->
                (Integer) (int) (e & 131071) instanceof Integer j
                && (best[0] == 0 || !feas.test(j, best[0] - 1) || (best[0] = bsr.applyAsLong(new long[] {j, 0, best[0] - 1})) >= 0)))
            ? best[0]
            : 0L);
    }
}

