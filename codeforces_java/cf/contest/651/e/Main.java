import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[(int) IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).count()] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (ps[1] = raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) : (i > 0 && raw[i - 1] > 47 ? 0 * (t[ps[2]++] = ps[0]) + (ps[0] = 0) : 0)) < 0).count() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(n * m) instanceof Integer N
            && LongStream.range(0, N).map(k -> ((long) t[2 + (int) k] << 20) | k).sorted().toArray() instanceof long[] key
            && Arrays.stream(key).mapToInt(v -> (int) (v & 1048575)).toArray() instanceof int[] ci
            && Arrays.stream(ci).map(c -> c / m).toArray() instanceof int[] ro
            && Arrays.stream(ci).map(c -> n + c % m).toArray() instanceof int[] co
            && new int[n + m] instanceof int[] p && new int[n + m] instanceof int[] sz && new int[n + m] instanceof int[] mx && new int[n + m] instanceof int[] rc && new int[N] instanceof int[] res
            && IntStream.range(0, n + m).filter(i -> (sz[i] = 1) + (p[i] = i) < 0).count() == 0
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh && (fh[0] = x -> p[x] == x ? x : (p[x] = fh[0].applyAsInt(p[x]))) != null
            && new int[]{0} instanceof int[] gs
            && IntStream.rangeClosed(0, N).filter(k ->
                (k > gs[0] && (k == N || (key[k] >> 20) != (key[gs[0]] >> 20))
                    ? (k == gs[0] + 1
                        ? 0 * (res[ci[k - 1]] = Math.max(rc[ro[k - 1]], rc[co[k - 1]]) + 1) + 0 * (rc[ro[k - 1]] = rc[co[k - 1]] = res[ci[k - 1]]) + 0 * (p[ro[k - 1]] = ro[k - 1]) + 0 * (p[co[k - 1]] = co[k - 1])
                            + 0 * (sz[ro[k - 1]] = 1) + 0 * (sz[co[k - 1]] = 1) + (gs[0] = k) * 0
                        : IntStream.of(0)
                            .peek(z -> IntStream.range(gs[0], k).forEach(j -> mx[fh[0].applyAsInt(ro[j])] = Math.max(mx[fh[0].applyAsInt(ro[j])], Math.max(rc[ro[j]], rc[co[j]]))))
                            .peek(z -> IntStream.range(gs[0], k).forEach(j -> res[ci[j]] = mx[fh[0].applyAsInt(ro[j])] + 1))
                            .peek(z -> IntStream.range(gs[0], k).forEach(j -> rc[ro[j]] = (rc[co[j]] = res[ci[j]]) + 0 * (p[ro[j]] = ro[j]) + 0 * (p[co[j]] = co[j])
                                + 0 * (sz[ro[j]] = 1) + 0 * (sz[co[j]] = 1) + 0 * (mx[ro[j]] = 0) + 0 * (mx[co[j]] = 0)))
                            .peek(z -> gs[0] = k).sum())
                    : 0)
                + (k < N ? (Integer.valueOf(fh[0].applyAsInt(ro[k])) instanceof Integer A && Integer.valueOf(fh[0].applyAsInt(co[k])) instanceof Integer B && A.intValue() != B.intValue()
                    ? (sz[A] < sz[B] ? (p[A] = B) + (sz[B] += sz[A]) : (p[B] = A) + (sz[A] += sz[B])) : 0) : 0) < 0).count() == 0
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, N).filter(c -> sb.append(res[c]).append(c % m == m - 1 ? (char) 10 : ' ') == null).count() == 0
            ? sb.toString().trim() : "");
    }
}
