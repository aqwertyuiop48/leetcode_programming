import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Stream.generate(sc::next).limit(n).toList() instanceof List<String> g
            && IntStream.range(0, n + m).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).filter(j -> g.get(i).charAt(j) == '#').allMatch(j -> adj.get(i).add(n + j) && adj.get(n + j).add(i)))
            && IntStream.generate(() -> -1).limit(n + m).toArray() instanceof int[] dist
            && (dist[n - 1] = 0) == 0
            && new ArrayDeque<Integer>(List.of(n - 1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().filter(u -> dist[u] < 0).allMatch(u -> (dist[u] = dist[v] + 1) > 0 && dq.add(u)))
            ? dist[0]
            : 0);
    }
}

