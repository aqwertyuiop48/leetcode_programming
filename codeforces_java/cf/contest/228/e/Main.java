import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b && Integer.valueOf(1 - it.next()) instanceof Integer w
                && adj.get(a).add(new int[]{b, w}) && (a.equals(b) || adj.get(b).add(new int[]{a, w})))
            && new int[n + 1] instanceof int[] col && IntStream.rangeClosed(0, n).allMatch(i -> (col[i] = -1) < 0) && new boolean[]{true} instanceof boolean[] ok
            && IntStream.rangeClosed(1, n).filter(s -> col[s] < 0).allMatch(s -> (col[s] = 0) == 0 && new ArrayDeque<Integer>(List.of(s)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().allMatch(e -> col[e[0]] < 0 ? (col[e[0]] = col[v] ^ e[1]) >= 0 && dq.add(e[0]) : col[e[0]] == (col[v] ^ e[1]) || !(ok[0] = false))))
            ? ok[0] ? IntStream.rangeClosed(1, n).filter(v -> col[v] == 1).boxed().toList() instanceof List<Integer> fl ? fl.size() + "\n" + fl.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "" : "Impossible" : "");
    }
}
