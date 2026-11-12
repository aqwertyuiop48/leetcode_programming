import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new int[b.length / 2 + 2] instanceof int[] t && new int[2] instanceof int[] cu
            && IntStream.rangeClosed(0, b.length).allMatch(i -> (i < b.length ? b[i] : 32) >= 48 ? (cu[0] = cu[0] * 10 + b[i] - 48) >= 0 : (cu[0] == 0 || ((t[cu[1]++] = cu[0]) > 0 && (cu[0] = 0) == 0)))
            && (Integer) t[0] instanceof Integer n && (Integer) t[n + 1] instanceof Integer q && (Integer) IntStream.rangeClosed(1, n).map(i -> t[i]).max().getAsInt() instanceof Integer M
            && new int[M + 1] instanceof int[] spf && new int[M + 1] instanceof int[] last && new long[M + 2] instanceof long[] inv && (inv[1] = 1) == 1
            && IntStream.iterate(3, p -> p * p <= M, p -> p + 2).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p * p, j -> j <= M, j -> j + 2 * p).filter(j -> spf[j] == 0).map(j -> spf[j] = p).sum() >= 0)
            && IntStream.rangeClosed(2, M).allMatch(i -> (inv[i] = (1000000007L - (1000000007L / i) * inv[(int) (1000000007L % i)] % 1000000007L) % 1000000007L) >= 0)
            && ((IntUnaryOperator) x -> (x & 1) == 0 ? 2 : (spf[x] == 0 ? x : spf[x])) instanceof IntUnaryOperator sp
            && IntStream.range(0, n + 2).mapToLong(i -> 1L).toArray() instanceof long[] bit && new long[q] instanceof long[] ans
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[q] instanceof int[] nxt
            && IntStream.range(0, q).allMatch(k -> (nxt[k] = head[t[n + 3 + 2 * k]]) >= -1 && (head[t[n + 3 + 2 * k]] = k) >= 0)
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] u1 && (u1[0] = (j, v) -> j > n ? 0L : (bit[(int) j] = bit[(int) j] * v % 1000000007L) * 0 + u1[0].applyAsLong(j + (j & -j), v)) != null
            && new LongUnaryOperator[1] instanceof LongUnaryOperator[] q1 && (q1[0] = k -> k == 0 ? 1L : bit[(int) k] * q1[0].applyAsLong(k - (k & -k)) % 1000000007L) != null
            && IntStream.rangeClosed(1, n).allMatch(i -> new long[]{1, 0, 1} instanceof long[] ph && new int[]{0} instanceof int[] pv
                && IntStream.iterate(t[i], x -> x > 1, x -> x / sp.applyAsInt(x)).map(sp).allMatch(p -> (ph[0] *= (p != pv[0] ? p - 1 : p)) > 0
                    && (p == pv[0] || ((Long) (last[p] == 0 ? 1L : p * inv[p - 1] % 1000000007L) instanceof Long cf && (last[p] == ph[1] ? (ph[2] = ph[2] * cf % 1000000007L) >= 0 : ((ph[1] == 0 || u1[0].applyAsLong(n + 1 - ph[1], ph[2]) >= 0) && (ph[1] = last[p]) >= 0 && (ph[2] = cf) > 0)) && (last[p] = i) > 0 && (pv[0] = p) > 0)))
                && (ph[1] == 0 || u1[0].applyAsLong(n + 1 - ph[1], ph[2]) >= 0)
                && u1[0].applyAsLong(n + 1 - i, ph[0]) >= 0
                && IntStream.iterate(head[i], j -> j >= 0, j -> nxt[j]).allMatch(j -> (ans[j] = q1[0].applyAsLong(n + 1 - t[n + 2 + 2 * j])) >= 0))
            ? Arrays.stream(ans).mapToObj(Long::toString).collect(Collectors.joining("\n")) : "");
    }
}
