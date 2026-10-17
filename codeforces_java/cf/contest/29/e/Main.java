import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> s.nextInt() - 1).toArray() instanceof int[] e
            && new long[n * 8] instanceof long[] adj
            && IntStream.range(0, m).allMatch(i -> (adj[e[2 * i] * 8 + (e[2 * i + 1] >> 6)] |= 1L << e[2 * i + 1]) != 0 && (adj[e[2 * i + 1] * 8 + (e[2 * i] >> 6)] |= 1L << e[2 * i]) != 0)
            && (Integer) (n * n) instanceof Integer nn
            && new long[n * 8] instanceof long[] seenA
            && new long[n * 8] instanceof long[] seenB
            && IntStream.range(0, n).allMatch(u -> (seenA[u * 8 + (u >> 6)] |= 1L << u) != 0)
            && new int[2 * nn] instanceof int[] parent
            && new int[2 * nn] instanceof int[] queue
            && new int[]{1} instanceof int[] tail
            && (queue[0] = n - 1) >= 0
            && (parent[n - 1] = -1) < 0
            && (seenA[(n - 1) >> 6] |= 1L << (n - 1)) != 0
            && new long[1] instanceof long[] tmp
            && IntStream.range(0, 2 * nn).filter(qi ->
                qi < tail[0] && (seenA[(n - 1) * 8] & 1L) == 0
                && (Integer) queue[qi] instanceof Integer x
                && (x < nn
                    ? (Integer) (x / n) instanceof Integer u
                        && (Integer) (x % n) instanceof Integer v
                        && IntStream.range(0, 8).filter(w ->
                            (tmp[0] = adj[u * 8 + w] & ~seenB[v * 8 + w]) != 0
                            && (seenB[v * 8 + w] |= tmp[0]) != 0
                            && LongStream.iterate(tmp[0], y -> y != 0, y -> y & (y - 1)).filter(y ->
                                ((parent[nn + (w * 64 + Long.numberOfTrailingZeros(y)) * n + v] = x)
                                    | (queue[tail[0]++] = nn + (w * 64 + Long.numberOfTrailingZeros(y)) * n + v)) < 0).count() < 0).count() < 0
                    : (Integer) ((x - nn) / n) instanceof Integer p
                        && (Integer) ((x - nn) % n) instanceof Integer q
                        && IntStream.range(0, 8).filter(w ->
                            (tmp[0] = adj[q * 8 + w] & ~seenA[p * 8 + w]) != 0
                            && (seenA[p * 8 + w] |= tmp[0]) != 0
                            && LongStream.iterate(tmp[0], y -> y != 0, y -> y & (y - 1)).filter(y ->
                                ((parent[p * n + w * 64 + Long.numberOfTrailingZeros(y)] = x)
                                    | (queue[tail[0]++] = p * n + w * 64 + Long.numberOfTrailingZeros(y))) < 0).count() < 0).count() < 0)).count() >= 0
            ? (seenA[(n - 1) * 8] & 1L) == 0
                ? "-1"
                : Stream.iterate((n - 1) * n, c -> c != -1, c -> parent[c] >= 0 ? parent[parent[c]] : -1).collect(Collectors.toList()) instanceof List<Integer> rev
                    ? (rev.size() - 1) + "\n"
                        + IntStream.range(0, rev.size()).mapToObj(t -> String.valueOf(rev.get(rev.size() - 1 - t) / n + 1)).collect(Collectors.joining(" ")) + "\n"
                        + IntStream.range(0, rev.size()).mapToObj(t -> String.valueOf(rev.get(rev.size() - 1 - t) % n + 1)).collect(Collectors.joining(" "))
                    : "-1"
            : "-1");
    }
}

