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
            && IntStream.range(0, 2 * m).map(i -> i < m ? e[2 * i] * n + e[2 * i + 1] : e[2 * (i - m) + 1] * n + e[2 * (i - m)]).sorted().toArray() instanceof int[] all
            && IntStream.range(0, 2 * m).map(i -> all[i] % n).toArray() instanceof int[] lst
            && new int[n + 1] instanceof int[] cs
            && IntStream.range(0, 2 * m).allMatch(i -> ++cs[all[i] / n + 1] > 0)
            && IntStream.range(0, n).allMatch(u -> (cs[u + 1] += cs[u]) >= 0)
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
            && new int[4] instanceof int[] cc
            && IntStream.range(0, 2 * nn).filter(qi ->
                qi < tail[0] && (seenA[(n - 1) * 8] & 1L) == 0
                && (cc[0] = queue[qi]) >= 0
                && (cc[0] < nn
                    ? (cc[1] = cc[0] / n) >= 0
                        && (cc[2] = cc[0] % n) >= 0
                        && (cs[cc[1] + 1] - cs[cc[1]] <= 10
                            ? IntStream.range(cs[cc[1]], cs[cc[1] + 1]).filter(ei ->
                                (seenB[cc[2] * 8 + (lst[ei] >> 6)] & 1L << lst[ei]) == 0
                                && (seenB[cc[2] * 8 + (lst[ei] >> 6)] |= 1L << lst[ei]) != 0
                                && ((parent[nn + lst[ei] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[ei] * n + cc[2])) < 0).count() >= 0
                            : IntStream.range(0, 8).filter(w ->
                            (tmp[0] = adj[cc[1] * 8 + w] & ~seenB[cc[2] * 8 + w]) != 0
                            && (seenB[cc[2] * 8 + w] |= tmp[0]) != 0
                            && LongStream.iterate(tmp[0], y -> y != 0, y -> y & (y - 1)).filter(y ->
                                ((parent[nn + (w * 64 + Long.numberOfTrailingZeros(y)) * n + cc[2]] = cc[0])
                                    | (queue[tail[0]++] = nn + (w * 64 + Long.numberOfTrailingZeros(y)) * n + cc[2])) < 0).count() < 0).count() >= 0)
                    : (cc[1] = (cc[0] - nn) / n) >= 0
                        && (cc[2] = (cc[0] - nn) % n) >= 0
                        && (cs[cc[2] + 1] - cs[cc[2]] <= 10
                            ? IntStream.range(cs[cc[2]], cs[cc[2] + 1]).filter(ei ->
                                lst[ei] != cc[1] && (seenA[cc[1] * 8 + (lst[ei] >> 6)] & 1L << lst[ei]) == 0
                                && (seenA[cc[1] * 8 + (lst[ei] >> 6)] |= 1L << lst[ei]) != 0
                                && ((parent[cc[1] * n + lst[ei]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[ei])) < 0).count() >= 0
                            : IntStream.range(0, 8).filter(w ->
                            (tmp[0] = adj[cc[2] * 8 + w] & ~seenA[cc[1] * 8 + w]) != 0
                            && (seenA[cc[1] * 8 + w] |= tmp[0]) != 0
                            && LongStream.iterate(tmp[0], y -> y != 0, y -> y & (y - 1)).filter(y ->
                                ((parent[cc[1] * n + w * 64 + Long.numberOfTrailingZeros(y)] = cc[0])
                                    | (queue[tail[0]++] = cc[1] * n + w * 64 + Long.numberOfTrailingZeros(y))) < 0).count() < 0).count() >= 0))).count() >= 0
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

