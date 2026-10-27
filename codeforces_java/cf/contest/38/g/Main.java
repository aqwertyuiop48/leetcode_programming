import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v
            && new int[3] instanceof int[] rs
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (rs[0] = rs[0] * 10 + raw[i] - '0') >= 0 && (rs[2] = 1) > 0
                    : (rs[2] != 1 || ((v[rs[1]++] = rs[0]) >= 0 && (rs[0] = 0) == 0)) && (rs[2] = 0) == 0)
            && (Integer) v[0] instanceof Integer n
            && new int[n + 1] instanceof int[] lc
            && new int[n + 1] instanceof int[] rc
            && new int[n + 1] instanceof int[] sz
            && new int[n + 1] instanceof int[] mx
            && new int[n + 1] instanceof int[] out
            && new Random(20240607L).ints(n + 1).toArray() instanceof int[] pri
            && (mx[0] = Integer.MIN_VALUE) < 0
            && new int[]{0, 0, 0} instanceof int[] cell
            && ((IntPredicate) t -> (sz[t] = sz[lc[t]] + sz[rc[t]] + 1) > 0
                && (mx[t] = Math.max(v[1 + 2 * (t - 1)], Math.max(mx[lc[t]], mx[rc[t]]))) > Integer.MIN_VALUE) instanceof IntPredicate upd
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> merge
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> split
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> find
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> ord
            && merge.compareAndSet(null, (a, b) ->
                a == 0 ? b : b == 0 ? a
                : pri[a] > pri[b]
                    ? (rc[a] = merge.get().applyAsInt(rc[a], b)) >= 0 && upd.test(a) ? a : 0
                    : (lc[b] = merge.get().applyAsInt(a, lc[b])) >= 0 && upd.test(b) ? b : 0)
            && split.compareAndSet(null, (t, k) ->
                t == 0 ? 0L
                : sz[lc[(int) t]] >= k
                    ? (Long) split.get().applyAsLong(lc[(int) t], k) instanceof Long p && (lc[(int) t] = (int) (long) p) >= 0 && upd.test((int) t) ? ((p >>> 32) << 32) | t : 0L
                    : (Long) split.get().applyAsLong(rc[(int) t], k - sz[lc[(int) t]] - 1) instanceof Long p && (rc[(int) t] = (int) (p >>> 32)) >= 0 && upd.test((int) t) ? (t << 32) | (p & 0xFFFFFFFFL) : 0L)
            && find.compareAndSet(null, (node, off) ->
                node == 0 || mx[node] < cell[0] ? -1
                : mx[rc[node]] >= cell[0] ? find.get().applyAsInt(rc[node], off + sz[lc[node]] + 1)
                : v[1 + 2 * (node - 1)] >= cell[0] ? off + sz[lc[node]]
                : find.get().applyAsInt(lc[node], off))
            && ord.compareAndSet(null, t -> t == 0 || (ord.get().test(lc[t]) && (out[cell[2]++] = t) > 0 && ord.get().test(rc[t])))
            && IntStream.range(0, n).allMatch(i ->
                (cell[0] = v[1 + 2 * i]) >= 0
                && (Integer) find.get().applyAsInt(cell[1], 0) instanceof Integer idx
                && (sz[i + 1] = 1) > 0
                && (mx[i + 1] = v[1 + 2 * i]) >= 0
                && (Long) split.get().applyAsLong(cell[1], Math.max(idx + 1L, i - (long) v[2 + 2 * i])) instanceof Long p
                && (cell[1] = merge.get().applyAsInt(merge.get().applyAsInt((int) (p >>> 32), i + 1), (int) (long) p)) > 0)
            && ord.get().test(cell[1])
            ? IntStream.of(out).skip(0).limit(n).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}


