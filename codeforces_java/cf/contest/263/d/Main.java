import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(it.nextInt()) instanceof Integer k
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.nextInt(), it.nextInt()}).toList() instanceof List<int[]> es
            && new int[n + 1] instanceof int[] deg && es.stream().allMatch(e -> ++deg[e[0]] > 0 && ++deg[e[1]] > 0)
            && new int[n + 1][] instanceof int[][] adj && IntStream.rangeClosed(1, n).allMatch(i -> (adj[i] = new int[deg[i]]) != null)
            && new int[n + 1] instanceof int[] fill && es.stream().allMatch(e -> (adj[e[0]][fill[e[0]]++] = e[1]) > 0 && (adj[e[1]][fill[e[1]]++] = e[0]) > 0)
            && new int[n + 1] instanceof int[] pos && new int[n + 1] instanceof int[] path && new int[]{1} instanceof int[] len
            && IntStream.rangeClosed(1, n).allMatch(i -> (pos[i] = -1) < 0) && (pos[1] = 0) == 0 && (path[0] = 1) == 1
            && IntStream.iterate(1, v -> v > 0, v -> Integer.valueOf(Arrays.stream(adj[v]).filter(w -> pos[w] < 0).findFirst().orElse(0)) instanceof Integer w && w > 0 && (pos[w] = len[0]) >= 0 && (path[len[0]++] = w) > 0 ? w : 0).allMatch(v -> true)
            && Integer.valueOf(Arrays.stream(adj[path[len[0] - 1]]).map(w -> pos[w]).min().getAsInt()) instanceof Integer lo
            ? (len[0] - lo) + "\n" + Arrays.stream(path, lo, len[0]).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
