import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) t[1] instanceof Integer m
            && (Integer) t[2] instanceof Integer tn
            && new long[m + 1] instanceof long[] cnt
            && IntStream.range(0, tn).allMatch(i -> ++cnt[t[3 + i] % m] > 0)
            && (Long) 1000000007L instanceof Long P
            && (Long) (m >= 64 ? -1L : (1L << m) - 1) instanceof Long mlo
            && (Long) (m > 64 ? (1L << (m - 64)) - 1 : 0L) instanceof Long mhi
            && IntStream.rangeClosed(0, m / 2).mapToLong(c -> cnt[c] + (2 * c == m || c == 0 ? 0 : cnt[m - c])).toArray() instanceof long[] W
            && (Long) IntStream.rangeClosed(1, m / 2).filter(c -> W[c] != 0).mapToLong(c -> 1L << c).reduce(0L, (x, y) -> x | y) instanceof Long wm
            && new long[2 * m + 8] instanceof long[] stk && new int[1] instanceof int[] sh
            && ((LongBinaryOperator) (lo, hi) -> ((sh[0] < 64 ? lo << sh[0] : 0L) & mlo)
                | (m - sh[0] < 64 ? lo >>> (m - sh[0]) | hi << (64 - (m - sh[0])) : hi >>> (m - sh[0] - 64))) instanceof LongBinaryOperator rL
            && ((LongBinaryOperator) (lo, hi) -> ((sh[0] < 64 ? hi << sh[0] | lo >>> (64 - sh[0]) : lo << (sh[0] - 64)) & mhi)
                | (m - sh[0] < 64 ? hi >>> (m - sh[0]) : 0L)) instanceof LongBinaryOperator rH
            && (stk[0] = 1L) == 1L
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] H
            && (H[0] = (d, rem) -> rem == 0 ? 0L
                : (Integer) Long.numberOfTrailingZeros(rem) instanceof Integer c && (Integer) (int) (2 * d) instanceof Integer di
                    && (sh[0] = c) > 0
                    && (stk[di + 2] = stk[di] | rL.applyAsLong(stk[di], stk[di + 1])) * 0 == 0
                    && (stk[di + 3] = stk[di + 1] | rH.applyAsLong(stk[di], stk[di + 1])) * 0 == 0
                    && (sh[0] = m - c) > 0
                    && (stk[di + 2] |= rL.applyAsLong(stk[di], stk[di + 1])) * 0 == 0
                    && (stk[di + 3] |= rH.applyAsLong(stk[di], stk[di + 1])) * 0 == 0
                    ? (W[c] * (1 + H[0].applyAsLong(d + 1, ~stk[di + 2] & wm & (-1L << (c + 1)))) + H[0].applyAsLong(d, rem & (rem - 1))) % P
                    : 0L) != null
            ? (1 + H[0].applyAsLong(0, wm)) % P
            : -1L);
    }
}
