import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b && adj.get(a).add(new int[]{b, i}) && adj.get(b).add(new int[]{a, i}))
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] cycleOf && new boolean[n + 1] instanceof boolean[] vis
            && new int[m + 2] instanceof int[] top && new int[]{0} instanceof int[] cc
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> dfs
            && dfs.compareAndSet(null, (v, pe) -> (vis[v] = true) && adj.get(v).stream().allMatch(e -> e[1] == pe
                || (!vis[e[0]] ? (par[e[0]] = v) > 0 && (dep[e[0]] = dep[v] + 1) > 0 && dfs.get().applyAsInt(e[0], e[1]) == 0
                    : dep[e[0]] >= dep[v] || ++cc[0] > 0 && (top[cc[0]] = e[0]) > 0 && IntStream.iterate(v, x -> x != e[0], x -> par[x]).allMatch(x -> (cycleOf[x] = cc[0]) > 0))) ? 0 : 1)
            && dfs.get().applyAsInt(1, -1) == 0
            && Integer.valueOf(n + cc[0]) instanceof Integer N
            && IntStream.rangeClosed(0, N).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ch
            && new int[n + 1] instanceof int[] topCycle && IntStream.rangeClosed(1, cc[0]).allMatch(c -> (topCycle[top[c]] = c) > 0)
            && IntStream.rangeClosed(0, n).map(x -> x == 0 ? 0 : cycleOf[x] > 0 ? n + cycleOf[x] : topCycle[x] > 0 ? n + topCycle[x] : x).toArray() instanceof int[] comp
            && new int[18][N + 1] instanceof int[][] up
            && IntStream.rangeClosed(1, N).filter(c -> c <= n ? comp[c] == c && c != 1 : true).filter(c -> c <= n || true).allMatch(c -> Integer.valueOf(c > n ? top[c - n] : c) instanceof Integer rv
                && (rv == 1 || (up[0][c] = comp[par[rv]]) > 0 && ch.get(up[0][c]).add(c)))
            && new int[N + 1] instanceof int[] d2 && new int[N + 1] instanceof int[] cyc
            && new ArrayDeque<Integer>(List.of(comp[1])) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> ch.get(v).stream().allMatch(u -> (d2[u] = d2[v] + 1) > 0 && (cyc[u] = cyc[v] + (u > n ? 1 : 0)) >= 0 && dq.add(u))).count() >= 0
            && IntStream.range(1, 18).allMatch(j -> IntStream.rangeClosed(1, N).allMatch(x -> (up[j][x] = up[j - 1][up[j - 1][x]]) >= 0))
            && new long[N + 2] instanceof long[] p2 && (p2[0] = 1) == 1 && IntStream.rangeClosed(1, N + 1).allMatch(i -> (p2[i] = p2[i - 1] * 2 % 1000000007L) > 0)
            && ((IntBinaryOperator) (a, b) -> new int[]{d2[a] < d2[b] ? b : a, d2[a] < d2[b] ? a : b} instanceof int[] ab
                && IntStream.range(0, 18).filter(j -> (d2[ab[0]] - d2[ab[1]] >> j & 1) == 1).allMatch(j -> (ab[0] = up[j][ab[0]]) > 0)
                ? ab[0] == ab[1] ? ab[0] : IntStream.iterate(17, j -> j >= 0, j -> j - 1).allMatch(j -> up[j][ab[0]] == up[j][ab[1]] || (ab[0] = up[j][ab[0]]) > 0 && (ab[1] = up[j][ab[1]]) > 0) ? up[0][ab[0]] : 0 : 0) instanceof IntBinaryOperator lca
            && Integer.valueOf(it.next()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer u && Integer.valueOf(it.next()) instanceof Integer v && Integer.valueOf(lca.applyAsInt(comp[u], comp[v])) instanceof Integer l
                ? String.valueOf(p2[cyc[comp[u]] + cyc[comp[v]] - 2 * cyc[l] + (l > n ? 1 : 0)]) : "").collect(Collectors.joining("\n")) : ""), "", 1 << 28).start();
    }
}
