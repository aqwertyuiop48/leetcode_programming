import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer k
            && IntStream.range(0, n * n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long INF
            && new int[4 * n * n] instanceof int[] from && new int[4 * n * n] instanceof int[] to && new long[4 * n * n] instanceof long[] cap && new long[4 * n * n] instanceof long[] cost && new int[]{0} instanceof int[] E
            && ((Predicate<long[]>) e -> (from[E[0]] = (int) e[0]) >= 0 & (to[E[0]] = (int) e[1]) >= 0 & (cap[E[0]] = e[2]) >= 0 & (cost[E[0]] = e[3]) > Long.MIN_VALUE & E[0]++ >= 0) instanceof Predicate<long[]> add
            && IntStream.range(0, n * n).filter(i -> a[i] > 0).allMatch(i -> add.test(new long[]{i / n, i % n, a[i], 0}) && add.test(new long[]{i % n, i / n, 0, 0})
                && add.test(new long[]{i / n, i % n, k, 1}) && add.test(new long[]{i % n, i / n, 0, -1}))
            && new long[]{k, 0} instanceof long[] bt && new boolean[]{true} instanceof boolean[] go
            && IntStream.iterate(0, z -> go[0], z -> z + 1).allMatch(z -> LongStream.generate(() -> INF).limit(n).toArray() instanceof long[] dist && (dist[0] = 0) == 0 && new int[n] instanceof int[] pe && new boolean[]{true} instanceof boolean[] chg
                && IntStream.iterate(0, y -> chg[0], y -> y + 1).allMatch(y -> !(chg[0] = false)
                    && (IntStream.range(0, E[0]).filter(e -> cap[e] > 0 && dist[from[e]] < INF && dist[from[e]] + cost[e] < dist[to[e]]).allMatch(e -> (dist[to[e]] = dist[from[e]] + cost[e]) < INF && (pe[to[e]] = e) >= 0 && (chg[0] = true)) | true))
                && (dist[n - 1] >= INF ? !(go[0] = false)
                    : Long.valueOf(IntStream.iterate(n - 1, v -> v != 0, v -> from[pe[v]]).mapToLong(v -> cap[pe[v]]).min().getAsLong()) instanceof Long bott
                    && Long.valueOf(dist[n - 1] == 0 ? bott : Math.min(bott, bt[0] / dist[n - 1])) instanceof Long f
                    && (f > 0 ? IntStream.iterate(n - 1, v -> v != 0, v -> from[pe[v]]).allMatch(v -> (cap[pe[v]] -= f) >= 0 & (cap[pe[v] ^ 1] += f) > 0) && (bt[1] += f) > 0 && (bt[0] -= f * dist[n - 1]) >= 0 : !(go[0] = false))))
            ? bt[1] : "");
    }
}
