import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.range(1, n).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt()}).toList() instanceof List<int[]> es
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && es.stream().allMatch(e -> adj.get(e[0]).add(e[1]) && adj.get(e[1]).add(e[0]))
            && new int[17][n + 1] instanceof int[][] up
            && new int[n + 1] instanceof int[] dep
            && (up[0][1] = 1) == 1
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> adj.get(v).stream().filter(u -> u != up[0][v]).allMatch(u -> (up[0][u] = v) > 0 && (dep[u] = dep[v] + 1) > 0 && dq.add(u))).toList() instanceof List<Integer> order
            && IntStream.range(1, 17).allMatch(j -> IntStream.rangeClosed(1, n).allMatch(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) > 0))
            && ((IntBinaryOperator) (x, y) -> new int[]{dep[x] < dep[y] ? y : x, dep[x] < dep[y] ? x : y} instanceof int[] ab
                && IntStream.range(0, 17).filter(j -> ((dep[ab[0]] - dep[ab[1]]) >> j & 1) == 1).allMatch(j -> (ab[0] = up[j][ab[0]]) > 0)
                ? ab[0] == ab[1] ? ab[0]
                    : IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> up[j][ab[0]] == up[j][ab[1]] || ((ab[0] = up[j][ab[0]]) > 0 && (ab[1] = up[j][ab[1]]) > 0)) ? up[0][ab[0]] : 0
                : 0) instanceof IntBinaryOperator lca
            && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            && new long[n + 1] instanceof long[] cnt
            && IntStream.range(0, k).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer a && Integer.valueOf(rd.getAsInt()) instanceof Integer b
                && ++cnt[a] > Long.MIN_VALUE && ++cnt[b] > Long.MIN_VALUE && (cnt[lca.applyAsInt(a, b)] -= 2) > Long.MIN_VALUE)
            && IntStream.iterate(order.size() - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (cnt[up[0][order.get(i)]] += cnt[order.get(i)]) > Long.MIN_VALUE)
            ? es.stream().map(e -> String.valueOf(cnt[dep[e[0]] > dep[e[1]] ? e[0] : e[1]])).collect(Collectors.joining(" "))
            : "");
    }
}
