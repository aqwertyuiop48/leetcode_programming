
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw0 && Arrays.copyOf(raw0, raw0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).allMatch(i -> (raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) + (st[2] = 1) : st[2] == 1 ? (t[st[0]++] = st[1]) + (st[1] = st[2] = 0) : 0) >= 0)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.concat(IntStream.of(0), Arrays.stream(t, 2, n + 2)).toArray() instanceof int[] cur
            && Integer.valueOf(((n + 1) >> 6) + 1) instanceof Integer zl && Integer.valueOf((zl >> 6) + 1) instanceof Integer w1
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(Math.max(IntStream.range(0, n).map(i -> t[2 + i]).max().getAsInt(), IntStream.range(0, m).map(q -> t[3 + n + 2 * q]).max().orElse(0)))) instanceof Integer B
            && LongStream.generate(() -> -1L).limit((long) B * zl).toArray() instanceof long[] Z
            && new long[B * w1 + 1] instanceof long[] S1 && new long[B + 1] instanceof long[] S2 && new long[1] instanceof long[] tot && new long[1] instanceof long[] run
            && new long[m] instanceof long[] res
            && IntStream.range(0, B * n).allMatch(idx -> Integer.valueOf(idx / n) instanceof Integer b && Integer.valueOf(idx % n + 1) instanceof Integer i
                && (i > 1 || (run[0] = 0) == 0)
                && ((cur[i] >> b & 1) == 0 ? (run[0] = 0) == 0
                    : (Z[b * zl + (i >> 6)] &= ~(1L << i)) * 0 == 0 && (tot[0] += ++run[0] << b) > 0))
            && IntStream.range(0, B * zl).allMatch(j -> (S1[j / zl * w1 + (j % zl >> 6)] |= Z[j] != 0 ? 1L << j % zl : 0L) * 0 == 0)
            && IntStream.range(0, B * w1).allMatch(j -> (S2[j / w1] |= S1[j] != 0 ? 1L << j % w1 : 0L) * 0 == 0)
            && ((LongUnaryOperator) x -> x * (x + 1) / 2) instanceof LongUnaryOperator f
            && ((IntBinaryOperator) (b, w) -> (S1[b * w1 + (w >> 6)] & -1L << w) != 0 ? (w & -64) + Long.numberOfTrailingZeros(S1[b * w1 + (w >> 6)] & -1L << w)
                : 64 * Long.numberOfTrailingZeros(S2[b] & -1L << ((w >> 6) + 1)) + Long.numberOfTrailingZeros(S1[b * w1 + Long.numberOfTrailingZeros(S2[b] & -1L << ((w >> 6) + 1))])) instanceof IntBinaryOperator wn
            && ((IntBinaryOperator) (b, w) -> (S1[b * w1 + (w >> 6)] & -1L >>> (63 - w)) != 0 ? (w & -64) + 63 - Long.numberOfLeadingZeros(S1[b * w1 + (w >> 6)] & -1L >>> (63 - w))
                : 64 * (63 - Long.numberOfLeadingZeros(S2[b] & ((1L << (w >> 6)) - 1))) + 63 - Long.numberOfLeadingZeros(S1[b * w1 + 63 - Long.numberOfLeadingZeros(S2[b] & ((1L << (w >> 6)) - 1))])) instanceof IntBinaryOperator wp
            && ((IntBinaryOperator) (b, q) -> (Z[b * zl + (q >> 6)] & -1L << q) != 0 ? (q & -64) + Long.numberOfTrailingZeros(Z[b * zl + (q >> 6)] & -1L << q)
                : Integer.valueOf(wn.applyAsInt(b, (q >> 6) + 1)) instanceof Integer w2 ? 64 * w2 + Long.numberOfTrailingZeros(Z[b * zl + w2]) : 0) instanceof IntBinaryOperator nxt
            && ((IntBinaryOperator) (b, q) -> (Z[b * zl + (q >> 6)] & -1L >>> (63 - q)) != 0 ? (q & -64) + 63 - Long.numberOfLeadingZeros(Z[b * zl + (q >> 6)] & -1L >>> (63 - q))
                : Integer.valueOf(wp.applyAsInt(b, (q >> 6) - 1)) instanceof Integer w2 ? 64 * w2 + 63 - Long.numberOfLeadingZeros(Z[b * zl + w2]) : 0) instanceof IntBinaryOperator prv
            && ((IntBinaryOperator) (b, p) -> Integer.valueOf(p - prv.applyAsInt(b, p - 1) - 1) instanceof Integer L && Integer.valueOf(nxt.applyAsInt(b, p + 1) - p - 1) instanceof Integer R
                && (tot[0] += ((2L * (Z[b * zl + (p >> 6)] >>> p & 1) - 1) * (f.applyAsLong(L + R + 1) - f.applyAsLong(L) - f.applyAsLong(R))) << b) * 0 == 0
                && (Z[b * zl + (p >> 6)] ^= 1L << p) * 0 == 0
                && (S1[b * w1 + (p >> 12)] = Z[b * zl + (p >> 6)] != 0 ? S1[b * w1 + (p >> 12)] | 1L << (p >> 6) : S1[b * w1 + (p >> 12)] & ~(1L << (p >> 6))) * 0 == 0
                && (S2[b] = S1[b * w1 + (p >> 12)] != 0 ? S2[b] | 1L << (p >> 12) : S2[b] & ~(1L << (p >> 12))) * 0 == 0 ? 0 : 0) instanceof IntBinaryOperator tg
            && IntStream.range(0, m * B).allMatch(idx -> Integer.valueOf(idx / B) instanceof Integer q && Integer.valueOf(idx % B) instanceof Integer b
                && Integer.valueOf(t[2 + n + 2 * q]) instanceof Integer p && Integer.valueOf(t[3 + n + 2 * q]) instanceof Integer v
                && (((cur[p] ^ v) >> b & 1) == 0 || tg.applyAsInt(b, p) >= 0)
                && (b < B - 1 || (cur[p] = v) >= 0 && (res[q] = tot[0]) >= 0))
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}



