import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(n * m) instanceof Integer N
            && IntStream.range(0, N).map(i -> it.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(N + 2) instanceof Integer V && Integer.valueOf(8 * N + 16) instanceof Integer EM
            && IntStream.generate(() -> -1).limit(V).toArray() instanceof int[] hd && new int[EM] instanceof int[] to && new int[EM] instanceof int[] cap && new int[EM] instanceof int[] cost && new int[EM] instanceof int[] nxt && new int[1] instanceof int[] ec
            && ((Predicate<int[]>) q -> (to[ec[0]] = q[1]) >= 0 && (cap[ec[0]] = q[2]) >= 0 && (cost[ec[0]] = q[3]) >= 0 && (nxt[ec[0]] = hd[q[0]]) >= -1 && (hd[q[0]] = ec[0]++) >= 0
                && (to[ec[0]] = q[0]) >= 0 && (cap[ec[0]] = 0) == 0 && (cost[ec[0]] = -q[3]) <= 0 && (nxt[ec[0]] = hd[q[1]]) >= -1 && (hd[q[1]] = ec[0]++) >= 0) instanceof Predicate<int[]> add
            && IntStream.range(0, N).allMatch(id -> Integer.valueOf(id / m) instanceof Integer r && Integer.valueOf(id % m) instanceof Integer c
                && ((r + c) % 2 == 0
                    ? add.test(new int[]{N, id, 1, 0}) && (r == 0 || add.test(new int[]{id, id - m, 1, a[id] != a[id - m] ? 1 : 0})) && (r == n - 1 || add.test(new int[]{id, id + m, 1, a[id] != a[id + m] ? 1 : 0}))
                        && (c == 0 || add.test(new int[]{id, id - 1, 1, a[id] != a[id - 1] ? 1 : 0})) && (c == m - 1 || add.test(new int[]{id, id + 1, 1, a[id] != a[id + 1] ? 1 : 0}))
                    : add.test(new int[]{id, N + 1, 1, 0})))
            && new long[V] instanceof long[] h && new long[V] instanceof long[] dist && new int[V] instanceof int[] lvl && new int[V] instanceof int[] cur && new int[V + 1] instanceof int[] que && new int[2] instanceof int[] qp
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long INF
            && ((IntPredicate) z -> IntStream.range(0, V).allMatch(i -> (dist[i] = INF) > 0) && (dist[N] = 0) == 0 && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq && pq.add((long) N)
                && IntStream.generate(() -> 0).anyMatch(w -> pq.isEmpty() || (pq.poll() instanceof Long top && Integer.valueOf((int) (top & 0xFFFFF)) instanceof Integer u && (top >> 20) == dist[u]
                    && IntStream.iterate(hd[u], e -> e != -1, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || dist[u] + cost[e] + h[u] - h[to[e]] >= dist[to[e]] || ((dist[to[e]] = dist[u] + cost[e] + h[u] - h[to[e]]) >= 0 && pq.add(dist[to[e]] << 20 | to[e])))
                    && false))
                && dist[N + 1] < INF && IntStream.range(0, V).allMatch(i -> dist[i] >= INF || (h[i] += dist[i]) > Long.MIN_VALUE)) instanceof IntPredicate dij
            && ((IntPredicate) z -> IntStream.range(0, V).allMatch(i -> (lvl[i] = -1) < 0 && (cur[i] = hd[i]) >= -1) && (lvl[N] = 0) == 0 && (que[0] = N) == N && (qp[0] = 0) == 0 && (qp[1] = 1) == 1
                && IntStream.generate(() -> 0).anyMatch(w -> qp[0] >= qp[1] || (Integer.valueOf(que[qp[0]++]) instanceof Integer u
                    && IntStream.iterate(hd[u], e -> e != -1, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || lvl[to[e]] >= 0 || cost[e] + h[u] - h[to[e]] != 0 || ((lvl[to[e]] = lvl[u] + 1) > 0 && (que[qp[1]++] = to[e]) >= 0))
                    && false))
                && lvl[N + 1] >= 0) instanceof IntPredicate bfs
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> dfs
            && dfs.compareAndSet(null, u -> u == N + 1 || (IntStream.generate(() -> 0).anyMatch(w -> cur[u] == -1
                    || (cap[cur[u]] > 0 && lvl[to[cur[u]]] == lvl[u] + 1 && cost[cur[u]] + h[u] - h[to[cur[u]]] == 0 && dfs.get().test(to[cur[u]]) && (cap[cur[u]] -= 1) >= 0 && (cap[cur[u] ^ 1] += 1) > 0)
                    || (cur[u] = nxt[cur[u]]) < -5) && cur[u] != -1))
            && new long[1] instanceof long[] total
            && IntStream.generate(() -> 0).anyMatch(z -> !dij.test(0) || (IntStream.generate(() -> 0).anyMatch(y -> !bfs.test(0)
                || (IntStream.generate(() -> 0).anyMatch(x -> !(dfs.get().test(N) && (total[0] += h[N + 1]) > Long.MIN_VALUE)) && false)) && false))
            ? String.valueOf(total[0]) : ""), "", 1L << 29).start();
    }
}
