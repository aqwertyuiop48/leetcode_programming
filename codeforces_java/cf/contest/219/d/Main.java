import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b && adj.get(a).add(new int[]{b, 1}) && adj.get(b).add(new int[]{a, 0}))
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] cost && new int[n + 1] instanceof int[] fwd
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> adj.get(v).stream().filter(e -> e[0] != par[v]).allMatch(e -> (par[e[0]] = v) > 0 && (fwd[e[0]] = e[1]) >= 0 && dq.add(e[0]))).toList() instanceof List<Integer> order
            && (cost[1] = IntStream.rangeClosed(2, n).map(v -> 1 - fwd[v]).sum()) >= 0
            && order.stream().skip(1).allMatch(v -> (cost[v] = cost[par[v]] + (fwd[v] == 1 ? 1 : -1)) > Integer.MIN_VALUE)
            && Integer.valueOf(IntStream.rangeClosed(1, n).map(v -> cost[v]).min().getAsInt()) instanceof Integer mn
            ? mn + "\n" + IntStream.rangeClosed(1, n).filter(v -> cost[v] == mn).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

