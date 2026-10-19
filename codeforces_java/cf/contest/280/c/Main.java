import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Stream.generate(ArrayList<Integer>::new).limit(n + 1).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(it.nextInt()) instanceof Integer x && Integer.valueOf(it.nextInt()) instanceof Integer y && adj.get(x).add(y) && adj.get(y).add(x))
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && (dep[1] = 1) == 1 && new ArrayList<Integer>(List.of(1)) instanceof ArrayList<Integer> order
            && IntStream.iterate(0, i -> i < order.size(), i -> i + 1).allMatch(i -> order.get(i) instanceof Integer v
                && adj.get(v).stream().filter(u -> u != par[v]).allMatch(u -> (par[u] = v) >= 0 && (dep[u] = dep[v] + 1) > 0 && order.add(u)))
            ? String.format("%.12f", IntStream.rangeClosed(1, n).mapToDouble(v -> 1.0 / dep[v]).sum()) : "");
    }
}
