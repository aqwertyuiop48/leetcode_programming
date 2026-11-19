


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(n - 1) instanceof Integer m
            && new int[n + 1] instanceof int[] deg
            && new int[n + 1] instanceof int[] xr
            && new int[n + 1] instanceof int[] xe
            && IntStream.range(0, m).allMatch(e ->
                ++deg[tk[1 + 3 * e]] > 0 && ++deg[tk[2 + 3 * e]] > 0
                && (xr[tk[1 + 3 * e]] ^= tk[2 + 3 * e]) >= 0 && (xr[tk[2 + 3 * e]] ^= tk[1 + 3 * e]) >= 0
                && (xe[tk[1 + 3 * e]] ^= e) >= 0 && (xe[tk[2 + 3 * e]] ^= e) >= 0 || true)
            && Arrays.copyOf(IntStream.rangeClosed(1, n).filter(i -> deg[i] == 1).toArray(), n + 1) instanceof int[] qu
            && new int[]{(int) IntStream.rangeClosed(1, n).filter(i -> deg[i] == 1).count()} instanceof int[] qt
            && new int[n + 1] instanceof int[] par
            && new int[m + 1] instanceof int[] cn
            && new int[m + 1] instanceof int[] pn
            && IntStream.range(0, m).allMatch(i ->
                Integer.valueOf(qu[i]) instanceof Integer lf
                && Integer.valueOf(xr[lf]) instanceof Integer nb
                && Integer.valueOf(xe[lf]) instanceof Integer e
                && (cn[e] = lf) > 0 && (pn[e] = nb) > 0 && (par[lf] = nb) > 0
                && (xr[nb] ^= lf) >= 0 && (xe[nb] ^= e) >= 0
                && (--deg[nb] != 1 || (qu[qt[0]++] = nb) > 0))
            && new int[n + 1] instanceof int[] dep
            && IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (dep[qu[i]] = dep[par[qu[i]]] + 1) > 0)
            && IntStream.range(0, m).mapToLong(e -> (long) tk[3 + 3 * e] << 34 | (long) (131071 - dep[cn[e]]) << 17 | e).sorted().toArray() instanceof long[] ks
            && IntStream.range(0, m).map(i -> (int) (ks[i] & 131071L)).toArray() instanceof int[] od
            && IntStream.range(0, m).filter(i -> i == 0 || (ks[i] >> 34) != (ks[i - 1] >> 34)).toArray() instanceof int[] gs
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] p
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && new int[n + 1] instanceof int[] sub
            && new int[n + 1] instanceof int[] vis
            && new int[n + 1] instanceof int[] tv
            && new int[n + 1] instanceof int[] tt
            && new int[m + 1] instanceof int[] ea
            && new int[m + 1] instanceof int[] eb
            && new int[m + 1] instanceof int[] es
            && new long[m + 1] instanceof long[] val
            && new int[]{0, 0, 0, 0, gs.length > 1 ? gs[1] : m} instanceof int[] z
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = x -> p[x] == x ? x : (p[x] = fh[0].applyAsInt(p[x]))) instanceof IntUnaryOperator find
            && IntStream.range(0, 2 * m).allMatch(step ->
                Integer.valueOf(od[z[1]]) instanceof Integer e
                && (z[0] == 0
                    ? Integer.valueOf(find.applyAsInt(cn[e])) instanceof Integer a
                        && Integer.valueOf(find.applyAsInt(pn[e])) instanceof Integer b
                        && (vis[a] == z[2] + 1 || ((vis[a] = z[2] + 1) > 0 && (sub[a] = sz[a]) > 0))
                        && (vis[b] == z[2] + 1 || ((vis[b] = z[2] + 1) > 0 && (sub[b] = sz[b]) > 0))
                        && (ea[e] = a) > 0 && (eb[e] = b) > 0 && (es[e] = sub[a]) > 0 && (sub[b] += sub[a]) > 0
                        && (++z[1] != z[4] || ((z[0] = 1) > 0 && (z[1] = z[4] - 1) >= 0))
                    : Integer.valueOf(ea[e]) instanceof Integer a2
                        && Integer.valueOf(eb[e]) instanceof Integer b2
                        && Integer.valueOf(tv[b2] == z[2] + 1 ? tt[b2] : sub[b2]) instanceof Integer tot
                        && (val[e] = 2L * es[e] * (tot - es[e])) >= 0
                        && (tt[a2] = tot) > 0 && (tv[a2] = z[2] + 1) > 0
                        && Integer.valueOf(find.applyAsInt(cn[e])) instanceof Integer ra
                        && Integer.valueOf(find.applyAsInt(pn[e])) instanceof Integer rb
                        && (ra - rb == 0 || (Integer.valueOf(sz[ra] < sz[rb] ? ra : rb) instanceof Integer lo
                            && (p[lo] = ra + rb - lo) > 0
                            && (sz[ra + rb - lo] += sz[lo]) > 0))
                        && (z[1] != z[3]
                            ? --z[1] >= 0
                            : ++z[2] > 0 && (z[0] = 0) == 0 && (z[3] = z[4]) >= 0 && (z[1] = z[3]) >= 0
                                && (z[4] = z[2] + 1 < gs.length ? gs[z[2] + 1] : m) >= 0)))
            && (Long) LongStream.of(val).max().getAsLong() instanceof Long mx
            ? mx + " " + IntStream.range(0, m).filter(i -> val[i] == mx).count() + "\n"
                + IntStream.range(0, m).filter(i -> val[i] == mx).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))
            : "");
    }
}
