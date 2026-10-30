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
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v -> (removed[v] = true) && adj.get(v).stream().filter(u -> !removed[u]).allMatch(u -> --deg[u] != 1 || q.add(u) || true))
            && IntStream.range(0, n).filter(v -> !removed[v]).toArray() instanceof int[] cyc
            && new int[n] instanceof int[] pos && new int[]{0} instanceof int[] cnt
            && new boolean[n] instanceof boolean[] seen
            && IntStream.iterate(cyc[0], v -> v >= 0, v -> adj.get(v).stream().filter(u -> !removed[u] && !seen[u]).findFirst().orElse(-1)).allMatch(v -> (seen[v] = true) && (pos[v] = cnt[0]++) >= 0)
            && Integer.valueOf(cyc.length) instanceof Integer L
            && new int[n] instanceof int[] root && new int[n] instanceof int[] dep && new int[n] instanceof int[] par && new int[n] instanceof int[] ord && new int[n] instanceof int[] idx
            && IntStream.range(0, n).allMatch(v -> (root[v] = removed[v] ? -1 : v) > -2 && (par[v] = -1) < 0)
            && new ArrayDeque<Integer>(Arrays.stream(cyc).boxed().toList()) instanceof ArrayDeque<Integer> dq && new int[]{0} instanceof int[] oc
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> (idx[v] = oc[0]) >= 0 && (ord[oc[0]++] = v) >= 0
                && adj.get(v).stream().filter(u -> removed[u] && root[u] < 0).allMatch(u -> (root[u] = root[v]) >= 0 && (dep[u] = dep[v] + 1) > 0 && (par[u] = v) >= 0 && dq.add(u)))
            && new int[n * n] instanceof int[] D
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && (par[v] < 0 || IntStream.range(0, i).allMatch(j -> Integer.valueOf(ord[j]) instanceof Integer u
                    && (root[u] != root[v] || (D[v * n + u] = D[par[v] * n + u] + 1) > 0 && (D[u * n + v] = D[v * n + u]) > 0))))
            ? String.format("%.12f", n + 2 * IntStream.range(0, n).mapToDouble(u -> IntStream.range(u + 1, n).mapToDouble(v -> root[u] == root[v] ? 1.0 / (D[u * n + v] + 1)
                : 1.0 / (dep[u] + dep[v] + 1 + Math.abs(pos[root[u]] - pos[root[v]])) + 1.0 / (dep[u] + dep[v] + 1 + L - Math.abs(pos[root[u]] - pos[root[v]])) - 1.0 / (dep[u] + dep[v] + L)).sum()).sum()) : "");
    }
}
