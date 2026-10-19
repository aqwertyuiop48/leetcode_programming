import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[4 * n * 20 + 40] instanceof int[] cnt && new int[4 * n + 4] instanceof int[] lz && new int[4 * n + 4] instanceof int[] ln && new int[3] instanceof int[] q
            && ((IntBinaryOperator) (nd, x) -> IntStream.range(0, 20).filter(b -> (x >> b & 1) == 1).allMatch(b -> (cnt[nd * 20 + b] = ln[nd] - cnt[nd * 20 + b]) >= 0) && (lz[nd] ^= x) >= 0 ? 0 : 1) instanceof IntBinaryOperator ap
            && ((IntUnaryOperator) nd -> lz[nd] == 0 || ap.applyAsInt(2 * nd, lz[nd]) + ap.applyAsInt(2 * nd + 1, lz[nd]) + (lz[nd] = 0) >= 0 ? 0 : 1) instanceof IntUnaryOperator push
            && ((IntUnaryOperator) nd -> IntStream.range(0, 20).allMatch(b -> (cnt[nd * 20 + b] = cnt[2 * nd * 20 + b] + cnt[(2 * nd + 1) * 20 + b]) >= 0) ? 0 : 1) instanceof IntUnaryOperator pull
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> build
            && build.compareAndSet(null, (nd, lr) -> Long.valueOf(lr >> 20) instanceof Long l && Long.valueOf(lr & 0xFFFFF) instanceof Long r
                && (ln[(int) nd] = (int) (r - l + 1)) > 0
                && (l.equals(r) ? IntStream.range(0, 20).allMatch(b -> (cnt[(int) nd * 20 + b] = a[(int) (long) l] >> b & 1) >= 0)
                    : Long.valueOf((l + r) / 2) instanceof Long mid && build.get().applyAsLong(2 * nd, l << 20 | mid) == 0 && build.get().applyAsLong(2 * nd + 1, (mid + 1) << 20 | r) == 0 && pull.applyAsInt((int) nd) == 0) ? 0 : 1)
            && build.get().applyAsLong(1, (long) (n - 1)) == 0
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> upd
            && upd.compareAndSet(null, (nd, lr) -> Long.valueOf(lr >> 20) instanceof Long l && Long.valueOf(lr & 0xFFFFF) instanceof Long r
                ? q[0] <= l && r <= q[1] ? ap.applyAsInt((int) nd, q[2]) : push.applyAsInt((int) nd) + (Long.valueOf((l + r) / 2) instanceof Long mid
                    ? (q[0] <= mid ? upd.get().applyAsLong(2 * nd, l << 20 | mid) : 0) + (q[1] > mid ? upd.get().applyAsLong(2 * nd + 1, (mid + 1) << 20 | r) : 0) + pull.applyAsInt((int) nd) : 0) : 0)
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> qry
            && qry.compareAndSet(null, (nd, lr) -> Long.valueOf(lr >> 20) instanceof Long l && Long.valueOf(lr & 0xFFFFF) instanceof Long r
                ? q[0] <= l && r <= q[1] ? IntStream.range(0, 20).mapToLong(b -> (long) cnt[(int) nd * 20 + b] << b).sum()
                    : push.applyAsInt((int) nd) + (Long.valueOf((l + r) / 2) instanceof Long mid
                        ? (q[0] <= mid ? qry.get().applyAsLong(2 * nd, l << 20 | mid) : 0) + (q[1] > mid ? qry.get().applyAsLong(2 * nd + 1, (mid + 1) << 20 | r) : 0) : 0) : 0)
            && Integer.valueOf(it.next()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer t && (q[0] = it.next() - 1) >= 0 && (q[1] = it.next() - 1) >= 0
                ? t == 1 ? String.valueOf(qry.get().applyAsLong(1, (long) (n - 1))) : (q[2] = it.next()) >= 0 && upd.get().applyAsLong(1, (long) (n - 1)) >= 0 ? null : null : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : ""), "", 1 << 28).start();
    }
}
