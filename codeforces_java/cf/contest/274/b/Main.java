import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Stream.generate(ArrayList<Integer>::new).limit(n + 1).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf((int) it.nextLong()) instanceof Integer x && Integer.valueOf((int) it.nextLong()) instanceof Integer y && adj.get(x).add(y) && adj.get(y).add(x))
            && new long[n + 1] instanceof long[] a && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = it.nextLong()) != Long.MIN_VALUE)
            && new int[n + 1] instanceof int[] par && new ArrayList<Integer>(List.of(1)) instanceof ArrayList<Integer> order
            && IntStream.iterate(0, i -> i < order.size(), i -> i + 1).allMatch(i -> order.get(i) instanceof Integer v
                && adj.get(v).stream().filter(u -> u != par[v]).allMatch(u -> (par[u] = v) >= 0 && order.add(u)))
            && new long[n + 1] instanceof long[] p && new long[n + 1] instanceof long[] m
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> order.get(i) instanceof Integer v && Long.valueOf(a[v] + p[v] - m[v]) instanceof Long val
                && (val > 0 ? (m[v] += val) >= 0 : (p[v] -= val) >= 0)
                && (par[v] == 0 || (p[par[v]] = Math.max(p[par[v]], p[v])) >= 0 && (m[par[v]] = Math.max(m[par[v]], m[v])) >= 0))
            ? p[1] + m[1] : "");
    }
}
