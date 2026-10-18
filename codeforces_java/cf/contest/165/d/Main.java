import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt()}).peek(e -> adj.get(e[0]).add(e[1])).peek(e -> adj.get(e[1]).add(e[0])).toList() instanceof List<int[]> edges
            && Integer.valueOf(IntStream.rangeClosed(1, n).boxed().max(Comparator.comparingInt((Integer v) -> adj.get(v).size())).get()) instanceof Integer c
            && new int[n + 1] instanceof int[] depth
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] leg
            && new int[n + 1] instanceof int[] g
            && new int[adj.get(c).size()] instanceof int[] legStart
            && new int[]{0} instanceof int[] cur
            && IntStream.range(0, adj.get(c).size()).allMatch(j -> (legStart[j] = cur[0] + 1) > 0
                && new int[]{0} instanceof int[] d
                && Stream.iterate(new int[]{adj.get(c).get(j), c}, st -> st != null, st -> adj.get(st[0]).stream().filter(w -> w != st[1]).findFirst().map(w -> new int[]{w, st[0]}).orElse(null))
                    .allMatch(st -> (leg[st[0]] = j) >= 0 && (depth[st[0]] = ++d[0]) > 0 && (g[st[0]] = ++cur[0]) > 0))
            && new long[n + 1] instanceof long[] bit
            && ((IntBinaryOperator) (pos, val) -> IntStream.iterate(pos, i -> i <= n, i -> i + (i & -i)).map(i -> (int) (bit[i] += val)).max().orElse(0)) instanceof IntBinaryOperator add
            && ((IntToLongFunction) pos -> IntStream.iterate(pos, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bit[i]).sum()) instanceof IntToLongFunction pre
            && edges.stream().mapToInt(e -> depth[e[0]] > depth[e[1]] ? e[0] : e[1]).toArray() instanceof int[] ev
            && new boolean[n] instanceof boolean[] white
            && ((IntToLongFunction) x -> x == c ? 0 : pre.applyAsLong(g[x]) - pre.applyAsLong(legStart[leg[x]] - 1)) instanceof IntToLongFunction up
            && Integer.valueOf(rd.getAsInt()) instanceof Integer q
            ? Stream.generate(() -> Integer.valueOf(rd.getAsInt()) instanceof Integer t
                    ? t == 3
                        ? Integer.valueOf(rd.getAsInt()) instanceof Integer a && Integer.valueOf(rd.getAsInt()) instanceof Integer b
                            ? a.equals(b) ? "0"
                            : leg[a] == leg[b] && leg[a] != -1
                                ? pre.applyAsLong(g[depth[a] < depth[b] ? b : a]) - pre.applyAsLong(g[depth[a] < depth[b] ? a : b]) == 0 ? String.valueOf(Math.abs(depth[a] - depth[b])) : "-1"
                                : up.applyAsLong(a) + up.applyAsLong(b) == 0 ? String.valueOf(depth[a] + depth[b]) : "-1"
                            : null
                        : Integer.valueOf(rd.getAsInt() - 1) instanceof Integer i && (t == 2) != white[i] && (white[i] = t == 2) == (t == 2) && add.applyAsInt(g[ev[i]], t == 2 ? 1 : -1) >= 0 ? null : null
                    : null).limit(q).filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}
