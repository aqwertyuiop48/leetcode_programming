import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && adj.get(u).add(v) && adj.get(v).add(u))
            && new int[n + 1] instanceof int[] par
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> adj.get(v).stream().filter(u -> u != par[v]).allMatch(u -> (par[u] = v) > 0 && dq.add(u))).toList() instanceof List<Integer> order
            && new long[n + 1][] instanceof long[][] dp
            && ((IntFunction<long[]>) v -> dp[v] != null ? dp[v] : (dp[v] = LongStream.rangeClosed(0, k).map(i -> i == 0 ? 1 : 0).toArray())) instanceof IntFunction<long[]> get
            ? IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).mapToLong(i -> Integer.valueOf(order.get(i)) instanceof Integer v
                && get.apply(v) instanceof long[] arr && get.apply(par[v]) instanceof long[] pa
                && Long.valueOf(IntStream.range(0, k).mapToLong(d -> pa[d] * arr[k - 1 - d]).sum()) instanceof Long c
                && IntStream.range(0, k).allMatch(d -> (pa[d + 1] += arr[d]) >= 0)
                && (dp[v] = null) == null ? c : 0).sum()
            : 0);
    }
}
