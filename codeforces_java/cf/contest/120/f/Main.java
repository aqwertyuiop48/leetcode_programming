import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out), new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in)))).ifPresent(io -> Optional.of(io.getKey()).ifPresent(out ->
        Optional.of(io.getValue()).ifPresent(s ->
            out.println(IntStream.range(0, s.nextInt()).mapToLong(tc ->
                (Integer) s.nextInt() instanceof Integer n
                && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
                && IntStream.range(0, n - 1).allMatch(i -> new int[]{s.nextInt(), s.nextInt()} instanceof int[] e
                    && adj.get(e[0]).add(e[1]) && adj.get(e[1]).add(e[0]))
                && ((Function<Integer, List<List<Integer>>>) st -> new boolean[n + 1] instanceof boolean[] vis
                    && (vis[st] = true)
                    ? Stream.iterate(List.of(st), l -> !l.isEmpty(),
                        l -> l.stream().flatMap(u -> adj.get(u).stream()).filter(v -> !vis[v] && (vis[v] = true)).toList()).toList()
                    : null) instanceof Function<Integer, List<List<Integer>>> bfs
                ? bfs.apply(bfs.apply(1).getLast().get(0)).size() - 1 : -1L).sum()))));
    }
}

