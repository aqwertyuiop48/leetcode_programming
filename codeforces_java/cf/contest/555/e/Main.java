import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer m && (Integer) (int) tk[2] instanceof Integer q
            && new int[n + 2] instanceof int[] deg && new int[n + 2] instanceof int[] start && new int[2 * m] instanceof int[] to && new int[2 * m] instanceof int[] ed
            && IntStream.range(0, m).mapToLong(e -> deg[(int) tk[3 + 2 * e]]++ + deg[(int) tk[4 + 2 * e]]++).sum() >= 0
            && IntStream.rangeClosed(1, n).mapToLong(i -> start[i + 1] = start[i] + deg[i]).sum() >= 0
            && start.clone() instanceof int[] pos
            && IntStream.range(0, m).mapToLong(e -> (to[pos[(int) tk[3 + 2 * e]]] = (int) tk[4 + 2 * e]) + (ed[pos[(int) tk[3 + 2 * e]]++] = e) + (to[pos[(int) tk[4 + 2 * e]]] = (int) tk[3 + 2 * e]) + (ed[pos[(int) tk[4 + 2 * e]]++] = e)).sum() >= 0
            && new int[n + 1] instanceof int[] rt && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] dep && new int[n] instanceof int[] ord && new int[]{0, 0, 1} instanceof int[] bq
            && IntStream.range(0, n).allMatch(t -> (bq[0] != bq[1] || (Integer) IntStream.range(bq[2], n + 1).filter(v -> rt[v] == 0).findFirst().getAsInt() instanceof Integer v0 && (rt[v0] = v0) > 0 && (bq[2] = v0 + 1) > 0 && (pe[v0] = -1) < 0 && (ord[bq[1]++] = v0) > 0)
                && (Integer) ord[bq[0]++] instanceof Integer u
                && IntStream.range(start[u], start[u + 1]).filter(k -> rt[to[k]] == 0).mapToLong(k -> (rt[to[k]] = rt[u]) + (par[to[k]] = u) + (pe[to[k]] = ed[k]) + (dep[to[k]] = dep[u] + 1) + (ord[bq[1]++] = to[k])).sum() >= 0)
            && new int[18][n + 1] instanceof int[][] up
            && Stream.of(0).peek(z -> Arrays.setAll(up[0], v -> par[v] == 0 ? v : par[v])).findFirst().isPresent()
            && IntStream.range(1, 18).allMatch(j -> Stream.of(0).peek(z -> Arrays.setAll(up[j], v -> up[j - 1][up[j - 1][v]])).findFirst().isPresent())
            && (IntBinaryOperator) ((u1, v1) -> (Integer) (dep[u1] >= dep[v1] ? u1 : v1) instanceof Integer dp && (Integer) (dep[u1] >= dep[v1] ? v1 : u1) instanceof Integer sh
                && (Integer) IntStream.range(0, 18).reduce(dp, (c, j) -> (dep[dp] - dep[sh] >> j & 1) == 1 ? up[j][c] : c) instanceof Integer cur
                ? (cur.equals(sh) ? sh : new int[]{cur, sh} instanceof int[] ab && IntStream.iterate(17, j -> j - 1).limit(18).mapToLong(j -> up[j][ab[0]] != up[j][ab[1]] ? (ab[0] = up[j][ab[0]]) + (ab[1] = up[j][ab[1]]) : 0).sum() >= 0 ? up[0][ab[0]] : 0) : 0) instanceof IntBinaryOperator lca
            && IntStream.range(0, n + 1).toArray() instanceof int[] top
            && (IntUnaryOperator) (x -> IntStream.iterate(x, v -> top[v] != v ? (top[v] = top[top[v]]) : v).filter(v -> top[v] == v).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && IntStream.range(0, m).allMatch(e -> pe[(int) tk[3 + 2 * e]] == e || pe[(int) tk[4 + 2 * e]] == e
                || Stream.iterate(new int[]{find.applyAsInt((int) tk[3 + 2 * e]), find.applyAsInt((int) tk[4 + 2 * e])}, w -> w[0] != w[1],
                    w -> dep[w[0]] >= dep[w[1]] ? new int[]{find.applyAsInt(top[w[0]] = par[w[0]]), w[1]} : new int[]{w[0], find.applyAsInt(top[w[1]] = par[w[1]])}).count() >= 0)
            && new int[n + 1] instanceof int[] upc && new int[n + 1] instanceof int[] dnc
            && IntStream.range(0, q).allMatch(i -> (Integer) (int) tk[3 + 2 * m + 2 * i] instanceof Integer s && (Integer) (int) tk[4 + 2 * m + 2 * i] instanceof Integer t2 && rt[s] == rt[t2]
                && (Integer) lca.applyAsInt(s, t2) instanceof Integer l && ((upc[s] += 1) | (upc[l] -= 1) | (dnc[t2] += 1) | (dnc[l] -= 1) | 1) != 0)
            && IntStream.range(0, n).map(i -> ord[n - 1 - i]).allMatch(v -> par[v] == 0 || !(find.applyAsInt(v) == v && upc[v] > 0 && dnc[v] > 0) && ((upc[par[v]] += upc[v]) | (dnc[par[v]] += dnc[v]) | 1) != 0)
            ? "Yes" : "No");
    }
}
