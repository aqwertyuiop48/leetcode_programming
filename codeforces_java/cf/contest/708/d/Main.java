import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new long[] {Long.parseLong(st.nextToken()) - 1, Long.parseLong(st.nextToken()) - 1, Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())}).toArray(long[][]::new) instanceof long[][] ed
            && new long[n] instanceof long[] ex && Long.valueOf(1000000000000L) instanceof Long INF && Integer.valueOf(n) instanceof Integer SS && Integer.valueOf(n + 1) instanceof Integer TT
            && Arrays.stream(ed).filter(e -> (ex[(int) e[1]] += e[3]) + (ex[(int) e[0]] -= e[3]) < -4000000000000000L).count() >= 0
            && (Long) Arrays.stream(ed).mapToLong(e -> Math.max(0, e[3] - e[2])).sum() instanceof Long base
            && Stream.concat(Stream.concat(Arrays.stream(ed).flatMap(e -> Stream.of(
                    new long[] {e[0], e[1], e[3] <= e[2] ? e[2] - e[3] : 0, 1}, new long[] {e[0], e[1], INF, 2},
                    new long[] {e[1], e[0], e[3] <= e[2] ? e[3] : e[3] - e[2], e[3] <= e[2] ? 1 : 0}, new long[] {e[1], e[0], e[3] <= e[2] ? 0 : e[2], 1})),
                Stream.of(new long[] {0, n - 1, INF, 0}, new long[] {n - 1, 0, INF, 0})),
                IntStream.range(0, n).boxed().flatMap(v -> Stream.of(new long[] {SS, v, Math.max(0, ex[v]), 0}, new long[] {v, TT, Math.max(0, -ex[v]), 0})))
                .filter(a -> a[2] > 0).toArray(long[][]::new) instanceof long[][] arcs
            && Integer.valueOf(2 * arcs.length) instanceof Integer E && Integer.valueOf(n + 2) instanceof Integer N
            && new int[E] instanceof int[] fr && new int[E] instanceof int[] to && new long[E] instanceof long[] cap && new long[E] instanceof long[] cost
            && IntStream.range(0, arcs.length).filter(i -> (fr[2 * i] = (int) arcs[i][0]) + (to[2 * i] = (int) arcs[i][1]) + (int) (cap[2 * i] = arcs[i][2]) + (int) (cost[2 * i] = arcs[i][3])
                + (fr[2 * i + 1] = (int) arcs[i][1]) + (to[2 * i + 1] = (int) arcs[i][0]) + (int) (cost[2 * i + 1] = -arcs[i][3]) < Integer.MIN_VALUE).count() >= 0
            && new long[N] instanceof long[] dist && new int[N] instanceof int[] pe && new long[1] instanceof long[] total
            && (IntStream.range(0, 1 << 22).allMatch(it -> IntStream.range(0, N).filter(v -> (dist[v] = v == SS ? 0 : INF) < 0).count() == 0
                && (IntStream.range(0, N + 1).allMatch(r -> IntStream.range(0, E).filter(e -> cap[e] > 0 && dist[fr[e]] < INF && dist[fr[e]] + cost[e] < dist[to[e]]
                    && (dist[to[e]] = dist[fr[e]] + cost[e]) + (pe[to[e]] = e) > Long.MIN_VALUE).count() > 0) || true)
                && dist[TT] < INF
                && Long.valueOf(IntStream.iterate(TT, v -> v != SS, v -> fr[pe[v]]).mapToLong(v -> cap[pe[v]]).min().getAsLong()) instanceof Long bn
                && IntStream.iterate(TT, v -> v != SS, v -> fr[pe[v]]).filter(v -> (cap[pe[v]] -= bn) + (cap[pe[v] ^ 1] += bn) + (total[0] += bn * cost[pe[v]]) < Long.MIN_VALUE).count() >= 0) || true)
            ? base + total[0] : "");
    }
}
