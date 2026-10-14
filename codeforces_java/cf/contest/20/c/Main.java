import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                && IntStream.rangeClosed(0, nm[0]).<List<long[]>>mapToObj(i -> new ArrayList<>()).collect(Collectors.toList()) instanceof List<List<long[]>> adj
                && IntStream.range(0, nm[1]).allMatch(i ->
                    new int[]{s.nextInt(), s.nextInt()} instanceof int[] uv
                    && new long[]{s.nextLong()} instanceof long[] w
                    && adj.get(uv[0]).add(new long[]{uv[1], w[0]})
                    && adj.get(uv[1]).add(new long[]{uv[0], w[0]}))
                && LongStream.generate(() -> Long.MAX_VALUE).limit(nm[0] + 1).toArray() instanceof long[] dist
                && IntStream.generate(() -> -1).limit(nm[0] + 1).toArray() instanceof int[] par
                && new boolean[nm[0] + 1] instanceof boolean[] vis
                && (dist[1] = 0) == 0
                && new PriorityQueue<long[]>((a, b) -> Long.compare(a[0], b[0])) instanceof PriorityQueue<long[]> pq
                && pq.add(new long[]{0, 1})
                && Stream.generate(pq::poll).takeWhile(Objects::nonNull)
                    .filter(t -> !vis[(int) t[1]])
                    .allMatch(t -> (vis[(int) t[1]] = true)
                        && adj.get((int) t[1]).stream().allMatch(e ->
                            vis[(int) e[0]] || dist[(int) t[1]] + e[1] >= dist[(int) e[0]]
                            || ((dist[(int) e[0]] = dist[(int) t[1]] + e[1]) >= 0
                                && (par[(int) e[0]] = (int) t[1]) >= 0
                                && pq.add(new long[]{dist[(int) e[0]], e[0]}))))
                ? (dist[nm[0]] == Long.MAX_VALUE
                    ? "-1"
                    : Stream.iterate(nm[0], c -> c != -1, c -> par[c]).map(String::valueOf).reduce("", (x, y) -> y + (x.isEmpty() ? "" : " ") + x))
                : ""));
    }
}
