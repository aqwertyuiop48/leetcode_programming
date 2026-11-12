
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] a
            && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) * 0 + (ps[1] = 1) : ps[1] == 1 ? (a[ps[2]++] = ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) : 0) >= 0).count() >= 0
            && (Integer) a[0] instanceof Integer n
            && (Integer) a[3 * n - 1] instanceof Integer k
            && (Integer) Integer.highestOneBit(Math.max(1, 2 * k - 1)) instanceof Integer N
            && new int[n + 1] instanceof int[] head && new int[2 * n + 2] instanceof int[] to && new int[2 * n + 2] instanceof int[] nxt && new int[]{0} instanceof int[] c
            && ((IntBinaryOperator) (u, v) -> (to[++c[0]] = v) * 0 + (nxt[c[0]] = head[u]) * 0 + (head[u] = c[0])) instanceof IntBinaryOperator add
            && IntStream.range(0, n - 1).filter(e -> add.applyAsInt(a[n + 1 + 2 * e], a[n + 2 + 2 * e]) + add.applyAsInt(a[n + 2 + 2 * e], a[n + 1 + 2 * e]) >= 0).count() >= 0
            && new int[n] instanceof int[] q && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] m1 && new int[n + 1] instanceof int[] ow && new int[n + 1] instanceof int[] m2 && new int[]{1} instanceof int[] qn
            && (q[0] = 1) + (m1[1] = a[1]) + (ow[1] = 1) + (m2[1] = 1 << 30) > 0
            && IntStream.range(0, n).filter(qi -> (Integer) q[qi] instanceof Integer v
                && IntStream.iterate(head[v], e -> e > 0, e -> nxt[e]).filter(e -> (Integer) to[e] instanceof Integer w
                    && w != par[v] && (par[w] = v) > 0
                    && (m1[w] = a[w] < m1[v] ? a[w] : m1[v]) > 0
                    && (ow[w] = a[w] < m1[v] ? w : a[w] == m1[v] ? 0 : ow[v]) >= 0
                    && (m2[w] = a[w] < m1[v] ? m1[v] : a[w] == m1[v] ? a[w] : Math.min(m2[v], a[w])) > 0
                    && (q[qn[0]++] = w) > 0).count() >= 0).count() >= 0
            && Arrays.stream(m1, 1, n + 1).sorted().asDoubleStream().toArray() instanceof double[] msd
            && Arrays.stream(a, 3 * n, 3 * n + k).sorted().asDoubleStream().toArray() instanceof double[] sad
            && new int[2 * N] instanceof int[] t
            && IntStream.range(0, N).filter(j -> (t[N + j] = j < k ? n + 1 + Arrays.binarySearch(msd, sad[j] - 0.5) - (k - j) : 1 << 29) * 0 == 0).count() >= 0
            && IntStream.iterate(N - 1, p -> p >= 1, p -> p - 1).filter(p -> (t[p] = Math.min(t[2 * p], t[2 * p + 1])) * 0 == 0).count() >= 0
            && (Boolean) (t[1] >= 0) instanceof Boolean ok0
            && (Integer) IntStream.range(0, k).filter(j -> t[N + j] < 0).max().orElse(-1) instanceof Integer jmax
            && (Integer) IntStream.range(0, k).filter(j -> t[N + j] < 0).min().orElse(0) instanceof Integer jmin
            && (Integer) (jmax < 0 ? 0 : (int) sad[jmax]) instanceof Integer S
            && new int[n + 1] instanceof int[] loA && new int[n + 1] instanceof int[] has
            && IntStream.rangeClosed(1, n).filter(u -> (loA[u] = a[u] < S ? -Arrays.binarySearch(sad, a[u] + 0.5) - 1 : 0) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> ow[v] > 0 && a[ow[v]] < S && -Arrays.binarySearch(sad, Math.min(m2[v], S) + 0.5) - 1 > loA[ow[v]]).mapToLong(v -> (has[ow[v]] = 1) * 0L + (((long) ow[v] << 20) | (-Arrays.binarySearch(sad, Math.min(m2[v], S) + 0.5) - 1))).sorted().toArray() instanceof long[] keys
            && IntStream.rangeClosed(1, n).filter(u -> has[u] == 1).mapToLong(u -> ((long) a[u] << 20) | u).sorted().toArray() instanceof long[] cand
            && new int[3] instanceof int[] w
            && ((IntBinaryOperator) (l, r) -> (w[0] = l + N) + (w[1] = r + N) + (w[2] = 1 << 29) > 0
                && IntStream.iterate(0, z -> w[0] < w[1], z -> z + 1).filter(z -> ((w[0] & 1) == 1 ? (w[2] = Math.min(w[2], t[w[0]++])) : 0) * 0 == 0
                    && ((w[1] & 1) == 1 ? (w[2] = Math.min(w[2], t[--w[1]])) : 0) * 0 == 0 && (w[0] >>= 1) + (w[1] >>= 1) >= 0).count() >= 0 ? w[2] : 0) instanceof IntBinaryOperator rmq
            && new int[]{-1} instanceof int[] res
            && (IntStream.range(0, cand.length).allMatch(i -> (Integer) (int) (cand[cand.length - 1 - i] & 1048575L) instanceof Integer u
                && (Integer) (-Arrays.binarySearch(keys, (long) u << 20) - 1) instanceof Integer s0
                && (Integer) (-Arrays.binarySearch(keys, (long) (u + 1) << 20) - 1) instanceof Integer e0
                && (Boolean) (loA[u] <= jmin && (keys[e0 - 1] & 1048575L) > jmax
                    && IntStream.range(0, e0 - s0).allMatch(g -> (Integer) (g == 0 ? loA[u] : (int) (keys[s0 + g - 1] & 1048575L)) instanceof Integer prev
                        && (Integer) (int) (keys[s0 + g] & 1048575L) instanceof Integer next
                        && (prev >= next || rmq.applyAsInt(prev, next) + (e0 - s0 - g) >= 0))) instanceof Boolean ok
                && (ok ? (res[0] = S - a[u]) < 0 : true)) || true)
            ? (ok0 ? 0 : res[0]) : "");
    }
}



