import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (st[3] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : st[1] == 1 ? (nums[st[2]++] = st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 : 0) > 5).count() >= 0
            && new int[] {0} instanceof int[] ps && ((IntSupplier) () -> nums[ps[0]++]) instanceof IntSupplier ni
            && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer q
            && new int[n + 1] instanceof int[] adjHead && new int[2 * n + 2] instanceof int[] adjNext && new int[2 * n + 2] instanceof int[] to
            && IntStream.range(0, n - 1).filter(i -> Integer.valueOf(ni.getAsInt()) instanceof Integer a && Integer.valueOf(ni.getAsInt()) instanceof Integer b
                && (to[2 * i + 1] = b) > 0 && (adjNext[2 * i + 1] = adjHead[a]) >= 0 && (adjHead[a] = 2 * i + 1) > 0 && (to[2 * i + 2] = a) > 0 && (adjNext[2 * i + 2] = adjHead[b]) >= 0 && (adjHead[b] = 2 * i + 2) < 0).count() >= 0
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] ord && new int[] {1} instanceof int[] tl && (ord[0] = 1) == 1
            && IntStream.iterate(0, i -> i < tl[0], i -> i + 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && IntStream.iterate(adjHead[v], e -> e != 0, e -> adjNext[e]).filter(e -> to[e] != par[v] && (par[to[e]] = v) > 0 && (dep[to[e]] = dep[v] + 1) > 0 && (ord[tl[0]++] = to[e]) < 0).count() >= 0).count() >= 0
            && new int[n + 1] instanceof int[] sub && new int[n + 1] instanceof int[] heavy && IntStream.rangeClosed(1, n).filter(v -> (sub[v] = 1) < 0).count() >= 0
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && (sub[par[v]] += sub[v]) > 0 && (heavy[par[v]] == 0 || sub[v] > sub[heavy[par[v]]]) && (heavy[par[v]] = v) < 0).count() >= 0
            && new int[n + 1] instanceof int[] pos && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] stk && new int[] {1, 0} instanceof int[] sp && (stk[0] = 1) == 1 && (head[1] = 1) == 1
            && IntStream.iterate(0, z -> sp[0] > 0, z -> z + 1).filter(z -> Integer.valueOf(stk[--sp[0]]) instanceof Integer v && (pos[v] = sp[1]++) >= 0
                && IntStream.iterate(adjHead[v], e -> e != 0, e -> adjNext[e]).filter(e -> to[e] != par[v] && to[e] != heavy[v] && (head[to[e]] = to[e]) > 0 && (stk[sp[0]++] = to[e]) < 0).count() >= 0
                && (heavy[v] == 0 || ((head[heavy[v]] = head[v]) > 0 && (stk[sp[0]++] = heavy[v]) > 0))).count() >= 0
            && new int[n + 2] instanceof int[] gs && new int[m + 1] instanceof int[] cv && IntStream.rangeClosed(1, m).filter(i -> (cv[i] = ni.getAsInt()) > 0 && gs[cv[i] + 1]++ < 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> (gs[v + 1] += gs[v]) < 0).count() >= 0
            && new int[m] instanceof int[] gl && new int[n + 2] instanceof int[] fl && IntStream.rangeClosed(1, m).filter(i -> (gl[gs[cv[i]] + fl[cv[i]]++] = i) < 0).count() >= 0
            && new int[n + 2] instanceof int[] ptr && IntStream.rangeClosed(1, n).filter(v -> (ptr[v] = gs[v]) < 0).count() >= 0
            && Long.valueOf(2000000000000000000L) instanceof Long INF && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * n - 1))) instanceof Integer SZ
            && new long[2 * SZ] instanceof long[] mn && new long[2 * SZ] instanceof long[] tg && new int[2 * SZ] instanceof int[] who && new int[2 * SZ] instanceof int[] nl && new int[2 * SZ] instanceof int[] nr
            && IntStream.range(0, SZ).filter(i -> (mn[SZ + i] = INF) < 0 || (nl[SZ + i] = i) < 0 || (nr[SZ + i] = i) < 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> (who[SZ + pos[v]] = v) < 0 || (gs[v] < gs[v + 1] && (mn[SZ + pos[v]] = gl[gs[v]]) < 0)).count() >= 0
            && new IntUnaryOperator[3] instanceof IntUnaryOperator[] fn && new long[] {0, 0, 0, 0} instanceof long[] g
            && ((IntUnaryOperator) x -> tg[x] == 0 ? 0 : Arrays.asList(mn[2 * x] += tg[x], tg[2 * x] += tg[x], mn[2 * x + 1] += tg[x], tg[2 * x + 1] += tg[x], tg[x] = 0L).size()) instanceof IntUnaryOperator pushf
            && ((IntUnaryOperator) x -> Integer.valueOf(mn[2 * x] < mn[2 * x + 1] || (mn[2 * x] == mn[2 * x + 1] && who[2 * x] < who[2 * x + 1]) ? 2 * x : 2 * x + 1) instanceof Integer c ? Arrays.asList(mn[x] = mn[c], who[x] = who[c]).size() : 0) instanceof IntUnaryOperator pullf
            && IntStream.iterate(SZ - 1, x -> x >= 1, x -> x - 1).filter(x -> (nl[x] = nl[2 * x]) < 0 || (nr[x] = nr[2 * x + 1]) < 0 || pullf.applyAsInt(x) < 0).count() >= 0
            && (fn[0] = x -> g[1] < nl[x] || nr[x] < g[0] ? 0 : g[0] <= nl[x] && nr[x] <= g[1] ? Arrays.asList(mn[x] += g[2], tg[x] += g[2]).size()
                : pushf.applyAsInt(x) + fn[0].applyAsInt(2 * x) + fn[0].applyAsInt(2 * x + 1) + pullf.applyAsInt(x)) != null
            && new long[] {0} instanceof long[] bv && new int[] {0} instanceof int[] bw
            && (fn[1] = x -> g[1] < nl[x] || nr[x] < g[0] ? 0 : g[0] <= nl[x] && nr[x] <= g[1] ? (mn[x] < bv[0] || (mn[x] == bv[0] && who[x] < bw[0]) ? Arrays.asList(bv[0] = mn[x], bw[0] = who[x]).size() : 0)
                : pushf.applyAsInt(x) + fn[1].applyAsInt(2 * x) + fn[1].applyAsInt(2 * x + 1)) != null
            && ((IntBinaryOperator) (a, b) -> Arrays.asList(g[0] = a, g[1] = b, fn[1].applyAsInt(1)).size()) instanceof IntBinaryOperator qry
            && new StringBuilder() instanceof StringBuilder out
            && IntStream.range(0, q).filter(ev -> ni.getAsInt() == 1
                ? Integer.valueOf(ni.getAsInt()) instanceof Integer u && Integer.valueOf(ni.getAsInt()) instanceof Integer w && Integer.valueOf(ni.getAsInt()) instanceof Integer k && new StringBuilder() instanceof StringBuilder line && new int[] {0} instanceof int[] taken
                    && (IntStream.rangeClosed(1, k).anyMatch(t -> new int[] {u, w} instanceof int[] c && (bv[0] = Long.MAX_VALUE) > 0 && (bw[0] = 0) == 0
                        && IntStream.iterate(0, z -> head[c[0]] != head[c[1]], z -> z + 1).filter(z -> Integer.valueOf(dep[head[c[0]]] >= dep[head[c[1]]] ? 0 : 1) instanceof Integer d && qry.applyAsInt(pos[head[c[d]]], pos[c[d]]) > 0 && (c[d] = par[head[c[d]]]) < 0).count() >= 0
                        && qry.applyAsInt(Math.min(pos[c[0]], pos[c[1]]), Math.max(pos[c[0]], pos[c[1]])) > 0
                        && (bv[0] >= 1000000000000000000L || !(Integer.valueOf(bw[0]) instanceof Integer vv && Integer.valueOf(gl[ptr[vv]]) instanceof Integer id && line.append(' ').append(id) != null && taken[0]++ >= 0 && ptr[vv]++ >= 0
                            && Arrays.asList(g[0] = pos[vv], g[1] = pos[vv], g[2] = ptr[vv] < gs[vv + 1] ? gl[ptr[vv]] - id : 1000000000000000000L, fn[0].applyAsInt(1)).size() > 0))) || true)
                    && out.append(taken[0]).append(line).append((char) 10) != null
                : Integer.valueOf(ni.getAsInt()) instanceof Integer v && Integer.valueOf(ni.getAsInt()) instanceof Integer kk && Arrays.asList(g[0] = pos[v], g[1] = pos[v] + sub[v] - 1, g[2] = kk, fn[0].applyAsInt(1)).size() > 0).count() >= 0
            ? out.toString().trim() : "");
    }
}
