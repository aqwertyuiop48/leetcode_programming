import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && Stream.iterate(new int[]{h, m}, p -> p[1] != 0, p -> new int[]{p[1], p[0] % p[1]}).reduce((p, q) -> q).get() instanceof int[] lastg && (Integer) (lastg[1] == 0 ? lastg[0] : lastg[1]) instanceof Integer g && (Integer) (h / g) instanceof Integer len
            && (Long) (len == 1 ? 0L : Stream.iterate(new long[]{len, m / g, 0, 1}, s -> s[1] != 0, s -> new long[]{s[1], s[0] % s[1], s[3], s[2] - (s[0] / s[1]) * s[3]}).reduce((p, q) -> q).map(s -> ((s[3] % len) + len) % len).get()) instanceof Long inv
            && new long[(h >> 6) + 2] instanceof long[] A && Stream.of(0).peek(z -> Arrays.setAll(A, i -> Math.max(0, Math.min(h, i * 64 + 64) - i * 64) >= 64 ? -1L : (1L << Math.max(0, Math.min(h, i * 64 + 64) - i * 64)) - 1)).findFirst().isPresent()
            && new long[(A.length >> 6) + 2] instanceof long[] S && Stream.of(0).peek(z -> Arrays.setAll(S, j -> IntStream.range(0, 64).filter(b -> j * 64 + b < A.length && A[j * 64 + b] != 0).mapToLong(b -> 1L << b).reduce(0L, (x, y) -> x | y))).findFirst().isPresent()
            && ((IntUnaryOperator) w -> (S[w >> 6] & (-1L << (w & 63))) != 0 ? ((w >> 6) << 6) + Long.numberOfTrailingZeros(S[w >> 6] & (-1L << (w & 63)))
                : IntStream.range((w >> 6) + 1, S.length).filter(q -> S[q] != 0).map(q -> (q << 6) + Long.numberOfTrailingZeros(S[q])).findFirst().orElse(-1)) instanceof IntUnaryOperator nw
            && ((IntUnaryOperator) f -> (A[f >> 6] & (-1L << (f & 63))) != 0 ? ((f >> 6) << 6) + Long.numberOfTrailingZeros(A[f >> 6] & (-1L << (f & 63)))
                : (Integer) nw.applyAsInt((f >> 6) + 1) instanceof Integer w2 && w2 >= 0 ? (w2 << 6) + Long.numberOfTrailingZeros(A[w2]) : -1) instanceof IntUnaryOperator nxt
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> placed && new long[]{0} instanceof long[] total
            ? IntStream.range(0, n).allMatch(i -> tk.nextToken() instanceof String op && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer id
                    && (op.equals("+")
                        ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) ((x % g) * len) instanceof Integer base && (Integer) (int) ((x / g) * inv % len) instanceof Integer t
                            && (Integer) ((Integer) nxt.applyAsInt(base + t) instanceof Integer k1 && k1 >= 0 && k1 < base + len ? k1 : nxt.applyAsInt(base)) instanceof Integer key
                            && (total[0] += (key - base - t + len) % len) >= 0 && (A[key >> 6] &= ~(1L << (key & 63))) == A[key >> 6] && (A[key >> 6] != 0 || (S[key >> 12] &= ~(1L << ((key >> 6) & 63))) == S[key >> 12]) && placed.put(id, key) == null
                        : placed.remove(id) instanceof Integer old && (A[old >> 6] |= 1L << (old & 63)) != 0 && (S[old >> 12] |= 1L << ((old >> 6) & 63)) != 0)) ? total[0] : -1
            : -1);
    }
}
