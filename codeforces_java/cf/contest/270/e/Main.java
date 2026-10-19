import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.nextInt(), it.nextInt(), it.nextInt()}).toList() instanceof List<int[]> es
            && new int[n + 1] instanceof int[] deg && new long[n + 1] instanceof long[] total
            && es.stream().allMatch(e -> ++deg[e[0]] > 0 && ++deg[e[1]] > 0 && (total[e[0]] += e[2]) > 0 && (total[e[1]] += e[2]) > 0)
            && new int[n + 1][] instanceof int[][] adj && IntStream.rangeClosed(1, n).allMatch(v -> (adj[v] = new int[deg[v]]) != null)
            && new int[n + 1] instanceof int[] fill && IntStream.range(0, m).allMatch(i -> (adj[es.get(i)[0]][fill[es.get(i)[0]]++] = i) >= 0 && (adj[es.get(i)[1]][fill[es.get(i)[1]]++] = i) >= 0)
            && new int[m] instanceof int[] dir && IntStream.range(0, m).allMatch(i -> (dir[i] = -1) < 0) && new long[n + 1] instanceof long[] inflow
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> q
            && IntStream.iterate(0, i -> !q.isEmpty(), i -> i + 1).allMatch(i -> q.poll() instanceof Integer v && Arrays.stream(adj[v]).filter(e -> dir[e] < 0).allMatch(e -> es.get(e) instanceof int[] ed && Integer.valueOf(ed[0] == v ? ed[1] : ed[0]) instanceof Integer u
                && (dir[e] = ed[0] == v ? 0 : 1) >= 0 && (inflow[u] += ed[2]) > 0 && (u == n || inflow[u] * 2 != total[u] || q.add(u))))
            ? Arrays.stream(dir).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
