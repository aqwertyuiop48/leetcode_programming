import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && adj.get(u).add(new int[]{v, i}) && adj.get(v).add(new int[]{u, i}))
            && new int[n + 1] instanceof int[] tin
            && new int[n + 1] instanceof int[] low
            && new boolean[m] instanceof boolean[] bridge
            && new int[]{0} instanceof int[] timer
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> dfs
            && dfs.compareAndSet(null, (v, pe) -> (tin[v] = low[v] = ++timer[0]) > 0
                && adj.get(v).stream().allMatch(e -> e[1] == pe || (tin[e[0]] != 0
                    ? (low[v] = Math.min(low[v], tin[e[0]])) > 0
                    : dfs.get().applyAsInt(e[0], e[1]) >= 0 && (low[v] = Math.min(low[v], low[e[0]])) > 0 && (low[e[0]] <= tin[v] || (bridge[e[1]] = true))))
                ? 0 : 0)
            && dfs.get().applyAsInt(1, -1) >= 0
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] comp
            && new int[]{0} instanceof int[] cc
            && IntStream.rangeClosed(1, n).filter(v -> comp[v] < 0).allMatch(root -> (comp[root] = cc[0]) >= 0
                && new ArrayDeque<Integer>(List.of(root)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().filter(e -> !bridge[e[1]] && comp[e[0]] < 0).allMatch(e -> (comp[e[0]] = cc[0]) >= 0 && dq.add(e[0])))
                && ++cc[0] > 0)
            && IntStream.range(0, cc[0]).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> tree
            && IntStream.rangeClosed(1, n).allMatch(v -> adj.get(v).stream().filter(e -> bridge[e[1]]).allMatch(e -> tree.get(comp[v]).add(comp[e[0]])))
            && new int[17][cc[0]] instanceof int[][] up
            && new int[cc[0]] instanceof int[] dep
            && IntStream.generate(() -> -1).limit(cc[0]).toArray() instanceof int[] seen
            && (seen[comp[1]] = 0) == 0
            && (up[0][comp[1]] = comp[1]) >= 0
            && new ArrayDeque<Integer>(List.of(comp[1])) instanceof ArrayDeque<Integer> q2
            && Stream.generate(q2::poll).takeWhile(Objects::nonNull).allMatch(v -> tree.get(v).stream().filter(u -> seen[u] < 0).allMatch(u -> (seen[u] = 0) == 0 && (up[0][u] = v) >= 0 && (dep[u] = dep[v] + 1) > 0 && q2.add(u)))
            && IntStream.range(1, 17).allMatch(j -> IntStream.range(0, cc[0]).allMatch(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) >= 0))
            && ((IntBinaryOperator) (x, y) -> new int[]{dep[x] < dep[y] ? y : x, dep[x] < dep[y] ? x : y} instanceof int[] ab
                && IntStream.range(0, 17).filter(j -> ((dep[ab[0]] - dep[ab[1]]) >> j & 1) == 1).allMatch(j -> (ab[0] = up[j][ab[0]]) >= 0)
                ? ab[0] == ab[1] ? ab[0]
                    : IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> up[j][ab[0]] == up[j][ab[1]] || ((ab[0] = up[j][ab[0]]) >= 0 && (ab[1] = up[j][ab[1]]) >= 0)) ? up[0][ab[0]] : 0
                : 0) instanceof IntBinaryOperator lca
            && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            ? Stream.generate(() -> Integer.valueOf(comp[rd.getAsInt()]) instanceof Integer a && Integer.valueOf(comp[rd.getAsInt()]) instanceof Integer b
                    ? String.valueOf(dep[a] + dep[b] - 2 * dep[lca.applyAsInt(a, b)]) : "").limit(k).collect(Collectors.joining("\n"))
            : ""), "", 1L << 28).start();
    }
}
