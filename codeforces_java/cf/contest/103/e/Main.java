import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, s.nextInt()).map(j -> s.nextInt() - 1).toArray()).toArray(int[][]::new) instanceof int[][] sets && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a && new int[n] instanceof int[] vis && new int[1] instanceof int[] stamp && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] me && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> tr && tr.compareAndSet(null, (IntPredicate) u -> Arrays.stream(sets[u]).filter(e -> vis[e] != stamp[0]).anyMatch(e -> (vis[e] = stamp[0]) > 0 && (me[e] < 0 || tr.get().test(me[e])) && (me[e] = u) >= 0)) && IntStream.range(0, n).allMatch(u -> (stamp[0] = u + 1) > 0 && tr.get().test(u)) && new long[n + 2][n + 2] instanceof long[][] cap && IntStream.range(0, n).allMatch(u -> (a[u] < 0 ? (cap[n][u] = -a[u]) > 0 : (cap[u][n + 1] = a[u]) >= 0) && Arrays.stream(sets[u]).allMatch(e -> me[e] == u || (cap[u][me[e]] = Long.MAX_VALUE / 4) > 0)) && new long[1] instanceof long[] flow && IntStream.range(0, 100000000).allMatch(it -> IntStream.range(0, n + 2).map(i -> -1).toArray() instanceof int[] par && new int[n + 2] instanceof int[] q && new int[] {1} instanceof int[] tail && (q[0] = n) >= 0 && (par[n] = n) >= 0 && IntStream.range(0, n + 2).allMatch(h -> h < tail[0] && IntStream.range(0, n + 2).filter(v -> par[v] < 0 && cap[q[h]][v] > 0).allMatch(v -> (par[v] = q[h]) >= 0 && (q[tail[0]++] = v) >= 0)) | true && par[n + 1] >= 0 && IntStream.iterate(n + 1, v -> v != n, v -> par[v]).mapToLong(v -> cap[par[v]][v]).min().getAsLong() > 0 && (Long) IntStream.iterate(n + 1, v -> v != n, v -> par[v]).mapToLong(v -> cap[par[v]][v]).min().getAsLong() instanceof Long bn && IntStream.iterate(n + 1, v -> v != n, v -> par[v]).allMatch(v -> (cap[par[v]][v] -= bn) >= 0 && (cap[v][par[v]] += bn) > 0) && (flow[0] += bn) > 0) | true ? flow[0] + Arrays.stream(a).filter(x -> x < 0).sum() : 0L).ifPresent(System.out::println);
    }
}

