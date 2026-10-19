import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && ((LongBinaryOperator) (t, m) -> (t - m) + (m & ((t - m) >> 63))) instanceof LongBinaryOperator h
            && ((LongBinaryOperator) (t, m) -> h.applyAsLong(t + (m & (t >> 63)), m)) instanceof LongBinaryOperator g
            && ((LongBinaryOperator) (pr, m) -> g.applyAsLong(pr - (long) ((double) pr / m) * m, m)) instanceof LongBinaryOperator mm
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> ref
            && ref.compareAndSet(null, (bm, e) ->
                e == 0 ? 1L % (bm & 4294967295L)
                : (Long) ref.get().applyAsLong(bm, e >> 1) instanceof Long s
                    && (Long) mm.applyAsLong(s * s, bm & 4294967295L) instanceof Long s2
                    ? ((e & 1) == 0 ? s2 : mm.applyAsLong(s2 * (bm >>> 32), bm & 4294967295L)) : 0L)
            && ((ToLongFunction<long[]>) a -> ref.get().applyAsLong((a[0] % a[2]) << 32 | a[2], a[1])) instanceof ToLongFunction<long[]> pw
            ? IntStream.range(0, (int) nums[0]).mapToObj(q ->
                (Long) nums[1 + 4 * q] instanceof Long k
                && (Long) nums[2 + 4 * q] instanceof Long l
                && (Long) nums[3 + 4 * q] instanceof Long r
                && (Long) nums[4 + 4 * q] instanceof Long p
                ? p == 2 ? (k % 2 == 1 ? "0" : "1")
                    : (Long) (k % p) instanceof Long kk
                    && (Long) (kk == 0 ? 0L : pw.applyAsLong(new long[] {kk, pw.applyAsLong(new long[] {2, l, p - 1}), p})) instanceof Long x
                    && (Long) (kk == 0 ? 0L : pw.applyAsLong(new long[] {kk, pw.applyAsLong(new long[] {2, r + 1, p - 1}), p})) instanceof Long y
                    && (Long) (x == 1 ? pw.applyAsLong(new long[] {2, r - l + 1, p})
                        : (y - 1 + p) % p * pw.applyAsLong(new long[] {(x - 1 + p) % p, p - 2, p}) % p) instanceof Long prod
                    ? String.valueOf(k % 2 == 1 ? prod * pw.applyAsLong(new long[] {(p + 1) / 2, (r - l) % (p - 1), p}) % p : prod)
                    : ""
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}
