import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Long.valueOf(1000000007L) instanceof Long M
            && new int[n + 2] instanceof int[] st
            && IntStream.range(0, n - 1).allMatch(e -> ++st[g0[1 + 3 * e] + 1] > 0 && ++st[g0[2 + 3 * e] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (st[v] += st[v - 1]) >= 0)
            && Arrays.copyOf(st, n + 2) instanceof int[] fp
            && new int[2 * n + 2] instanceof int[] adj
            && new int[2 * n + 2] instanceof int[] wt
            && IntStream.range(0, n - 1).allMatch(e ->
                (adj[fp[g0[1 + 3 * e]]] = g0[2 + 3 * e]) > 0 && (wt[fp[g0[1 + 3 * e]]++] = g0[3 + 3 * e]) > 0
                && (adj[fp[g0[2 + 3 * e]]] = g0[1 + 3 * e]) > 0 && (wt[fp[g0[2 + 3 * e]]++] = g0[3 + 3 * e]) > 0)
            && new int[n + 2] instanceof int[] order
            && new int[n + 2] instanceof int[] par
            && new int[n + 2] instanceof int[] lvl
            && new long[n + 2] instanceof long[] pw
            && new long[n + 2] instanceof long[] dep
            && new int[]{1} instanceof int[] tl
            && (order[0] = 1) == 1
            && IntStream.range(0, n).allMatch(i ->
                Integer.valueOf(order[i]) instanceof Integer v
                && IntStream.range(st[v], st[v + 1]).allMatch(k ->
                    adj[k] == par[v]
                    || ((par[adj[k]] = v) > 0 && (pw[adj[k]] = wt[k]) > 0 && (lvl[adj[k]] = lvl[v] + 1) > 0
                        && (dep[adj[k]] = dep[v] + wt[k]) > 0 && (order[tl[0]++] = adj[k]) > 0)))
            && new long[n + 2] instanceof long[] sz
            && new long[n + 2] instanceof long[] sd1
            && new long[n + 2] instanceof long[] sd2
            && IntStream.rangeClosed(1, n).allMatch(v -> (sz[v] = 1) > 0)
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i ->
                Integer.valueOf(order[i]) instanceof Integer v
                && Integer.valueOf(par[v]) instanceof Integer p
                && (sz[p] += sz[v]) > 0
                && (sd1[p] = (sd1[p] + sd1[v] + pw[v] * sz[v]) % M) >= 0
                && (sd2[p] = (sd2[p] + sd2[v] + 2 * pw[v] % M * sd1[v] + pw[v] * pw[v] % M * sz[v]) % M) >= 0)
            && new long[n + 2] instanceof long[] r1
            && new long[n + 2] instanceof long[] r2
            && (r1[1] = sd1[1]) >= 0
            && (r2[1] = sd2[1]) >= 0
            && IntStream.range(1, n).allMatch(i ->
                Integer.valueOf(order[i]) instanceof Integer v
                && Integer.valueOf(par[v]) instanceof Integer p
                && (r1[v] = (r1[p] + pw[v] * (((n - 2 * sz[v]) % M + M) % M)) % M) >= 0
                && (r2[v] = (r2[p] + n * pw[v] % M * pw[v] + 2 * pw[v] % M * (((r1[p] - 2 * ((sd1[v] + pw[v] * sz[v]) % M)) % M + M) % M)) % M) >= 0)
            && Integer.valueOf(n + 1) instanceof Integer w1
            && new int[17 * w1] instanceof int[] up
            && IntStream.rangeClosed(1, n).allMatch(v -> (up[v] = par[v] == 0 ? 1 : par[v]) > 0)
            && IntStream.range(1, 17).allMatch(k -> IntStream.rangeClosed(1, n).allMatch(v -> (up[k * w1 + v] = up[(k - 1) * w1 + up[(k - 1) * w1 + v]]) > 0))
            && new int[3] instanceof int[] ab
            && ((IntBinaryOperator) (x, y) ->
                (ab[0] = lvl[x] >= lvl[y] ? x : y) > 0
                && (ab[1] = lvl[x] >= lvl[y] ? y : x) > 0
                && (ab[2] = lvl[ab[0]] - lvl[ab[1]]) >= 0
                && IntStream.range(0, 17).allMatch(k -> (ab[2] >> k & 1) == 0 || (ab[0] = up[k * w1 + ab[0]]) > 0)
                && (ab[0] == ab[1]
                    || (IntStream.iterate(16, k -> k >= 0, k -> k - 1).allMatch(k ->
                            up[k * w1 + ab[0]] == up[k * w1 + ab[1]] || ((ab[0] = up[k * w1 + ab[0]]) > 0 && (ab[1] = up[k * w1 + ab[1]]) > 0))
                        && (ab[0] = up[ab[0]]) > 0))
                ? ab[0] : -1) instanceof IntBinaryOperator lca
            ? IntStream.range(0, g0[3 * n - 2]).mapToObj(j ->
                Integer.valueOf(g0[3 * n - 1 + 2 * j]) instanceof Integer u
                && Integer.valueOf(g0[3 * n + 2 * j]) instanceof Integer v
                && Integer.valueOf(lca.applyAsInt(u, v)) instanceof Integer l
                && Long.valueOf((dep[u] + dep[v] - 2 * dep[l]) % M) instanceof Long D
                && Long.valueOf(l - v == 0
                    ? r2[u] - 2 * (((n - sz[v]) * D % M * D % M + 2 * D % M * ((r1[v] - sd1[v] + M) % M) % M + (r2[v] - sd2[v] + M) % M) % M)
                    : 2 * ((sz[v] * D % M * D % M + 2 * D % M * sd1[v] % M + sd2[v]) % M) - r2[u]) instanceof Long f
                ? (((f % M) + M) % M) + "\n"
                : "").collect(Collectors.joining())
            : "");
    }
}
