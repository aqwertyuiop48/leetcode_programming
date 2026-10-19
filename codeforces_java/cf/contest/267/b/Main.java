import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && new int[n] instanceof int[] a && new int[n] instanceof int[] b
            && IntStream.range(0, n).allMatch(i -> (a[i] = it.nextInt()) >= 0 && (b[i] = it.nextInt()) >= 0)
            && new int[7] instanceof int[] deg && IntStream.range(0, n).allMatch(i -> ++deg[a[i]] > 0 && ++deg[b[i]] > 0)
            && new int[7][] instanceof int[][] adj && IntStream.range(0, 7).allMatch(v -> (adj[v] = new int[deg[v]]) != null)
            && new int[7] instanceof int[] fill && IntStream.range(0, n).allMatch(i -> (adj[a[i]][fill[a[i]]++] = i) >= 0 && (adj[b[i]][fill[b[i]]++] = i) >= 0)
            && IntStream.range(0, 7).filter(v -> deg[v] % 2 == 1).toArray() instanceof int[] odd && odd.length != 1 && odd.length < 3 && odd.length != 1
            && new boolean[n] instanceof boolean[] used && new int[7] instanceof int[] ptr && new ArrayList<int[]>() instanceof ArrayList<int[]> res
            && new ArrayDeque<int[]>() instanceof ArrayDeque<int[]> st && st.offerFirst(new int[]{odd.length > 0 ? odd[0] : a[0], -1, 0})
            && IntStream.iterate(0, i -> !st.isEmpty(), i -> i + 1).allMatch(i -> st.peekFirst() instanceof int[] top
                && Integer.valueOf(IntStream.range(ptr[top[0]], adj[top[0]].length).filter(j -> !used[adj[top[0]][j]]).findFirst().orElse(-1)) instanceof Integer k
                && (k < 0 ? st.pollFirst() != null && (top[1] < 0 || res.add(new int[]{top[1], top[2]}))
                    : Integer.valueOf(adj[top[0]][k]) instanceof Integer e && (ptr[top[0]] = k + 1) > 0 && (used[e] = true) && st.offerFirst(new int[]{a[e] == top[0] ? b[e] : a[e], e, a[e] == top[0] ? 0 : 1})))
            && res.size() == n
            ? IntStream.range(0, n).mapToObj(i -> res.get(n - 1 - i)).map(r -> (r[0] + 1) + (r[1] == 0 ? " +" : " -")).collect(Collectors.joining("\n")) : "No solution");
    }
}
