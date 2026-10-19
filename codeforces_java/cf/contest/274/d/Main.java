import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && Stream.generate(ArrayList<Integer>::new).limit(n * m + m + 1).toList() instanceof List<ArrayList<Integer>> adj
            && new int[n * m + m + 1] instanceof int[] deg && new int[]{m} instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).map(j -> it.nextInt()).toArray() instanceof int[] row
                && IntStream.range(0, m).filter(j -> row[j] >= 0).boxed().collect(Collectors.groupingBy(j -> row[j], TreeMap::new, Collectors.toList())).values().stream().toList() instanceof List<List<Integer>> gl
                && IntStream.range(0, gl.size() - 1).allMatch(t -> Integer.valueOf(cnt[0]++) instanceof Integer v
                    && gl.get(t).stream().allMatch(u -> adj.get(u).add(v) && deg[v]++ >= 0)
                    && gl.get(t + 1).stream().allMatch(u -> adj.get(v).add(u) && deg[u]++ >= 0)))
            && IntStream.range(0, cnt[0]).filter(v -> deg[v] == 0).boxed().collect(Collectors.toCollection(ArrayDeque::new)) instanceof ArrayDeque<Integer> dq
            && new ArrayList<Integer>() instanceof ArrayList<Integer> out
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> out.add(v) && adj.get(v).stream().allMatch(u -> --deg[u] != 0 || dq.add(u)))
            ? out.size() < cnt[0] ? "-1" : out.stream().filter(v -> v < m).map(v -> String.valueOf(v + 1)).collect(Collectors.joining(" ")) : "");
    }
}
