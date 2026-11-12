
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                (i == raw.length ? 32 : (int) raw[i]) >= '0' && (i == raw.length ? 32 : (int) raw[i]) <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') < 0 | (ps[2] = 1) < 0
                    : ps[2] != 0 && ((g[ps[1]++] = ps[0]) == Integer.MIN_VALUE | (ps[0] = 0) != 0 | (ps[2] = 0) != 0)).count() >= 0
            && Integer.valueOf(g[0] * 2) instanceof Integer N && Integer.valueOf(N * 3) instanceof Integer N3
            && new int[N] instanceof int[] deg
            && IntStream.range(0, 2 * (N - 1)).allMatch(i -> ++deg[g[1 + i] - 1] > 0)
            && Arrays.stream(deg).max().getAsInt() <= 3
            && IntStream.range(0, N3).map(i -> -1).toArray() instanceof int[] adjv
            && new int[N] instanceof int[] fill
            && IntStream.range(0, N - 1).allMatch(i -> (adjv[(g[1 + 2 * i] - 1) * 3 + fill[g[1 + 2 * i] - 1]++] = g[2 + 2 * i] - 1) >= 0 && (adjv[(g[2 + 2 * i] - 1) * 3 + fill[g[2 + 2 * i] - 1]++] = g[1 + 2 * i] - 1) >= 0)
            && new int[N] instanceof int[] par && new int[N] instanceof int[] ord && new int[]{1} instanceof int[] cn
            && (par[0] = -1) < 0
            && IntStream.range(0, N3).allMatch(t -> Integer.valueOf(ord[t / 3]) instanceof Integer u
                && (t % 3 >= deg[u] || adjv[u * 3 + t % 3] == par[u] || (par[adjv[u * 3 + t % 3]] = u) >= 0 && (ord[cn[0]++] = adjv[u * 3 + t % 3]) >= 0))
            && IntStream.range(0, N).map(i -> 1).toArray() instanceof int[] sz
            && IntStream.range(1, N).allMatch(i -> (sz[par[ord[N - i]]] += sz[ord[N - i]]) > 0)
            && new int[4 * N] instanceof int[] sizeE && new int[N3] instanceof int[] nxt
            && IntStream.range(0, N3).allMatch(e -> adjv[e] < 0 || (sizeE[e] = par[adjv[e]] == e / 3 ? sz[adjv[e]] : N - sz[e / 3]) > 0
                && (nxt[e] = deg[adjv[e]] == 2 ? adjv[e] * 3 + (adjv[adjv[e] * 3] == e / 3 ? 1 : 0) : -1) >= -1)
            && IntStream.range(0, N3).filter(e -> adjv[e] >= 0).mapToLong(e -> ((long) sizeE[e] << 20) | e).sorted().toArray() instanceof long[] keys
            && Arrays.stream(keys).mapToInt(k -> (int) (k & 1048575)).toArray() instanceof int[] eo
            && new int[N3] instanceof int[] steps && new int[N3] instanceof int[] endE && new int[N3] instanceof int[] peE
            && IntStream.of(eo).allMatch(e -> (nxt[e] < 0 ? (steps[e] = 0) == 0 && (endE[e] = e) >= 0 : (steps[e] = steps[nxt[e]] + 1) > 0 && (endE[e] = endE[nxt[e]]) >= 0)
                && (peE[e] = deg[adjv[endE[e]]] == 1 ? 1 : 0) >= 0)
            && IntStream.range(0, N3).map(i -> -1).toArray() instanceof int[] pred
            && IntStream.of(eo).allMatch(e -> nxt[e] < 0 || (pred[nxt[e]] = e) >= 0)
            && new int[N3] instanceof int[] start && new int[N3] instanceof int[] base && new int[1] instanceof int[] off
            && IntStream.range(0, eo.length).map(i -> eo[eo.length - 1 - i]).allMatch(e -> pred[e] < 0
                ? (start[e] = e) >= 0 && (base[e] = off[0]) >= 0 && (off[0] += steps[e] + 1) > 0
                : (start[e] = start[pred[e]]) >= 0)
            && new int[off[0]] instanceof int[] seq && new int[N3] instanceof int[] pos
            && IntStream.of(eo).allMatch(e -> (pos[e] = base[start[e]] + steps[start[e]] - steps[e]) >= 0 && (seq[pos[e]] = e) >= 0)
            && IntStream.range(0, 4 * N).map(i -> -1).toArray() instanceof int[] kid0 && IntStream.range(0, 4 * N).map(i -> -1).toArray() instanceof int[] kid1 && new int[4 * N] instanceof int[] kcnt
            && IntStream.of(eo).allMatch(e -> Integer.valueOf(adjv[e] * 3) instanceof Integer vb && Integer.valueOf(e / 3) instanceof Integer u
                && Boolean.valueOf(adjv[vb] >= 0 && adjv[vb] != u) instanceof Boolean a0 && Boolean.valueOf(adjv[vb + 1] >= 0 && adjv[vb + 1] != u) instanceof Boolean a1 && Boolean.valueOf(adjv[vb + 2] >= 0 && adjv[vb + 2] != u) instanceof Boolean a2
                && (kcnt[e] = (a0 ? 1 : 0) + (a1 ? 1 : 0) + (a2 ? 1 : 0)) >= 0
                && (kid0[e] = a0 ? vb : a1 ? vb + 1 : a2 ? vb + 2 : -1) >= -1
                && (kid1[e] = a0 && a1 ? vb + 1 : a2 && (a0 || a1) ? vb + 2 : -1) >= -1)
            && IntStream.range(0, N).allMatch(x -> (sizeE[N3 + x] = N) > 0 && (kcnt[N3 + x] = deg[x]) >= 0 && (kid0[N3 + x] = x * 3) >= 0 && (kid1[N3 + x] = x * 3 + 1) >= 0)
            && new int[4 * N] instanceof int[] P
            && ((IntBinaryOperator) (a, b) -> peE[a] == 0 ? 0 : sizeE[a] == sizeE[b] ? peE[b] : sizeE[a] > sizeE[b] || sizeE[a] > steps[b] ? 0 : P[seq[pos[b] + sizeE[a]]]) instanceof IntBinaryOperator alpha
            && ((IntBinaryOperator) (a, b) -> ((sizeE[a] + sizeE[b]) & 1) == 1 ? 0 : sizeE[a] == sizeE[b] && peE[a] == 1 && peE[b] == 1 ? 1
                : (int) (((long) alpha.applyAsInt(a, b) + alpha.applyAsInt(b, a)) % 1000000007L)) instanceof IntBinaryOperator rv
            && ((IntBinaryOperator) (e, i) -> i >= kcnt[e] ? 0 : Integer.valueOf(i == 0 ? kid0[e] : kid1[e]) instanceof Integer ye && Integer.valueOf(kcnt[e] == 2 ? (i == 0 ? kid1[e] : kid0[e]) : -1) instanceof Integer ao
                ? (kcnt[ye] > 1 ? 0 : ao >= 0 && kcnt[ye] == 0 ? P[ao] : ao < 0 && kcnt[ye] == 1 ? P[kid0[ye]] : ao >= 0 && kcnt[ye] == 1 ? rv.applyAsInt(ao, kid0[ye]) : 0) : 0) instanceof IntBinaryOperator term
            && ((IntBinaryOperator) (e0, i) -> Integer.valueOf(endE[e0]) instanceof Integer ee && Integer.valueOf(2 + steps[e0]) instanceof Integer k
                && Integer.valueOf(i == 0 ? kid0[ee] : kid1[ee]) instanceof Integer oe && Integer.valueOf(i == 0 ? kid1[ee] : kid0[ee]) instanceof Integer ot
                ? (deg[adjv[oe]] == 2 ? (peE[oe] == 1 && sizeE[oe] == k ? P[ot] : 0)
                    : deg[adjv[oe]] == 3 ? (int) (((peE[kid0[oe]] == 1 && sizeE[kid0[oe]] == k - 1 ? (long) rv.applyAsInt(ot, kid1[oe]) : 0L) + (peE[kid1[oe]] == 1 && sizeE[kid1[oe]] == k - 1 ? (long) rv.applyAsInt(ot, kid0[oe]) : 0L)) % 1000000007L) : 0) : 0) instanceof IntBinaryOperator tbA
            && ((IntBinaryOperator) (e0, j) -> Integer.valueOf(endE[e0]) instanceof Integer ee && Integer.valueOf(2 + steps[e0]) instanceof Integer k
                && Integer.valueOf(j == 0 ? kid0[ee] : kid1[ee]) instanceof Integer oe && Integer.valueOf(j == 0 ? kid1[ee] : kid0[ee]) instanceof Integer ot
                ? (k >= 3 && peE[oe] == 1 && sizeE[oe] == k - 2 ? P[ot] : 0) : 0) instanceof IntBinaryOperator tbB
            && ((IntUnaryOperator) e0 -> deg[adjv[endE[e0]]] == 1 ? 1 : (int) (((long) tbA.applyAsInt(e0, 0) + tbA.applyAsInt(e0, 1) + tbB.applyAsInt(e0, 0) + tbB.applyAsInt(e0, 1)) % 1000000007L)) instanceof IntUnaryOperator tb
            && ((IntUnaryOperator) e -> kcnt[e] > 2 ? 0 : sizeE[e] == 2 ? 1
                : (int) (((long) term.applyAsInt(e, 0) + term.applyAsInt(e, 1) + (kcnt[e] == 1 ? tb.applyAsInt(kid0[e]) : 0)) % 1000000007L)) instanceof IntUnaryOperator core
            && IntStream.of(eo).allMatch(e -> (sizeE[e] & 1) == 1 || (P[e] = core.applyAsInt(e)) >= 0)
            ? String.valueOf(IntStream.range(0, N).mapToLong(x -> core.applyAsInt(N3 + x)).sum() % 1000000007L) : "0");
    }
}



