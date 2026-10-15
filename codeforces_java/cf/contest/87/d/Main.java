import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))).ifPresent(txt -> System.out.println(
            new StringTokenizer(txt) instanceof StringTokenizer st
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && new int[n - 1] instanceof int[] eu
            && new int[n - 1] instanceof int[] ev
            && new int[n - 1] instanceof int[] ew
            && IntStream.range(0, n - 1).allMatch(i -> (eu[i] = Integer.parseInt(st.nextToken())) * 0 + (ev[i] = Integer.parseInt(st.nextToken())) * 0 + (ew[i] = Integer.parseInt(st.nextToken())) * 0 == 0)
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] p
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && new int[n + 1] instanceof int[] sub
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] pe
            && new int[n + 1] instanceof int[] bro
            && new int[n + 1] instanceof int[] vis
            && new int[n - 1] instanceof int[] ru
            && new int[n - 1] instanceof int[] rv
            && new long[n - 1] instanceof long[] val
            && ((IntUnaryOperator) x -> p[IntStream.iterate(x, y -> p[y] != y, y -> p[y]).reduce(x, (a, b) -> b)]) instanceof IntUnaryOperator find
            && IntStream.range(0, n - 1).boxed().collect(Collectors.groupingBy(i -> ew[i], TreeMap::new, Collectors.toList())).values().stream().allMatch(list ->
                (Integer) (list.get(0) + 1) instanceof Integer gid
                && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> adj
                && list.stream().allMatch(e -> (ru[e] = find.applyAsInt(eu[e])) > 0
                    && (rv[e] = find.applyAsInt(ev[e])) > 0
                    && adj.computeIfAbsent(ru[e], z -> new ArrayList<>()).add(e)
                    && adj.computeIfAbsent(rv[e], z -> new ArrayList<>()).add(e))
                && adj.keySet().stream().allMatch(r -> vis[r] == gid
                    || ((vis[r] = gid) == gid
                        && (bro[r] = r) > 0
                        && (sub[r] = sz[r]) > 0
                        && new ArrayList<Integer>(List.of(r)) instanceof ArrayList<Integer> ord
                        && IntStream.iterate(0, i -> i < ord.size(), i -> i + 1).allMatch(i -> adj.get(ord.get(i)).stream().allMatch(e ->
                            (Integer) (ru[e] == ord.get(i) ? rv[e] : ru[e]) instanceof Integer v
                            && (vis[v] == gid
                                || ((vis[v] = gid) == gid && (par[v] = ord.get(i)) > 0 && (pe[v] = e) >= 0 && (bro[v] = r) > 0 && (sub[v] = sz[v]) > 0 && ord.add(v)))))
                        && IntStream.iterate(ord.size() - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sub[par[ord.get(i)]] += sub[ord.get(i)]) > 0)
                        && IntStream.range(1, ord.size()).allMatch(i -> (Integer) ord.get(i) instanceof Integer v
                            && (val[pe[v]] = 2L * sub[v] * (sub[r] - sub[v])) >= 0)))
                && list.stream().allMatch(e -> (Integer) find.applyAsInt(eu[e]) instanceof Integer a
                    && (Integer) find.applyAsInt(ev[e]) instanceof Integer b
                    && (a.equals(b) || ((Integer) (sz[a] < sz[b] ? a : b) instanceof Integer lo
                        && (Integer) (a + b - lo) instanceof Integer hi
                        && (p[lo] = hi) > 0
                        && (sz[hi] += sz[lo]) > 0))))
            && (Long) LongStream.of(val).max().getAsLong() instanceof Long mx
            ? mx + " " + IntStream.range(0, n - 1).filter(i -> val[i] == mx).count() + "\n"
                + IntStream.range(0, n - 1).filter(i -> val[i] == mx).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))
            : ""));
    }
}


