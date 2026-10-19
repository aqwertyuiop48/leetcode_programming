import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b && adj.get(a).add(b) && adj.get(b).add(a))
            && IntStream.range(0, n).map(v -> adj.get(v).size()).toArray() instanceof int[] deg
            && new boolean[n] instanceof boolean[] removed && new ArrayDeque<Integer>(IntStream.range(0, n).filter(v -> deg[v] == 1).boxed().toList()) instanceof ArrayDeque<Integer> q
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).map(v -> (removed[v] = true) && adj.get(v).stream().filter(u -> !removed[u]).allMatch(u -> --deg[u] != 1 || q.add(u) || true)).count() >= 0
            && IntStream.range(0, n).filter(v -> !removed[v]).toArray() instanceof int[] cyc
            && new int[n] instanceof int[] pos && new int[]{0} instanceof int[] cnt
            && new boolean[n] instanceof boolean[] seen
            && IntStream.iterate(cyc[0], v -> v >= 0, v -> adj.get(v).stream().filter(u -> !removed[u] && !seen[u]).findFirst().orElse(-1)).allMatch(v -> (seen[v] = true) && (pos[v] = cnt[0]++) >= 0)
            && Integer.valueOf(cyc.length) instanceof Integer L
            && new int[n] instanceof int[] root && new int[n] instanceof int[] dep && IntStream.range(0, n).allMatch(v -> (root[v] = removed[v] ? -1 : v) > -2)
            && new ArrayDeque<Integer>(Arrays.stream(cyc).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).map(v -> adj.get(v).stream().filter(u -> removed[u] && root[u] < 0).allMatch(u -> (root[u] = root[v]) >= 0 && (dep[u] = dep[v] + 1) > 0 && dq.add(u))).count() >= 0
            ? String.format("%.12f", IntStream.range(0, n).mapToDouble(u -> new int[n] instanceof int[] dist && (dist[u] = 1) > 0 && new ArrayDeque<Integer>(List.of(u)) instanceof ArrayDeque<Integer> bq
                && Stream.generate(bq::poll).takeWhile(Objects::nonNull).map(w -> adj.get(w).stream().filter(x -> root[x] == root[u] && dist[x] == 0).allMatch(x -> (dist[x] = dist[w] + 1) > 0 && bq.add(x))).count() >= 0
                ? IntStream.range(0, n).mapToDouble(v -> root[v] == root[u] ? 1.0 / dist[v] : Integer.valueOf(dep[u] + dep[v] + 2) instanceof Integer X && Integer.valueOf(Math.abs(pos[root[u]] - pos[root[v]])) instanceof Integer d
                    ? 1.0 / (X + d - 1) + 1.0 / (X + L - d - 1) - 1.0 / (X + L - 2) : 0).sum() : 0).sum()) : "");
    }
}
