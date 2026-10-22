import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList() instanceof List<String> L
            && Arrays.stream(L.get(0).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm && Integer.valueOf(nm[0]) instanceof Integer n && Integer.valueOf(nm[1]) instanceof Integer m
            && Arrays.stream(L.get(1).trim().split(" ")).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && IntStream.range(0, n - 1).mapToObj(i -> Arrays.stream(L.get(i + 2).trim().split(" ")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new) instanceof int[][] ed
            && new int[n + 2] instanceof int[] deg && Arrays.stream(ed).allMatch(e -> ++deg[e[0]] > 0 && ++deg[e[1]] > 0)
            && IntStream.range(0, n + 2).mapToObj(v -> new int[deg[v]]).toArray(int[][]::new) instanceof int[][] adj && new int[n + 2] instanceof int[] fill
            && Arrays.stream(ed).allMatch(e -> (adj[e[0]][fill[e[0]]++] = e[1]) > 0 && (adj[e[1]][fill[e[1]]++] = e[0]) > 0)
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] dep && new int[n + 2] instanceof int[] tin && new int[n + 2] instanceof int[] ord
            && new int[n + 2] instanceof int[] stk && new int[]{1, 0} instanceof int[] sp && (stk[0] = 1) > 0
            && IntStream.iterate(0, i -> sp[0] > 0, i -> i + 1).map(i -> Integer.valueOf(stk[--sp[0]]) instanceof Integer v && (tin[v] = ++sp[1]) > 0 && (ord[sp[1]] = v) > 0
                ? Arrays.stream(adj[v]).filter(w -> w != par[v]).map(w -> new int[]{par[w] = v, dep[w] = dep[v] + 1, stk[sp[0]++] = w}.length).sum() : 0).sum() >= 0
            && IntStream.generate(() -> 1).limit(n + 2).toArray() instanceof int[] sz
            && IntStream.iterate(n, i -> i > 1, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && new long[n + 2] instanceof long[] bit
            && ((BiFunction<Integer, Long, Long>) (pos, v) -> IntStream.iterate(pos, p -> p <= n, p -> p + (p & -p)).mapToLong(p -> bit[p] += v).count()) instanceof BiFunction<Integer, Long, Long> add
            ? IntStream.range(0, m).mapToObj(i -> Arrays.stream(L.get(n + 1 + i).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] q
                ? (q[0] == 1 ? (add.apply(tin[q[1]], (long) q[2] * (dep[q[1]] % 2 == 0 ? 1 : -1)) + add.apply(tin[q[1]] + sz[q[1]], -(long) q[2] * (dep[q[1]] % 2 == 0 ? 1 : -1)) >= 0 ? null : null)
                    : String.valueOf(a[q[1] - 1] + (dep[q[1]] % 2 == 0 ? 1 : -1) * IntStream.iterate(tin[q[1]], p -> p > 0, p -> p - (p & -p)).mapToLong(p -> bit[p]).sum())) : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
