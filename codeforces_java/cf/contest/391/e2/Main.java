import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && IntStream.range(0, 3).map(i -> nx.getAsInt()).toArray() instanceof int[] ns
            && ((Function<Integer, long[]>) t -> Integer.valueOf(ns[t]) instanceof Integer n
                && IntStream.range(0, n - 1).mapToObj(i -> new int[]{nx.getAsInt() - 1, nx.getAsInt() - 1}).toList() instanceof List<int[]> es
                && new int[n + 1] instanceof int[] st && new int[2 * n] instanceof int[] nb
                && es.stream().allMatch(e -> ++st[e[0] + 1] > 0 && ++st[e[1] + 1] > 0)
                && IntStream.range(0, n).allMatch(i -> (st[i + 1] += st[i]) >= 0)
                && st.clone() instanceof int[] pos
                && es.stream().allMatch(e -> (nb[pos[e[0]]++] = e[1]) >= 0 && (nb[pos[e[1]]++] = e[0]) >= 0)
                && ((IntFunction<int[][]>) src -> new int[n] instanceof int[] order && new int[n] instanceof int[] par && new int[n] instanceof int[] dist && new int[]{1} instanceof int[] cnt
                    && IntStream.range(0, n).allMatch(i -> (dist[i] = -1) < 0) && (dist[src] = 0) == 0 && (par[src] = -1) < 0 && (order[0] = src) == src
                    && IntStream.iterate(0, h -> h < cnt[0], h -> h + 1).allMatch(h -> Integer.valueOf(order[h]) instanceof Integer u
                        && IntStream.range(st[u], st[u + 1]).map(e -> nb[e]).filter(w -> dist[w] < 0).allMatch(w -> (dist[w] = dist[u] + 1) > 0 && (par[w] = u) >= 0 && (order[cnt[0]++] = w) >= 0))
                    ? new int[][]{order, par, dist} : null) instanceof IntFunction<int[][]> bfs
                && bfs.apply(0) instanceof int[][] r0
                && Integer.valueOf(IntStream.range(0, n).boxed().max(Comparator.comparingInt(i -> r0[2][i])).get()) instanceof Integer a
                && bfs.apply(a) instanceof int[][] r1
                && Integer.valueOf(IntStream.range(0, n).boxed().max(Comparator.comparingInt(i -> r1[2][i])).get()) instanceof Integer b
                && new long[n] instanceof long[] sz && new long[n] instanceof long[] s
                && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0)
                && IntStream.iterate(n - 1, h -> h > 0, h -> h - 1).allMatch(h -> (sz[r0[1][r0[0][h]]] += sz[r0[0][h]]) > 0)
                && (s[0] = IntStream.range(0, n).mapToLong(i -> r0[2][i]).sum()) >= 0
                && IntStream.range(1, n).allMatch(h -> Integer.valueOf(r0[0][h]) instanceof Integer v && (s[v] = s[r0[1][v]] + n - 2 * sz[v]) >= 0)
                ? new long[]{n, Arrays.stream(s).sum() / 2, Arrays.stream(s).max().getAsLong(), s[a], s[b], r1[2][b]} : null) instanceof Function<Integer, long[]> info
            && IntStream.range(0, 3).mapToObj(info::apply).toList() instanceof List<long[]> tr
            ? IntStream.range(0, 3).mapToLong(m -> tr.get((m + 1) % 3) instanceof long[] L && tr.get((m + 2) % 3) instanceof long[] R && tr.get(m) instanceof long[] M
                ? tr.stream().mapToLong(x -> x[1]).sum() + L[0] * M[0] + M[0] * R[0] + 2 * L[0] * R[0] + (M[0] + R[0]) * L[2] + (L[0] + M[0]) * R[2]
                    + LongStream.of(L[0] * M[3] + R[0] * M[3], L[0] * M[3] + R[0] * M[4] + L[0] * R[0] * M[5], L[0] * M[4] + R[0] * M[3] + L[0] * R[0] * M[5], L[0] * M[4] + R[0] * M[4]).max().getAsLong() : 0L).max().getAsLong() : "");
    }
}
