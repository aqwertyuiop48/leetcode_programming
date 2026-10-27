import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && Integer.valueOf(g0[2 + 3 * m]) instanceof Integer k
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, m).allMatch(e ->
                st[g0[2 + 3 * e]]++ >= 0 && st[g0[3 + 3 * e]]++ >= 0)
            && IntStream.range(0, n).allMatch(i -> (st[i + 1] += st[i]) >= 0)
            && Arrays.copyOf(st, n + 1) instanceof int[] pos
            && new int[2 * m] instanceof int[] adj
            && new int[2 * m] instanceof int[] wt
            && IntStream.range(0, m).allMatch(e ->
                Integer.valueOf(g0[2 + 3 * e] - 1) instanceof Integer u
                && Integer.valueOf(g0[3 + 3 * e] - 1) instanceof Integer v
                && (adj[pos[u]] = v) >= 0
                && (wt[pos[u]++] = g0[4 + 3 * e]) >= 0
                && (adj[pos[v]] = u) >= 0
                && (wt[pos[v]++] = g0[4 + 3 * e]) >= 0)
            && new long[n] instanceof long[] dist
            && new int[n] instanceof int[] src
            && IntStream.range(0, n).allMatch(i -> (dist[i] = Long.MAX_VALUE) > 0)
            && new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0])) instanceof PriorityQueue<long[]> pq
            && IntStream.range(0, k).allMatch(i ->
                Integer.valueOf(g0[3 + 3 * m + i] - 1) instanceof Integer p
                && (dist[p] = 0) == 0
                && (src[p] = p) >= 0
                && pq.add(new long[]{0, p}))
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).allMatch(cur ->
                Integer.valueOf((int) cur[1]) instanceof Integer v
                && (cur[0] > dist[v]
                    || IntStream.range(st[v], st[v + 1]).allMatch(j ->
                        Integer.valueOf(adj[j]) instanceof Integer u
                        && Long.valueOf(dist[v] + wt[j]) instanceof Long nd
                        && (nd >= dist[u]
                            || ((dist[u] = nd) >= 0
                                && (src[u] = src[v]) >= 0
                                && pq.add(new long[]{nd, u}))))))
            && new int[n] instanceof int[] dsu
            && IntStream.range(0, n).allMatch(i -> (dsu[i] = i) >= 0)
            && new int[n] instanceof int[] sz
            && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, x -> dsu[x] == x ? x : find.get().applyAsInt(dsu[x]))
            && new long[1] instanceof long[] total
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingLong(e ->
                dist[g0[2 + 3 * e] - 1] + dist[g0[3 + 3 * e] - 1] + g0[4 + 3 * e])).allMatch(e ->
                Integer.valueOf(g0[2 + 3 * e] - 1) instanceof Integer u
                && Integer.valueOf(g0[3 + 3 * e] - 1) instanceof Integer v
                && (src[u] == src[v]
                    || (Integer.valueOf(find.get().applyAsInt(src[u])) instanceof Integer ru
                        && Integer.valueOf(find.get().applyAsInt(src[v])) instanceof Integer rv
                        && (ru.equals(rv)
                            || ((total[0] += dist[u] + dist[v] + g0[4 + 3 * e]) >= 0
                                && (sz[ru] < sz[rv]
                                    ? (dsu[ru] = rv) >= 0 && (sz[rv] += sz[ru]) > 0
                                    : (dsu[rv] = ru) >= 0 && (sz[ru] += sz[rv]) > 0))))))
            ? (total[0] + dist[0]) : "");
    }
}

