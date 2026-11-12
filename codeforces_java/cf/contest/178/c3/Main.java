
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 8] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> (Integer) (i < raw.length ? (int) raw[i] : 10) instanceof Integer b
                ? b >= 48 ? (st[0] = st[0] * 10 + b - 48) * 0 + (st[1] = 1)
                    : (st[1] == 1 ? (tok[st[2]++] = st[0]) * 0 + (st[0] = 0) + (st[1] = 0) : 0) + (b == 43 ? (tok[st[2]++] = -1) : b == 45 ? (tok[st[2]++] = -2) : 0) : 0).max().isPresent()
            && (Integer) tok[0] instanceof Integer h && (Integer) tok[1] instanceof Integer m && (Integer) tok[2] instanceof Integer n
            && (Integer) Stream.iterate(new int[]{h, m}, v -> v[1] != 0, v -> new int[]{v[1], v[0] % v[1]}).reduce((x, y) -> y).get()[1] instanceof Integer g
            && (Integer) (h / g) instanceof Integer len && new int[h] instanceof int[] slotOf
            && IntStream.range(0, h).map(t -> slotOf[(int) ((t / len + (long) (t % len) * m) % h)] = t).max().isPresent()
            && (Integer) ((len + 63) >> 6) instanceof Integer W && (Integer) ((W + 63) >> 6) instanceof Integer W1 && (Integer) ((W1 + 63) >> 6) instanceof Integer W2
            && new long[g * W] instanceof long[] l0 && new long[g * W1] instanceof long[] l1 && new long[g * W2] instanceof long[] l2
            && IntStream.range(0, g * W).map(q -> (int) ((l0[q] = q % W == W - 1 && (len & 63) != 0 ? (1L << (len & 63)) - 1 : -1L) & 1) + (int) (l1[q / W * W1 + (q % W >> 6)] |= 1L << (q % W & 63)) * 0).max().isPresent()
            && IntStream.range(0, g * W1).map(q -> (int) (l2[q / W1 * W2 + (q % W1 >> 6)] |= 1L << (q % W1 & 63))).max().isPresent()
            && ((IntBinaryOperator) (r, nw) -> ((Long) (l1[r * W1 + (nw >> 6)] & (-1L << nw)) instanceof Long m1 && m1 != 0L) ? ((nw >> 6) << 6) + Long.numberOfTrailingZeros(m1)
                : (nw >> 6) + 1 >= W1 ? -1
                : ((Long) (l2[r * W2 + (((nw >> 6) + 1) >> 6)] & (-1L << ((nw >> 6) + 1))) instanceof Long m2 && m2 != 0L)
                    ? (((((((nw >> 6) + 1) >> 6) << 6) + Long.numberOfTrailingZeros(m2)) << 6) + Long.numberOfTrailingZeros(l1[r * W1 + ((((nw >> 6) + 1) >> 6) << 6) + Long.numberOfTrailingZeros(m2)]))
                    : -1) instanceof IntBinaryOperator fw
            && ((IntBinaryOperator) (r, idx) -> ((Long) (l0[r * W + (idx >> 6)] & (-1L << idx)) instanceof Long m0 && m0 != 0L) ? ((idx >> 6) << 6) + Long.numberOfTrailingZeros(m0)
                : (idx >> 6) + 1 >= W ? -1
                : (Integer) fw.applyAsInt(r, (idx >> 6) + 1) instanceof Integer wd ? wd < 0 ? -1 : (wd << 6) + Long.numberOfTrailingZeros(l0[r * W + wd]) : -1) instanceof IntBinaryOperator find
            && new HashMap<Integer, Integer>(1 << 19) instanceof HashMap<Integer, Integer> where && new long[]{0} instanceof long[] ans && new int[]{3} instanceof int[] p
            ? IntStream.range(0, n).allMatch(o -> tok[p[0]] == -1
                ? (Integer) slotOf[tok[p[0] + 2]] instanceof Integer s && (Integer) (s / len) instanceof Integer r && (Integer) (s % len) instanceof Integer idx
                    && (Integer) find.applyAsInt(r, idx) instanceof Integer f0 && (Integer) (f0 >= 0 ? f0 : find.applyAsInt(r, 0)) instanceof Integer f
                    && (ans[0] += f0 >= 0 ? f - idx : len - idx + f) >= 0
                    && ((l0[r * W + (f >> 6)] &= ~(1L << f)) != 0 || (l1[r * W1 + (f >> 12)] &= ~(1L << (f >> 6))) != 0 || (l2[r * W2 + (f >> 18)] &= ~(1L << (f >> 12))) != 0 || true)
                    && (where.put(tok[p[0] + 1], r * len + f) == null || true) && (p[0] += 3) > 0
                : (Integer) where.get(tok[p[0] + 1]) instanceof Integer s2 && (Integer) (s2 / len) instanceof Integer r2 && (Integer) (s2 % len) instanceof Integer i2
                    && (l0[r2 * W + (i2 >> 6)] |= 1L << i2) != 0 && (l1[r2 * W1 + (i2 >> 12)] |= 1L << (i2 >> 6)) != 0 && (l2[r2 * W2 + (i2 >> 18)] |= 1L << (i2 >> 12)) != 0 && (p[0] += 2) > 0)
                ? ans[0] : -1
            : -1);
    }
}



