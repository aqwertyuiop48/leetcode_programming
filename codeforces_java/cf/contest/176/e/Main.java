import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && Integer.valueOf(rd.getAsInt()) instanceof Integer w && adj.get(u).add(new int[]{v, w}) && adj.get(v).add(new int[]{u, w}))
            && new int[17][n + 1] instanceof int[][] up
            && new int[n + 1] instanceof int[] dep
            && new long[n + 1] instanceof long[] dist
            && new int[n + 1] instanceof int[] tin
            && new int[]{0} instanceof int[] timer
            && (up[0][1] = 1) == 1
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> st
            && Stream.generate(st::pollFirst).takeWhile(Objects::nonNull).allMatch(v -> (tin[v] = timer[0]++) >= 0
                && adj.get(v).stream().filter(e -> e[0] != up[0][v]).allMatch(e -> (up[0][e[0]] = v) > 0 && (dep[e[0]] = dep[v] + 1) > 0 && (dist[e[0]] = dist[v] + e[1]) > 0 && st.offerFirst(e[0])))
            && IntStream.range(1, 17).allMatch(j -> IntStream.rangeClosed(1, n).allMatch(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) > 0))
            && ((IntBinaryOperator) (x, y) -> new int[]{dep[x] < dep[y] ? y : x, dep[x] < dep[y] ? x : y} instanceof int[] ab
                && IntStream.range(0, 17).filter(j -> ((dep[ab[0]] - dep[ab[1]]) >> j & 1) == 1).allMatch(j -> (ab[0] = up[j][ab[0]]) > 0)
                ? ab[0] == ab[1] ? ab[0]
                    : IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> up[j][ab[0]] == up[j][ab[1]] || ((ab[0] = up[j][ab[0]]) > 0 && (ab[1] = up[j][ab[1]]) > 0)) ? up[0][ab[0]] : 0
                : 0) instanceof IntBinaryOperator lca
            && ((ToLongBiFunction<Integer, Integer>) (x, y) -> dist[x] + dist[y] - 2 * dist[lca.applyAsInt(x, y)]) instanceof ToLongBiFunction<Integer, Integer> d
            && new int[n] instanceof int[] byTin
            && IntStream.rangeClosed(1, n).allMatch(v -> (byTin[tin[v]] = v) > 0)
            && new TreeSet<Integer>() instanceof TreeSet<Integer> set
            && new long[]{0} instanceof long[] sum
            && Integer.valueOf(rd.getAsInt()) instanceof Integer q
            ? Stream.generate(() -> ((String) it.next()) instanceof String op
                    ? op.equals("?") ? String.valueOf(sum[0] / 2)
                    : Integer.valueOf(rd.getAsInt()) instanceof Integer x
                        && (op.equals("+") ? !set.contains(tin[x]) : set.contains(tin[x]))
                        && (op.equals("+") ? true : set.remove(tin[x]))
                        && Integer.valueOf(set.isEmpty() ? 0 : byTin[set.lower(tin[x]) != null ? set.lower(tin[x]) : set.last()]) instanceof Integer pv
                        && Integer.valueOf(set.isEmpty() ? 0 : byTin[set.higher(tin[x]) != null ? set.higher(tin[x]) : set.first()]) instanceof Integer nx
                        && (set.isEmpty() || (sum[0] += (op.equals("+") ? 1 : -1) * (d.applyAsLong(pv, x) + d.applyAsLong(x, nx) - d.applyAsLong(pv, nx))) != Long.MIN_VALUE)
                        && (op.equals("+") ? set.add(tin[x]) : true) ? null : null
                    : null).limit(q).filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}
