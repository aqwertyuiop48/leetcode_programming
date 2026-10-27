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
            && Integer.valueOf((int) nums[1]) instanceof Integer len
            && Integer.valueOf((int) nums[n + 2]) instanceof Integer k
            && new long[n + 1] instanceof long[] pre
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + nums[i + 2]) > Long.MIN_VALUE)
            ? LongStream.of(1, -1).map(s ->
                IntStream.range(0, n).map(i -> (int) (nums[i + 2] * s)).toArray() instanceof int[] b
                && IntStream.range(0, n).mapToLong(i -> (((long) b[i] + 1000000000L) << 17) | i).sorted().toArray() instanceof long[] keys
                && new int[n] instanceof int[] rk
                && IntStream.range(0, n).allMatch(r -> (rk[(int) (keys[r] & 131071)] = r) >= 0)
                && new long[n + 2] instanceof long[] cnt
                && new long[n + 2] instanceof long[] sm
                && new long[3] instanceof long[] q
                && ((IntBinaryOperator) (i, d) ->
                    IntStream.iterate(rk[i] + 1, j -> j <= n, j -> j + (j & -j))
                        .allMatch(j -> (cnt[j] += d) + (sm[j] += (long) b[i] * d) > Long.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator upd
                && ((LongSupplier) () ->
                    (q[0] = 0) + (q[1] = k) + (q[2] = 0) == k
                        && IntStream.iterate(Integer.highestOneBit(n), p -> p > 0, p -> p >> 1)
                            .allMatch(p -> q[0] + p <= n && cnt[(int) q[0] + p] <= q[1]
                                ? (q[2] += sm[(int) q[0] + p]) + (q[1] -= cnt[(int) q[0] + p]) + (q[0] += p) > Long.MIN_VALUE
                                : true)
                        ? q[2] : q[2]) instanceof LongSupplier qf
                ? IntStream.range(0, n).mapToLong(i ->
                    (long) ((b[i] < 0 ? upd.applyAsInt(i, 1) : 0) + (i >= len && b[i - len] < 0 ? upd.applyAsInt(i - len, -1) : 0)) * 0
                    + (i >= len - 1 ? s * (pre[i + 1] - pre[i + 1 - len]) - 2 * qf.getAsLong() : Long.MIN_VALUE)).max().getAsLong()
                : 0L).max().getAsLong()
            : 0L);
    }
}

