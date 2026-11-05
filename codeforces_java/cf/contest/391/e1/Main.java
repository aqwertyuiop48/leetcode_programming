import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && IntStream.range(0, 3).map(i -> nx.getAsInt()).toArray() instanceof int[] ns
            && new int[2 * (ns[0] + ns[1] + ns[2]) + 8] instanceof int[] tk && new int[3] instanceof int[] q
            && IntStream.range(ps[0], buf.length + 1).allMatch(i -> (i < buf.length ? buf[i] : '\n') >= '0'
                ? (q[0] = q[0] * 10 + buf[i] - '0') >= 0 && (q[2] = 1) > 0
                : q[2] == 0 || ((tk[q[1]++] = q[0]) >= 0 && (q[0] = 0) == 0 && (q[2] = 0) == 0))
            && new int[]{0, 2 * (ns[0] - 1), 2 * (ns[0] - 1) + 2 * (ns[1] - 1)} instanceof int[] off
            && ((IntFunction<Object[]>) t -> Integer.valueOf(ns[t]) instanceof Integer n && Integer.valueOf(off[t]) instanceof Integer o
                && new int[n + 1] instanceof int[] st && new int[2 * n] instanceof int[] nb
                && IntStream.range(0, 2 * (n - 1)).allMatch(j -> ++st[tk[o + j]] > 0)
                && IntStream.range(0, n).allMatch(i -> (st[i + 1] += st[i]) >= 0)
                && st.clone() instanceof int[] pos
                && IntStream.range(0, n - 1).allMatch(e -> (nb[pos[tk[o + 2 * e] - 1]++] = tk[o + 2 * e + 1] - 1) >= 0 && (nb[pos[tk[o + 2 * e + 1] - 1]++] = tk[o + 2 * e] - 1) >= 0)
                && new int[n] instanceof int[] od && new int[n] instanceof int[] pa && new int[n] instanceof int[] dp && new int[]{0, 0, 1} instanceof int[] x
                && (pa[0] = -1) < 0
                && IntStream.range(0, 3 * n - 2).allMatch(z -> x[1] < st[od[x[0]] + 1]
                    ? nb[x[1]] == pa[od[x[0]]] ? ++x[1] > 0
                        : (pa[nb[x[1]]] = od[x[0]]) >= 0 && (dp[nb[x[1]]] = dp[od[x[0]]] + 1) > 0 && (od[x[2]++] = nb[x[1]++]) >= 0
                    : ++x[0] < n ? (x[1] = st[od[x[0]]]) >= 0 : true)
                && new long[n] instanceof long[] sz && new long[n] instanceof long[] s
                && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0)
                && IntStream.range(1, n).allMatch(i -> (sz[pa[od[n - i]]] += sz[od[n - i]]) > 0)
                && (s[0] = IntStream.range(0, n).mapToLong(i -> dp[i]).sum()) >= 0
                && IntStream.range(1, n).allMatch(i -> (s[od[i]] = s[pa[od[i]]] + n - 2 * sz[od[i]]) >= 0)
                ? new Object[]{new long[]{n, Arrays.stream(s).sum() / 2, Arrays.stream(s).max().getAsLong()}, s, od, pa} : null) instanceof IntFunction<Object[]> tree
            && IntStream.range(0, 3).mapToObj(tree::apply).toList() instanceof List<Object[]> tr
            ? IntStream.range(0, 3).mapToLong(m -> tr.get(m) instanceof Object[] M && M[0] instanceof long[] mi && M[1] instanceof long[] S && M[2] instanceof int[] od && M[3] instanceof int[] pa
                && tr.get((m + 1) % 3)[0] instanceof long[] li && tr.get((m + 2) % 3)[0] instanceof long[] ri
                && Integer.valueOf((int) mi[0]) instanceof Integer n && Long.valueOf(ri[0]) instanceof Long c && Long.valueOf(Long.MIN_VALUE / 4) instanceof Long NEG
                && new long[n] instanceof long[] d1 && new long[n] instanceof long[] m1 && new long[n] instanceof long[] m2 && new long[n] instanceof long[] up && new int[n] instanceof int[] who
                && IntStream.range(0, n).allMatch(i -> (m1[i] = NEG) < 0 && (m2[i] = NEG) < 0 && (up[i] = NEG) < 0)
                && IntStream.range(1, n).allMatch(i -> Integer.valueOf(od[n - i]) instanceof Integer u && Integer.valueOf(pa[u]) instanceof Integer v
                    && (d1[u] = Math.max(S[u], m1[u])) > NEG && Long.valueOf(d1[u] + c) instanceof Long val
                    && (val > m1[v] ? (m2[v] = m1[v]) <= m1[v] && (m1[v] = val) > NEG && (who[v] = u) >= 0 : val > m2[v] ? (m2[v] = val) > NEG : true))
                && (d1[0] = Math.max(S[0], m1[0])) > NEG
                && IntStream.range(1, n).allMatch(i -> Integer.valueOf(od[i]) instanceof Integer u && Integer.valueOf(pa[u]) instanceof Integer v
                    && (up[u] = c + Math.max(up[v], Math.max(S[v], who[v] == u ? m2[v] : m1[v]))) > NEG)
                ? tr.stream().mapToLong(x -> ((long[]) x[0])[1]).sum() + li[0] * mi[0] + ri[0] * mi[0] + 2 * li[0] * ri[0] + li[2] * (mi[0] + ri[0]) + ri[2] * (li[0] + mi[0])
                    + IntStream.range(0, n).mapToLong(u -> ri[0] * S[u] + li[0] * Math.max(d1[u], up[u])).max().getAsLong() : 0L).max().getAsLong() : "");
    }
}

