import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1] instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> tk[i + 2] - 1).toArray() instanceof int[] e
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
                            ? (cs[cc[1]] + 0 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 0] >> 6)] & 1L << lst[cs[cc[1]] + 0]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 0] >> 6)] |= 1L << lst[cs[cc[1]] + 0]) != 0 && ((parent[nn + lst[cs[cc[1]] + 0] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 0] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 1 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 1] >> 6)] & 1L << lst[cs[cc[1]] + 1]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 1] >> 6)] |= 1L << lst[cs[cc[1]] + 1]) != 0 && ((parent[nn + lst[cs[cc[1]] + 1] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 1] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 2 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 2] >> 6)] & 1L << lst[cs[cc[1]] + 2]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 2] >> 6)] |= 1L << lst[cs[cc[1]] + 2]) != 0 && ((parent[nn + lst[cs[cc[1]] + 2] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 2] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 3 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 3] >> 6)] & 1L << lst[cs[cc[1]] + 3]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 3] >> 6)] |= 1L << lst[cs[cc[1]] + 3]) != 0 && ((parent[nn + lst[cs[cc[1]] + 3] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 3] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 4 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 4] >> 6)] & 1L << lst[cs[cc[1]] + 4]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 4] >> 6)] |= 1L << lst[cs[cc[1]] + 4]) != 0 && ((parent[nn + lst[cs[cc[1]] + 4] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 4] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 5 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 5] >> 6)] & 1L << lst[cs[cc[1]] + 5]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 5] >> 6)] |= 1L << lst[cs[cc[1]] + 5]) != 0 && ((parent[nn + lst[cs[cc[1]] + 5] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 5] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 6 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 6] >> 6)] & 1L << lst[cs[cc[1]] + 6]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 6] >> 6)] |= 1L << lst[cs[cc[1]] + 6]) != 0 && ((parent[nn + lst[cs[cc[1]] + 6] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 6] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 7 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 7] >> 6)] & 1L << lst[cs[cc[1]] + 7]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 7] >> 6)] |= 1L << lst[cs[cc[1]] + 7]) != 0 && ((parent[nn + lst[cs[cc[1]] + 7] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 7] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 8 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 8] >> 6)] & 1L << lst[cs[cc[1]] + 8]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 8] >> 6)] |= 1L << lst[cs[cc[1]] + 8]) != 0 && ((parent[nn + lst[cs[cc[1]] + 8] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 8] * n + cc[2])) >= 0))
                            && (cs[cc[1]] + 9 >= cs[cc[1] + 1] || (seenB[cc[2] * 8 + (lst[cs[cc[1]] + 9] >> 6)] & 1L << lst[cs[cc[1]] + 9]) != 0 || ((seenB[cc[2] * 8 + (lst[cs[cc[1]] + 9] >> 6)] |= 1L << lst[cs[cc[1]] + 9]) != 0 && ((parent[nn + lst[cs[cc[1]] + 9] * n + cc[2]] = cc[0]) | (queue[tail[0]++] = nn + lst[cs[cc[1]] + 9] * n + cc[2])) >= 0))
                            : IntStream.range(0, 8).filter(w ->
                            (tmp[0] = adj[cc[1] * 8 + w] & ~seenB[cc[2] * 8 + w]) != 0
                            && (seenB[cc[2] * 8 + w] |= tmp[0]) != 0
                            && LongStream.iterate(tmp[0], y -> y != 0, y -> y & (y - 1)).filter(y ->
                                ((parent[nn + (w * 64 + Long.numberOfTrailingZeros(y)) * n + cc[2]] = cc[0])
                                    | (queue[tail[0]++] = nn + (w * 64 + Long.numberOfTrailingZeros(y)) * n + cc[2])) < 0).count() < 0).count() >= 0)
                    : (cc[1] = (cc[0] - nn) / n) >= 0
                        && (cc[2] = (cc[0] - nn) % n) >= 0
                        && (cs[cc[2] + 1] - cs[cc[2]] <= 10
                            ? (cs[cc[2]] + 0 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 0] >> 6)] & 1L << lst[cs[cc[2]] + 0]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 0] >> 6)] |= 1L << lst[cs[cc[2]] + 0]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 0]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 0])) >= 0))
                            && (cs[cc[2]] + 1 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 1] >> 6)] & 1L << lst[cs[cc[2]] + 1]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 1] >> 6)] |= 1L << lst[cs[cc[2]] + 1]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 1]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 1])) >= 0))
                            && (cs[cc[2]] + 2 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 2] >> 6)] & 1L << lst[cs[cc[2]] + 2]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 2] >> 6)] |= 1L << lst[cs[cc[2]] + 2]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 2]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 2])) >= 0))
                            && (cs[cc[2]] + 3 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 3] >> 6)] & 1L << lst[cs[cc[2]] + 3]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 3] >> 6)] |= 1L << lst[cs[cc[2]] + 3]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 3]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 3])) >= 0))
                            && (cs[cc[2]] + 4 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 4] >> 6)] & 1L << lst[cs[cc[2]] + 4]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 4] >> 6)] |= 1L << lst[cs[cc[2]] + 4]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 4]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 4])) >= 0))
                            && (cs[cc[2]] + 5 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 5] >> 6)] & 1L << lst[cs[cc[2]] + 5]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 5] >> 6)] |= 1L << lst[cs[cc[2]] + 5]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 5]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 5])) >= 0))
                            && (cs[cc[2]] + 6 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 6] >> 6)] & 1L << lst[cs[cc[2]] + 6]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 6] >> 6)] |= 1L << lst[cs[cc[2]] + 6]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 6]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 6])) >= 0))
                            && (cs[cc[2]] + 7 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 7] >> 6)] & 1L << lst[cs[cc[2]] + 7]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 7] >> 6)] |= 1L << lst[cs[cc[2]] + 7]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 7]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 7])) >= 0))
                            && (cs[cc[2]] + 8 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 8] >> 6)] & 1L << lst[cs[cc[2]] + 8]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 8] >> 6)] |= 1L << lst[cs[cc[2]] + 8]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 8]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 8])) >= 0))
                            && (cs[cc[2]] + 9 >= cs[cc[2] + 1] || (seenA[cc[1] * 8 + (lst[cs[cc[2]] + 9] >> 6)] & 1L << lst[cs[cc[2]] + 9]) != 0 || ((seenA[cc[1] * 8 + (lst[cs[cc[2]] + 9] >> 6)] |= 1L << lst[cs[cc[2]] + 9]) != 0 && ((parent[cc[1] * n + lst[cs[cc[2]] + 9]] = cc[0]) | (queue[tail[0]++] = cc[1] * n + lst[cs[cc[2]] + 9])) >= 0))
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


