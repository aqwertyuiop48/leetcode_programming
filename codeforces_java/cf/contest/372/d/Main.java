import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, 2 * (n - 1)).allMatch(i -> ++st[Integer.parseInt(t[2 + i])] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (st[i] += st[i - 1]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] pos && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(Integer.parseInt(t[2 + 2 * i]) - 1) instanceof Integer u && Integer.valueOf(Integer.parseInt(t[3 + 2 * i]) - 1) instanceof Integer w
                && (adj[pos[u]++] = w) >= 0 && (adj[pos[w]++] = u) >= 0)
            && ((IntFunction<IntStream>) v -> IntStream.range(st[v], st[v + 1]).map(e -> adj[e])) instanceof IntFunction<IntStream> nb
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[n] instanceof int[] dep && new int[]{1} instanceof int[] tl && (par[0] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> nb.apply(ord[i]).filter(u -> i == 0 || u != par[ord[i]]).allMatch(u -> (par[u] = ord[i]) >= 0 && (dep[u] = dep[ord[i]] + 1) > 0 && (ord[tl[0]++] = u) >= 0))
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && new int[n] instanceof int[] tin && new int[n] instanceof int[] nxt && new int[n] instanceof int[] bt && (nxt[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> nb.apply(ord[i]).filter(u -> i == 0 || u != par[ord[i]]).allMatch(c -> (tin[c] = nxt[ord[i]]) >= 0 && (nxt[ord[i]] += sz[c]) > 0 && (nxt[c] = tin[c] + 1) > 0))
            && IntStream.range(0, n).allMatch(v -> (bt[tin[v]] = v) >= 0)
            && IntStream.range(0, 17).mapToObj(j -> new int[n]).toArray(int[][]::new) instanceof int[][] up
            && IntStream.range(0, n).allMatch(v -> (up[0][v] = par[v]) >= 0)
            && IntStream.range(1, 17).allMatch(j -> IntStream.range(0, n).allMatch(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) >= 0))
            && ((IntBinaryOperator) (u, v) -> Integer.valueOf(dep[u] >= dep[v] ? u : v) instanceof Integer a0 && Integer.valueOf(dep[u] >= dep[v] ? v : u) instanceof Integer b
                && Integer.valueOf(IntStream.range(0, 17).reduce(a0, (x, j) -> ((dep[a0] - dep[b]) >> j & 1) == 1 ? up[j][x] : x)) instanceof Integer a1
                && new int[]{a1, b} instanceof int[] cur
                ? dep[u] + dep[v] - 2 * dep[a1 == b ? b : IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> up[j][cur[0]] == up[j][cur[1]] || ((cur[0] = up[j][cur[0]]) >= 0 & (cur[1] = up[j][cur[1]]) >= 0)) ? up[0][cur[0]] : 0] : 0) instanceof IntBinaryOperator dist
            && new TreeSet<Integer>() instanceof TreeSet<Integer> ts && new long[]{0} instanceof long[] sum && new int[]{0, 0} instanceof int[] best
            && IntStream.range(0, n).allMatch(r -> (ts.isEmpty() || Optional.ofNullable(ts.lower(tin[r])).orElseGet(ts::last) instanceof Integer p && Optional.ofNullable(ts.higher(tin[r])).orElseGet(ts::first) instanceof Integer s
                    && (sum[0] += dist.applyAsInt(bt[p], r) + dist.applyAsInt(r, bt[s]) - dist.applyAsInt(bt[p], bt[s])) >= 0)
                && ts.add(tin[r])
                && IntStream.iterate(0, q -> sum[0] / 2 + 1 > k, q -> q + 1).allMatch(q -> ts.remove(tin[best[1]])
                    && (ts.isEmpty() ? (sum[0] = 0) == 0 : Optional.ofNullable(ts.lower(tin[best[1]])).orElseGet(ts::last) instanceof Integer p && Optional.ofNullable(ts.higher(tin[best[1]])).orElseGet(ts::first) instanceof Integer s
                        && (sum[0] -= dist.applyAsInt(bt[p], best[1]) + dist.applyAsInt(best[1], bt[s]) - dist.applyAsInt(bt[p], bt[s])) >= 0)
                    && ++best[1] > 0)
                && (best[0] = Math.max(best[0], r - best[1] + 1)) >= 0)
            ? best[0] : "");
    }
}
