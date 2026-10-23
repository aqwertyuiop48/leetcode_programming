import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk ? CompletableFuture.supplyAsync(() -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken())}).toArray(long[][]::new) instanceof long[][] f
            && IntStream.range(0, n).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).toArray(int[][]::new) instanceof int[][] rg
            && new int[n + 1] instanceof int[] base && IntStream.range(0, n).allMatch(i -> (base[i + 1] = base[i] + rg[i][1] - rg[i][0] + 2) > 0)
            && (Integer) (base[n] + 2) instanceof Integer V && (Integer) (V - 2) instanceof Integer S && (Integer) (V - 1) instanceof Integer T
            && IntStream.range(0, V).map(i -> -1).toArray() instanceof int[] head && new int[300000] instanceof int[] nxt && new int[300000] instanceof int[] to && new long[300000] instanceof long[] cap && new int[]{0} instanceof int[] ec
            && ((BiPredicate<int[], Long>) (uv, c) -> (to[ec[0]] = uv[1]) >= 0 && (cap[ec[0]] = c) >= 0 && (nxt[ec[0]] = head[uv[0]]) >= -1 && (head[uv[0]] = ec[0]++) >= 0
                && (to[ec[0]] = uv[0]) >= 0 && (cap[ec[0]] = 0) == 0 && (nxt[ec[0]] = head[uv[1]]) >= -1 && (head[uv[1]] = ec[0]++) >= 0) instanceof BiPredicate<int[], Long> add
            && (Long) 2000000L instanceof Long W && (Long) 1000000000000L instanceof Long INF
            && IntStream.range(0, n).allMatch(i -> add.test(new int[]{S, base[i]}, INF) && add.test(new int[]{base[i + 1] - 1, T}, INF)
                && IntStream.rangeClosed(rg[i][0], rg[i][1]).allMatch(x -> add.test(new int[]{base[i] + x - rg[i][0], base[i] + x - rg[i][0] + 1}, W - (f[i][0] * x * x + f[i][1] * x + f[i][2])) && add.test(new int[]{base[i] + x - rg[i][0] + 1, base[i] + x - rg[i][0]}, INF)))
            && IntStream.range(0, m).allMatch(j -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer u && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer v && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer d
                && IntStream.rangeClosed(rg[u][0], rg[u][1] + 1).allMatch(k -> (Integer) (k - d) instanceof Integer t0 && (t0 <= rg[v][0] || add.test(new int[]{base[u] + k - rg[u][0], base[v] + Math.min(t0, rg[v][1] + 1) - rg[v][0]}, INF))))
            && new int[V] instanceof int[] level && new int[V] instanceof int[] it && new int[V] instanceof int[] qu && new long[]{0} instanceof long[] flow && new Object[1] instanceof Object[] ref
            && (ref[0] = (BiFunction<Integer, Long, Long>) (u, fl) -> u.equals(T) ? fl : (Stream.iterate(it[u], e -> e != -1, e -> nxt[e]).mapToLong(e -> (it[u] = e) >= 0 && cap[e] > 0 && level[to[e]] == level[u] + 1
                    ? ((Long) ((BiFunction<Integer, Long, Long>) ref[0]).apply(to[e], Math.min(fl, cap[e])) instanceof Long dd && dd > 0 && (cap[e] -= dd) >= 0 && (cap[e ^ 1] += dd) > 0 ? dd : 0L) : 0L).filter(dd -> dd > 0).findFirst() instanceof OptionalLong r2 && r2.isPresent() ? r2.getAsLong() : ((it[u] = -1) < 0 ? 0L : 0L))) != null
            && (IntStream.range(0, 100000).allMatch(round -> IntStream.range(0, V).allMatch(i -> (level[i] = -1) == -1) && (level[S] = 0) == 0 && (qu[0] = S) >= 0 && new int[]{1} instanceof int[] qt
                && IntStream.range(0, V).allMatch(h -> h >= qt[0] || IntStream.iterate(head[qu[h]], e -> e != -1, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || level[to[e]] != -1 || ((level[to[e]] = level[qu[h]] + 1) > 0 && (qu[qt[0]++] = to[e]) >= 0)))
                && level[T] != -1 && IntStream.range(0, V).allMatch(i -> (it[i] = head[i]) >= -1)
                && (IntStream.range(0, 1000000).allMatch(z -> (Long) ((BiFunction<Integer, Long, Long>) ref[0]).apply(S, INF) instanceof Long pushed && pushed > 0 && (flow[0] += pushed) > 0) || true)) || true)
            ? "" + (n * W - flow[0]) : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
