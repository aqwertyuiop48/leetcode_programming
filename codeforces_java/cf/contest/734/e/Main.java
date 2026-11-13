import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 64 ? (v[(int) st[3]++] = raw[k]) : raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : raw[k] == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] head
            && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(j -> Integer.valueOf((int) v[1 + n + 2 * j] - 1) instanceof Integer a && Integer.valueOf((int) v[2 + n + 2 * j] - 1) instanceof Integer b
                && 0 * ((to[2 * j] = b) + (nxt[2 * j] = head[a]) + (head[a] = 2 * j) + (to[2 * j + 1] = a) + (nxt[2 * j + 1] = head[b]) + (head[b] = 2 * j + 1)) == 0)
            && (IntFunction<int[]>) (src -> new int[n] instanceof int[] dist && new int[n] instanceof int[] q && new int[n] instanceof int[] pr
                && new int[]{1} instanceof int[] qt && (pr[src] = -1) < 0 && (q[0] = src) == src
                && IntStream.range(0, n).allMatch(qi -> IntStream.iterate(head[q[qi]], s -> s >= 0, s -> nxt[s])
                    .allMatch(s -> to[s] == pr[q[qi]] || 0 * ((pr[to[s]] = q[qi]) + (dist[to[s]] = dist[q[qi]] + (v[1 + to[s]] != v[1 + q[qi]] ? 1 : 0)) + (q[qt[0]++] = to[s])) == 0))
                ? dist : null) instanceof IntFunction<int[]> bfs
            && bfs.apply(0) instanceof int[] d1
            && IntStream.range(0, n).boxed().max(Comparator.comparingInt((Integer i) -> d1[i])).get() instanceof Integer far
            && bfs.apply(far) instanceof int[] d2
            ? (IntStream.of(d2).max().getAsInt() + 1) / 2 : "");
    }
}
