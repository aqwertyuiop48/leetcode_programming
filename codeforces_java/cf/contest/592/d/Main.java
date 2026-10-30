import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[n + 1] instanceof int[] head && Arrays.stream(head).map(i -> -1).toArray() instanceof int[] hd && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer u && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer v
                && (to[2 * i] = v) > 0 && (nxt[2 * i] = hd[u]) >= -1 && (hd[u] = 2 * i) >= 0 && (to[2 * i + 1] = u) > 0 && (nxt[2 * i + 1] = hd[v]) >= -1 && (hd[v] = 2 * i + 1) >= 0)
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] a
            && ((Function<Integer, int[][]>) src -> IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] d && new int[n + 1] instanceof int[] q && new int[n + 1] instanceof int[] p && new int[]{1} instanceof int[] tl
                && (d[src] = 0) == 0 && (q[0] = src) > 0
                && IntStream.range(0, n).takeWhile(qi -> qi < tl[0]).allMatch(qi -> (Integer) q[qi] instanceof Integer u
                    && IntStream.iterate(hd[u], e -> e >= 0, e -> nxt[e]).filter(e -> d[to[e]] < 0).allMatch(e -> (d[to[e]] = d[u] + 1) > 0 && (p[to[e]] = u) > 0 && (q[tl[0]++] = to[e]) > 0))
                ? new int[][]{d, q, p} : null) instanceof Function<Integer, int[][]> bfs
            && bfs.apply(a[0]) instanceof int[][] r1 && new int[n + 1] instanceof int[] cnt
            && Arrays.stream(a).allMatch(x -> (cnt[x] = 1) > 0)
            && IntStream.range(1, n).map(i -> n - i).allMatch(i -> (cnt[r1[2][r1[1][i]]] += cnt[r1[1][i]]) >= 0)
            && (Long) IntStream.range(1, n).filter(i -> cnt[r1[1][i]] > 0).count() instanceof Long E
            && Arrays.stream(a).boxed().max(Comparator.comparingInt((Integer x) -> r1[0][x]).thenComparing(Comparator.reverseOrder())).get() instanceof Integer u
            && bfs.apply(u) instanceof int[][] r2
            && Arrays.stream(a).boxed().max(Comparator.comparingInt((Integer x) -> r2[0][x]).thenComparing(Comparator.reverseOrder())).get() instanceof Integer v
            ? Math.min(u, v) + "\n" + (2 * E - r2[0][v]) : "");
    }
}
