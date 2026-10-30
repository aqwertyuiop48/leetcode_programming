import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Integer) BigInteger.valueOf(h).gcd(BigInteger.valueOf(m)).intValue() instanceof Integer g && (Integer) (h / g) instanceof Integer len
            && new int[h] instanceof int[] classId && new int[h] instanceof int[] idxIn && new int[h] instanceof int[] pos
            && IntStream.range(0, h).allMatch(t -> (Integer) (t / len) instanceof Integer r && (Integer) (t % len) instanceof Integer i && (Integer) (int) ((r + (long) i * m) % h) instanceof Integer cell
                && (classId[cell] = r) >= 0 && (idxIn[cell] = i) >= 0 && (pos[t] = cell) >= 0)
            && (Integer) ((len + 63) >> 6) instanceof Integer W && (Integer) ((W + 63) >> 6) instanceof Integer W1
            && new long[g * W] instanceof long[] w0 && new long[g * W1] instanceof long[] s1
            && IntStream.range(0, g * W).allMatch(q -> (w0[q] = q % W == W - 1 && (len & 63) != 0 ? (1L << (len & 63)) - 1 : -1L) != 0 && (s1[q / W * W1 + (q % W >> 6)] |= 1L << (q % W & 63)) != 0)
            && ((IntBinaryOperator) (r, idx) -> idx >= len ? -1
                : (w0[r * W + (idx >> 6)] & (-1L << (idx & 63))) != 0 ? ((idx >> 6) << 6) + Long.numberOfTrailingZeros(w0[r * W + (idx >> 6)] & (-1L << (idx & 63)))
                : (idx >> 6) + 1 >= W ? -1
                : (Integer) ((idx >> 6) + 1) instanceof Integer nw
                    && (Integer) ((s1[r * W1 + (nw >> 6)] & (-1L << (nw & 63))) != 0 ? ((nw >> 6) << 6) + Long.numberOfTrailingZeros(s1[r * W1 + (nw >> 6)] & (-1L << (nw & 63)))
                        : IntStream.range((nw >> 6) + 1, W1).filter(sw -> s1[r * W1 + sw] != 0).map(sw -> (sw << 6) + Long.numberOfTrailingZeros(s1[r * W1 + sw])).findFirst().orElse(-1)) instanceof Integer wd
                    ? wd < 0 ? -1 : (wd << 6) + Long.numberOfTrailingZeros(w0[r * W + wd]) : -1) instanceof IntBinaryOperator nxt
            && new HashMap<Integer, Integer>(1 << 19) instanceof HashMap<Integer, Integer> where && new long[]{0} instanceof long[] ans
            ? IntStream.range(0, n).allMatch(i -> tk.nextToken().equals("+")
                ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer id && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer hash
                    && (Integer) classId[hash] instanceof Integer r && (Integer) idxIn[hash] instanceof Integer idx && (Integer) nxt.applyAsInt(r, idx) instanceof Integer f0
                    && (Integer) (f0 >= 0 ? f0 : nxt.applyAsInt(r, 0)) instanceof Integer f
                    && (ans[0] += f0 >= 0 ? f - idx : len - idx + f) >= 0
                    && ((w0[r * W + (f >> 6)] &= ~(1L << (f & 63))) != 0 || (s1[r * W1 + (f >> 12)] &= ~(1L << ((f >> 6) & 63))) >= 0)
                    && where.put(id, pos[r * len + f]) == null || true
                : (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer id2 && (Integer) where.get(id2) instanceof Integer cell
                    && (Integer) classId[cell] instanceof Integer r2 && (Integer) idxIn[cell] instanceof Integer i2
                    && (w0[r2 * W + (i2 >> 6)] |= 1L << (i2 & 63)) != 0 && (s1[r2 * W1 + (i2 >> 12)] |= 1L << ((i2 >> 6) & 63)) != 0 || true) ? ans[0] : -1
            : -1);
    }


}
