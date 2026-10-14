import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
                && new int[n] instanceof int[] deg
                && IntStream.range(0, n).allMatch(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1, s.nextInt()} instanceof int[] e
                    && adj.get(e[0]).add(new int[]{e[1], e[2]}) && adj.get(e[1]).add(new int[]{e[0], e[2]})
                    && ++deg[e[0]] > 0 && ++deg[e[1]] > 0)
                && new boolean[n] instanceof boolean[] removed
                && new int[n] instanceof int[] par
                && new long[n] instanceof long[] pw
                && new long[n] instanceof long[] sz
                && IntStream.range(0, n).allMatch(v -> (sz[v] = 1) > 0)
                && new long[n] instanceof long[] down
                && new long[n] instanceof long[] ans
                && Stream.iterate(IntStream.range(0, n).filter(v -> deg[v] == 1).boxed().toList(), fr -> !fr.isEmpty(),
                    fr -> fr.stream().allMatch(v -> (removed[v] = true))
                        ? fr.stream().flatMap(v -> adj.get(v).stream().filter(e -> !removed[e[0]]).map(e -> new int[]{v, e[0], e[1]}))
                            .filter(x -> (par[x[0]] = x[1]) >= 0 && (pw[x[0]] = x[2]) >= 0 && --deg[x[1]] == 1).map(x -> x[1]).toList()
                        : List.<Integer>of()).flatMap(List::stream).toList() instanceof List<Integer> order
                && order.stream().allMatch(v -> (sz[par[v]] += sz[v]) > 0 && (down[par[v]] += down[v] + pw[v] * sz[v]) >= 0)
                && IntStream.range(0, n).filter(v -> !removed[v]).boxed().findFirst().get() instanceof Integer c0
                && Stream.iterate(new int[]{-1, c0, 0, 0}, x -> x[3] == 0 || x[1] != c0,
                    x -> adj.get(x[1]).stream().filter(e -> !removed[e[0]] && e[0] != x[0]).findFirst().map(e -> new int[]{x[1], e[0], e[1], x[3] + 1}).get()).toList() instanceof List<int[]> cyc
                && Integer.valueOf(cyc.size()) instanceof Integer k
                && new long[2 * k] instanceof long[] p
                && IntStream.range(1, k).allMatch(i -> (p[i] = p[i - 1] + cyc.get(i)[2]) > 0)
                && Long.valueOf(p[k - 1] + adj.get(c0).stream().filter(e -> e[0] == cyc.get(k - 1)[1]).findFirst().get()[1]) instanceof Long L
                && IntStream.range(0, k).allMatch(i -> (p[i + k] = p[i] + L) > 0)
                && new long[2 * k] instanceof long[] pz
                && new long[2 * k] instanceof long[] pp
                && IntStream.range(0, 2 * k).allMatch(j -> (pz[j] = (j > 0 ? pz[j - 1] : 0) + sz[cyc.get(j % k)[1]]) > 0
                    && (pp[j] = (j > 0 ? pp[j - 1] : 0) + sz[cyc.get(j % k)[1]] * p[j]) >= 0)
                && Long.valueOf(cyc.stream().mapToLong(x -> down[x[1]]).sum()) instanceof Long totalDown
                && IntStream.range(0, k).allMatch(i ->
                    Integer.valueOf(Arrays.binarySearch(p, i, i + k, p[i] + L / 2)) instanceof Integer r
                    && Integer.valueOf(r >= 0 ? r : -r - 2) instanceof Integer h
                    && (ans[cyc.get(i)[1]] = totalDown
                        + (pp[h] - pp[i]) - p[i] * (pz[h] - pz[i])
                        + (p[i] + L) * (pz[i + k - 1] - pz[h]) - (pp[i + k - 1] - pp[h])) > 0)
                && IntStream.iterate(order.size() - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                    (ans[order.get(i)] = ans[par[order.get(i)]] + pw[order.get(i)] * (n - 2 * sz[order.get(i)])) > 0)
                ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : "")));
    }
}
