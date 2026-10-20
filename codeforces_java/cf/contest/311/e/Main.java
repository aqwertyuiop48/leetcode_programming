import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(it.nextInt()) instanceof Integer g
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] sex && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] cost
            && Integer.valueOf(n + m + 2) instanceof Integer V && Integer.valueOf(1000000000) instanceof Integer INF
            && IntStream.generate(() -> -1).limit(V).toArray() instanceof int[] hd
            && new ArrayList<int[]>() instanceof ArrayList<int[]> el
            && new int[1200000] instanceof int[] to && new int[1200000] instanceof int[] cap && new int[1200000] instanceof int[] nxt && new int[1] instanceof int[] ec
            && ((Predicate<int[]>) q -> (to[ec[0]] = q[1]) >= 0 && (cap[ec[0]] = q[2]) >= 0 && (nxt[ec[0]] = hd[q[0]]) >= -1 && (hd[q[0]] = ec[0]++) >= 0
                && (to[ec[0]] = q[0]) >= 0 && (cap[ec[0]] = 0) == 0 && (nxt[ec[0]] = hd[q[1]]) >= -1 && (hd[q[1]] = ec[0]++) >= 0) instanceof Predicate<int[]> addEdge
            && IntStream.range(0, n).allMatch(i -> addEdge.test(sex[i] == 0 ? new int[]{0, i + 2, cost[i]} : new int[]{i + 2, 1, cost[i]}))
            && new long[]{0} instanceof long[] total
            && IntStream.range(0, m).allMatch(j -> Integer.valueOf(it.nextInt()) instanceof Integer t && Integer.valueOf(it.nextInt()) instanceof Integer w && Integer.valueOf(it.nextInt()) instanceof Integer k
                && IntStream.range(0, k).map(z -> it.nextInt() + 1).toArray() instanceof int[] ds && Integer.valueOf(it.nextInt()) instanceof Integer fr
                && (total[0] += w) >= 0
                && addEdge.test(t == 0 ? new int[]{0, n + 2 + j, w + g * fr} : new int[]{n + 2 + j, 1, w + g * fr})
                && Arrays.stream(ds).allMatch(dd -> addEdge.test(t == 0 ? new int[]{n + 2 + j, dd, INF} : new int[]{dd, n + 2 + j, INF})))
            && new int[V] instanceof int[] level && new int[V] instanceof int[] cur && new int[V] instanceof int[] qu
            && ((IntPredicate) z -> IntStream.range(0, V).allMatch(i -> (level[i] = -1) < 0 && (cur[i] = hd[i]) >= -1)
                && (level[0] = 0) == 0 && (qu[0] = 0) == 0 && new int[]{0, 1} instanceof int[] qp
                && IntStream.generate(() -> 0).anyMatch(w -> qp[0] >= qp[1]
                    || (Integer.valueOf(qu[qp[0]++]) instanceof Integer u
                        && IntStream.iterate(hd[u], e -> e != -1, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || level[to[e]] >= 0 || ((level[to[e]] = level[u] + 1) >= 0 && (qu[qp[1]++] = to[e]) >= 0)) && false))
                && level[1] >= 0) instanceof IntPredicate bfs
            && new AtomicReference<ToIntFunction<int[]>>() instanceof AtomicReference<ToIntFunction<int[]>> dfs
            && dfs.compareAndSet(null, q -> q[0] == 1 ? q[1]
                : new int[]{0} instanceof int[] r && IntStream.iterate(cur[q[0]], e -> e != -1, e -> nxt[e]).anyMatch(e -> (cur[q[0]] = e) >= 0 && cap[e] > 0 && level[to[e]] == level[q[0]] + 1
                    && (r[0] = dfs.get().applyAsInt(new int[]{to[e], Math.min(q[1], cap[e])})) > 0 && (cap[e] -= r[0]) >= 0 && (cap[e ^ 1] += r[0]) > 0) ? r[0] : 0)
            && new long[]{0} instanceof long[] flow
            && IntStream.generate(() -> 0).anyMatch(z -> !bfs.test(0) || (IntStream.generate(() -> 0).anyMatch(y -> Integer.valueOf(dfs.get().applyAsInt(new int[]{0, INF})) instanceof Integer f && f > 0 ? (flow[0] += f) < 0 : true) && false))
            ? String.valueOf(total[0] - flow[0]) : "");
    }
}
