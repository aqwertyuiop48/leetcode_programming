import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(Integer.highestOneBit(2 * n - 1)) instanceof Integer N
            && new int[n + 2] instanceof int[] pos
            && IntStream.rangeClosed(1, n).map(i -> s.nextInt()).toArray() instanceof int[] t0 && new int[n] instanceof int[] a && IntStream.range(0, n).allMatch(i -> (a[t0[i] - 1] = i + 1) > 0)
            && IntStream.range(0, n).allMatch(i -> (pos[a[i]] = i + 1) > 0)
            && new int[2 * N] instanceof int[] mn && new int[2 * N] instanceof int[] c1 && new int[2 * N] instanceof int[] c2 && new int[2 * N] instanceof int[] ad
            && IntStream.range(1, 2 * N).allMatch(i -> (c1[i] = N >> (31 - Integer.numberOfLeadingZeros(i))) > 0)
            && new int[3] instanceof int[] pr
            && ((IntUnaryOperator) nd -> Integer.valueOf(Math.min(mn[2 * nd], mn[2 * nd + 1])) instanceof Integer m
                && (c1[nd] = (mn[2 * nd] == m ? c1[2 * nd] : 0) + (mn[2 * nd + 1] == m ? c1[2 * nd + 1] : 0)) >= 0
                && (c2[nd] = (mn[2 * nd] == m ? c2[2 * nd] : mn[2 * nd] == m + 1 ? c1[2 * nd] : 0) + (mn[2 * nd + 1] == m ? c2[2 * nd + 1] : mn[2 * nd + 1] == m + 1 ? c1[2 * nd + 1] : 0)) >= 0
                && (mn[nd] = m + ad[nd]) > Integer.MIN_VALUE ? 0 : 0) instanceof IntUnaryOperator pull
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> upd
            && upd.compareAndSet(null, nd -> Integer.valueOf(N >> (31 - Integer.numberOfLeadingZeros(nd))) instanceof Integer len
                && Integer.valueOf((nd - Integer.highestOneBit(nd)) * len) instanceof Integer l
                && Integer.valueOf(l + len - 1) instanceof Integer r
                ? pr[0] <= l && r <= pr[1] ? ((mn[nd] += pr[2]) + (ad[nd] += pr[2]) > Integer.MIN_VALUE ? 0 : 0)
                    : Integer.valueOf(l + len / 2 - 1) instanceof Integer mid
                        ? (pr[0] <= mid ? upd.get().applyAsInt(2 * nd) : 0) + (pr[1] > mid ? upd.get().applyAsInt(2 * nd + 1) : 0) + pull.applyAsInt(nd) : 0
                : 0)
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> qry
            && qry.compareAndSet(null, (x, acc) -> Integer.valueOf((int) x) instanceof Integer nd
                && Integer.valueOf(N >> (31 - Integer.numberOfLeadingZeros(nd))) instanceof Integer len
                && Integer.valueOf((nd - Integer.highestOneBit(nd)) * len) instanceof Integer l
                && Integer.valueOf(l + len - 1) instanceof Integer r
                ? pr[0] <= l && r <= pr[1] ? (Long.valueOf(mn[nd] + acc) instanceof Long m ? m == 1 ? (long) c1[nd] + c2[nd] : m == 2 ? c1[nd] : 0L : 0L)
                    : Integer.valueOf(l + len / 2 - 1) instanceof Integer mid
                        ? (pr[0] <= mid ? qry.get().applyAsLong(2L * nd, acc + ad[nd]) : 0) + (pr[1] > mid ? qry.get().applyAsLong(2L * nd + 1, acc + ad[nd]) : 0) : 0
                : 0)
            && ((IntBinaryOperator) (hi, val) -> (pr[1] = hi) + (pr[2] = val) > Integer.MIN_VALUE ? upd.get().applyAsInt(1) : 0) instanceof IntBinaryOperator rng
            ? LongStream.rangeClosed(1, n).map(r -> (pr[0] = 0) == 0 && rng.applyAsInt((int) r - 1, 1) == 0
                && Integer.valueOf(a[(int) r - 1]) instanceof Integer v
                && (pos[v - 1] > 0 && pos[v - 1] < r ? rng.applyAsInt(pos[v - 1] - 1, -1) : 0) == 0
                && (pos[v + 1] > 0 && pos[v + 1] < r ? rng.applyAsInt(pos[v + 1] - 1, -1) : 0) == 0
                && r > 1 && (pr[1] = (int) r - 2) >= 0
                ? qry.get().applyAsLong(1, 0) : 0).sum()
            : "");
    }
}

