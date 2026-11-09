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
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer Q
            && new int[n + 1] instanceof int[] adj && new int[2 * n + 2] instanceof int[] to && new int[2 * n + 2] instanceof int[] nxt && new int[2 * n + 2] instanceof int[] wg && new int[]{0} instanceof int[] c
            && IntStream.range(0, n - 1).filter(e -> (Integer) a[2 + 3 * e] instanceof Integer x && (Integer) a[3 + 3 * e] instanceof Integer y && (Integer) a[4 + 3 * e] instanceof Integer wv
                && (to[++c[0]] = y) * 0 + (wg[c[0]] = wv) * 0 + (nxt[c[0]] = adj[x]) * 0 + (adj[x] = c[0]) >= 0
                && (to[++c[0]] = x) * 0 + (wg[c[0]] = wv) * 0 + (nxt[c[0]] = adj[y]) * 0 + (adj[y] = c[0]) >= 0).count() >= 0
            && ((IntFunction<Object[]>) r -> new int[n + 1] instanceof int[] par && new long[n + 1] instanceof long[] dep && new long[n + 1] instanceof long[] hh && new int[n + 1] instanceof int[] wt && new int[n + 1] instanceof int[] lc
                && new int[n] instanceof int[] qq && new int[]{1} instanceof int[] qn && (qq[0] = r) > 0
                && IntStream.range(0, n).filter(qi -> (Integer) qq[qi] instanceof Integer v
                    && IntStream.iterate(adj[v], e -> e > 0, e -> nxt[e]).filter(e -> (Integer) to[e] instanceof Integer w
                        && w != par[v] && (par[w] = v) > 0 && (wt[w] = wg[e]) > 0 && (dep[w] = dep[v] + wg[e]) > 0 && (qq[qn[0]++] = w) > 0).count() >= 0).count() >= 0
                && IntStream.range(1, n).map(i -> qq[n - i]).filter(v -> hh[v] + wt[v] > hh[par[v]] ? (hh[par[v]] = hh[v] + wt[v]) > 0 && (lc[par[v]] = v) > 0 : true).count() >= 0
                && IntStream.rangeClosed(1, n).filter(v -> v == r || lc[par[v]] != v).boxed().sorted(Comparator.comparingLong((Integer t) -> -(hh[t] + wt[t])).thenComparingLong(t -> dep[t])).mapToInt(t -> t).toArray() instanceof int[] tops
                && (Integer) tops.length instanceof Integer C && new long[C + 1] instanceof long[] pref && new int[n + 1] instanceof int[] rkT
                && IntStream.range(0, C).filter(i -> (rkT[tops[i]] = i + 1) > 0 && (pref[i + 1] = pref[i] + hh[tops[i]] + wt[tops[i]]) >= 0).count() >= 0
                && new int[n + 1] instanceof int[] cid && new int[n + 1] instanceof int[] rk
                && IntStream.range(0, n).map(i -> qq[i]).filter(v -> (cid[v] = (v == r || lc[par[v]] != v) ? v : cid[par[v]]) > 0 && (rk[v] = rkT[cid[v]]) > 0).count() >= 0
                && new int[17][n + 1] instanceof int[][] jp
                && IntStream.rangeClosed(1, n).filter(v -> (jp[0][v] = cid[v] == r ? 0 : cid[par[cid[v]]]) >= 0).count() >= 0
                && IntStream.range(1, 17).filter(j -> IntStream.rangeClosed(1, n).filter(v -> (jp[j][v] = jp[j - 1][jp[j - 1][v]]) >= 0).count() >= 0).count() >= 0
                && ((IntBinaryOperator) (x, m) -> rk[x] <= m ? x : m == 0 ? r : new int[]{cid[x]} instanceof int[] st
                    && IntStream.iterate(16, j -> j >= 0, j -> j - 1).filter(j -> jp[j][st[0]] != 0 && rk[jp[j][st[0]]] > m && (st[0] = jp[j][st[0]]) > 0).count() >= 0 ? par[st[0]] : 0) instanceof IntBinaryOperator zf
                ? new Object[]{(LongBinaryOperator) (x, y) -> (Integer) (int) x instanceof Integer xi && (Integer) (int) (2 * y - 1) instanceof Integer M
                    ? (M >= C ? pref[C] : rk[xi] <= M ? pref[M]
                        : (Integer) zf.applyAsInt(xi, M) instanceof Integer z2 && (Integer) zf.applyAsInt(xi, M - 1) instanceof Integer z1
                            ? Math.max(pref[M - 1] + dep[xi] + hh[xi] - dep[z1], pref[M] - hh[z2] + dep[xi] + hh[xi] - dep[z2]) : 0L) : 0L, dep} : null) instanceof IntFunction<Object[]> build
            && build.apply(1) instanceof Object[] o1 && (long[]) o1[1] instanceof long[] d1
            && (Integer) IntStream.rangeClosed(1, n).reduce((p, v) -> d1[v] > d1[p] ? v : p).getAsInt() instanceof Integer r1
            && build.apply(r1) instanceof Object[] o2 && (long[]) o2[1] instanceof long[] d2
            && (Integer) IntStream.rangeClosed(1, n).reduce((p, v) -> d2[v] > d2[p] ? v : p).getAsInt() instanceof Integer r2
            && build.apply(r2) instanceof Object[] o3
            && (LongBinaryOperator) o2[0] instanceof LongBinaryOperator f1 && (LongBinaryOperator) o3[0] instanceof LongBinaryOperator f2
            && new long[Q] instanceof long[] res && new long[]{0} instanceof long[] prev
            && IntStream.range(0, Q).filter(i -> (Long) ((a[2 + 3 * (n - 1) + 2 * i] + prev[0] - 1) % n + 1) instanceof Long x && (Long) ((a[3 + 3 * (n - 1) + 2 * i] + prev[0] - 1) % n + 1) instanceof Long y
                && (prev[0] = res[i] = Math.max(f1.applyAsLong(x, y), f2.applyAsLong(x, y))) >= 0).count() >= 0
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
