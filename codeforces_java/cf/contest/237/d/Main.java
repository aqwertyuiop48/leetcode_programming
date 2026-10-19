import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n + 1).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, n - 1).mapToObj(i -> new int[]{it.next(), it.next()}).toList() instanceof List<int[]> es
            && es.stream().allMatch(e -> adj.get(e[0]).add(e[1]) && adj.get(e[1]).add(e[0]))
            && new int[n + 1] instanceof int[] par && (par[1] = -1) < 0 && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> q
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().filter(u -> par[u] == 0).allMatch(u -> (par[u] = v) > 0 && q.add(u)))
            && new int[n + 1] instanceof int[] pe
            && IntStream.range(0, n - 1).allMatch(i -> (pe[par[es.get(i)[1]] == es.get(i)[0] ? es.get(i)[1] : es.get(i)[0]] = i + 1) > 0)
            && new int[]{0} instanceof int[] last
            ? (n == 1 ? "1\n1 1" : (n - 1) + "\n" + es.stream().map(e -> "2 " + e[0] + " " + e[1]).collect(Collectors.joining("\n"))
                + IntStream.range(0, n - 1).mapToObj(i -> Integer.valueOf(par[es.get(i)[1]] == es.get(i)[0] ? es.get(i)[0] : es.get(i)[1]) instanceof Integer p
                    ? (p == 1 ? (last[0] > 0 ? last[0] + " " + (last[0] = i + 1) : (last[0] = i + 1) < 0 ? "" : null) : pe[p] + " " + (i + 1)) : null)
                    .filter(Objects::nonNull).map(s -> "\n" + s).collect(Collectors.joining())) : "");
    }
}
