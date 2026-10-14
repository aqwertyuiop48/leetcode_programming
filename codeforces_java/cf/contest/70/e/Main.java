import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(k ->
            Optional.of(IntStream.concat(IntStream.of(0), IntStream.generate(s::nextInt).limit(n - 1)).toArray()).ifPresent(d ->
            Optional.of(IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList()).ifPresent(g ->
            Optional.of(IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> i == j ? 0 : 1000000).toArray()).toArray(int[][]::new)).ifPresent(dist ->
            Optional.of(new int[n][n]).ifPresent(dp ->
            Optional.of(new int[n]).ifPresent(best ->
            Optional.of(new int[n]).ifPresent(arg ->
            Optional.of(new int[n]).ifPresent(ans ->
            Optional.of(new AtomicReference<Function<int[], Integer>>()).ifPresent(dfs ->
            Optional.of(new AtomicReference<Function<int[], Integer>>()).ifPresent(asn ->
                System.out.print(IntStream.range(0, n - 1).allMatch(i -> Optional.of(new int[]{s.nextInt() - 1, s.nextInt() - 1}).map(e -> (g.get(e[0]).add(e[1]) & g.get(e[1]).add(e[0])) & (dist[e[0]][e[1]] = dist[e[1]][e[0]] = 1) > 0).get())
                    && IntStream.range(0, n).allMatch(m -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (dist[i][j] = Math.min(dist[i][j], dist[i][m] + dist[m][j])) >= 0)))
                    && dfs.updateAndGet(o -> a -> Optional.of(a[0]).map(v ->
                        g.get(v).stream().filter(u -> u != a[1]).mapToInt(u -> dfs.get().apply(new int[]{u, v})).sum() >= 0
                        & IntStream.range(0, n).allMatch(c -> (dp[v][c] = d[dist[v][c]] + g.get(v).stream().filter(u -> u != a[1]).mapToInt(u -> Math.min(dp[u][c], best[u] + k)).sum()) > -1)
                        & (best[v] = IntStream.range(0, n).map(c -> dp[v][c]).min().getAsInt()) >= 0
                        & (arg[v] = IntStream.range(0, n).filter(c -> dp[v][c] == best[v]).findFirst().getAsInt()) >= 0 ? 0 : 0).get()).apply(new int[]{0, -1}) == 0
                    && asn.updateAndGet(o -> a -> (ans[a[0]] = a[2]) >= 0 ? g.get(a[0]).stream().filter(u -> u != a[1]).mapToInt(u -> asn.get().apply(new int[]{u, a[0], dp[u][a[2]] <= best[u] + k ? a[2] : arg[u]})).sum() : 0).apply(new int[]{0, -1, arg[0]}) >= 0
                    ? (best[0] + k) + "\n" + IntStream.of(ans).mapToObj(c -> String.valueOf(c + 1)).collect(Collectors.joining(" ")) : "")))))))))))));
    }
}
