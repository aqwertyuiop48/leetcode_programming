import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next() - 1).toArray() instanceof int[] ty
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, it.next()).map(j -> it.next() - 1).toArray()).toList() instanceof List<int[]> deps
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> out
            && IntStream.range(0, n).allMatch(i -> Arrays.stream(deps.get(i)).allMatch(d -> out.get(d).add(i)))
            ? IntStream.range(0, 3).map(s -> new int[n] instanceof int[] indeg
                && IntStream.range(0, n).allMatch(i -> (indeg[i] = deps.get(i).length) >= 0)
                && IntStream.range(0, 3).mapToObj(c -> new ArrayDeque<Integer>()).toList() instanceof List<ArrayDeque<Integer>> q
                && IntStream.range(0, n).filter(i -> indeg[i] == 0).allMatch(i -> q.get(ty[i]).add(i))
                && new int[]{s, 0, 0} instanceof int[] st
                && IntStream.iterate(0, x -> st[1] < n, x -> x + 1).allMatch(x ->
                    Stream.generate(() -> q.get(st[0]).poll()).takeWhile(Objects::nonNull)
                        .map(t -> ++st[1] > 0 && out.get(t).stream().allMatch(u -> --indeg[u] != 0 || q.get(ty[u]).add(u))).count() >= 0
                    && (st[1] >= n || (st[0] = (st[0] + 1) % 3) >= 0 && ++st[2] > 0)) ? n + st[2] : 0).min().getAsInt() : "");
    }
}
