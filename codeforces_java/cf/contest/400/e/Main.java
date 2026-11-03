import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw0 && Arrays.copyOf(raw0, raw0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).allMatch(i -> (raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) + (st[2] = 1) : st[2] == 1 ? (t[st[0]++] = st[1]) + (st[1] = st[2] = 0) : 0) >= 0)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(((n + 1) >> 6) + 1) instanceof Integer zl
            && new long[zl] instanceof long[] Z && new long[(zl >> 6) + 2] instanceof long[] S1 && new long[1] instanceof long[] S2 && new long[1] instanceof long[] tot
            && new long[m] instanceof long[] res
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(Math.max(IntStream.range(0, n).map(i -> t[2 + i]).max().getAsInt(), IntStream.range(0, m).map(q -> t[3 + n + 2 * q]).max().orElse(0)))) instanceof Integer bits
            && ((LongUnaryOperator) x -> x * (x + 1) / 2) instanceof LongUnaryOperator f
            && ((IntUnaryOperator) v -> (S1[v >> 6] & -1L << v) != 0 ? (v & -64) + Long.numberOfTrailingZeros(S1[v >> 6] & -1L << v)
                : 64 * Long.numberOfTrailingZeros(S2[0] & -1L << ((v >> 6) + 1)) + Long.numberOfTrailingZeros(S1[Long.numberOfTrailingZeros(S2[0] & -1L << ((v >> 6) + 1))])) instanceof IntUnaryOperator wn
            && ((IntUnaryOperator) v -> (S1[v >> 6] & -1L >>> (63 - v)) != 0 ? (v & -64) + 63 - Long.numberOfLeadingZeros(S1[v >> 6] & -1L >>> (63 - v))
                : 64 * (63 - Long.numberOfLeadingZeros(S2[0] & ((1L << (v >> 6)) - 1))) + 63 - Long.numberOfLeadingZeros(S1[63 - Long.numberOfLeadingZeros(S2[0] & ((1L << (v >> 6)) - 1))])) instanceof IntUnaryOperator wp
            && ((IntUnaryOperator) q -> (Z[q >> 6] & -1L << q) != 0 ? (q & -64) + Long.numberOfTrailingZeros(Z[q >> 6] & -1L << q)
                : Integer.valueOf(wn.applyAsInt((q >> 6) + 1)) instanceof Integer w2 ? 64 * w2 + Long.numberOfTrailingZeros(Z[w2]) : 0) instanceof IntUnaryOperator nxt
            && ((IntUnaryOperator) q -> (Z[q >> 6] & -1L >>> (63 - q)) != 0 ? (q & -64) + 63 - Long.numberOfLeadingZeros(Z[q >> 6] & -1L >>> (63 - q))
                : Integer.valueOf(wp.applyAsInt((q >> 6) - 1)) instanceof Integer w2 ? 64 * w2 + 63 - Long.numberOfLeadingZeros(Z[w2]) : 0) instanceof IntUnaryOperator prv
            && ((IntBinaryOperator) (p, v) -> (int) (Z[p >> 6] >>> p & 1) == v
                ? (Integer.valueOf(p - prv.applyAsInt(p - 1) - 1) instanceof Integer L && Integer.valueOf(nxt.applyAsInt(p + 1) - p - 1) instanceof Integer R
                    && (tot[0] += (v == 1 ? 1 : -1) * (f.applyAsLong(L + R + 1) - f.applyAsLong(L) - f.applyAsLong(R))) * 0 == 0
                    && (Z[p >> 6] ^= 1L << p) * 0 == 0
                    && (S1[p >> 12] = Z[p >> 6] != 0 ? S1[p >> 12] | 1L << (p >> 6) : S1[p >> 12] & ~(1L << (p >> 6))) * 0 == 0
                    && (S2[0] = S1[p >> 12] != 0 ? S2[0] | 1L << (p >> 12) : S2[0] & ~(1L << (p >> 12))) * 0 == 0 ? 1 : 1)
                : 0) instanceof IntBinaryOperator set
            && ((BooleanSupplier) () -> IntStream.range(0, S1.length).allMatch(i -> (S1[i] = 0) == 0) && (S2[0] = 0) == 0
                && IntStream.range(0, zl).allMatch(w -> (Z[w] = -1L) != 0 && (S1[w >> 6] |= 1L << w) != 0 && (S2[0] |= 1L << (w >> 6)) != 0) && (tot[0] = 0) == 0) instanceof BooleanSupplier reset
            && IntStream.range(0, bits * (n + m)).allMatch(idx -> Integer.valueOf(idx / (n + m)) instanceof Integer bit && Integer.valueOf(idx % (n + m)) instanceof Integer e
                && (e > 0 || reset.getAsBoolean())
                && (e < n ? set.applyAsInt(e + 1, t[2 + e] >> bit & 1) >= 0
                    : Integer.valueOf(e - n) instanceof Integer q && set.applyAsInt(t[2 + n + 2 * q], t[3 + n + 2 * q] >> bit & 1) >= 0 && (res[q] += tot[0] << bit) >= 0))
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
