import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextToken())).ifPresent(n ->
            System.out.println(
                IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
                && new long[]{0} instanceof long[] sum
                && IntStream.range(1, n).allMatch(i -> new int[]{Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken())} instanceof int[] e
                    && adj.get(e[0]).add(new int[]{e[1], e[2]}) && adj.get(e[1]).add(new int[]{e[0], e[2]}) && (sum[0] += e[2]) > 0)
                && new long[n + 1] instanceof long[] dist
                ? 2 * sum[0] - Stream.iterate(List.of(new int[]{1, 0}), f -> !f.isEmpty(),
                    f -> f.stream().flatMap(u -> adj.get(u[0]).stream().filter(e -> e[0] != u[1]).map(e -> new int[]{e[0], u[0], (int) (dist[e[0]] = dist[u[0]] + e[1])})).toList())
                    .flatMap(List::stream).mapToLong(u -> dist[u[0]]).max().getAsLong()
                : 0)));
    }
}
