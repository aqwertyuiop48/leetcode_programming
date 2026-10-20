import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && (Integer) t[0] instanceof Integer n
            && (Integer) t[1] instanceof Integer m
            && (Integer) (n * n) instanceof Integer nn
            && new long[n * 8] instanceof long[] adj
            && IntStream.range(0, m).allMatch(i ->
                (adj[(t[2 + 2 * i] - 1) * 8 + ((t[3 + 2 * i] - 1) >> 6)] |= 1L << (t[3 + 2 * i] - 1)) != 0
                && (adj[(t[3 + 2 * i] - 1) * 8 + ((t[2 + 2 * i] - 1) >> 6)] |= 1L << (t[2 + 2 * i] - 1)) != 0)
            && IntStream.range(0, n * 8).filter(i -> adj[i] != 0).toArray() instanceof int[] nz
            && new int[n + 1] instanceof int[] ws
            && IntStream.range(0, nz.length).allMatch(e -> ++ws[(nz[e] >> 3) + 1] > 0)
            && IntStream.range(0, n).allMatch(u -> (ws[u + 1] += ws[u]) >= 0)
            && new long[n * 16] instanceof long[] seen
            && IntStream.range(0, n).allMatch(u -> (seen[u * 8 + (u >> 6)] |= 1L << u) != 0)
            && (seen[(n - 1) >> 6] |= 1L << (n - 1)) != 0
            && new int[2 * nn] instanceof int[] parent
            && new int[2 * nn] instanceof int[] queue
            && (parent[n - 1] = -1) < 0
            && (queue[0] = n - 1) >= 0
            && new int[12] instanceof int[] v
            && (v[0] = -1) < 0
            && (v[8] = 1) > 0
            && new long[1] instanceof long[] mk
            && ((IntPredicate) s ->
                ++v[0] < v[8]
                && (seen[(n - 1) * 8] & 1L) == 0
                && (v[6] = queue[v[0]]) >= 0
                && (v[11] = v[6] < nn ? v[6] : v[6] - nn) >= 0
                && (v[9] = v[11] / n) >= 0
                && (v[10] = v[11] % n) >= 0
                && (v[1] = ws[v[6] < nn ? v[9] : v[10]]) >= 0
                && (v[2] = ws[(v[6] < nn ? v[9] : v[10]) + 1]) >= 0
                && (v[3] = v[6] < nn ? n * 8 + v[10] * 8 : v[9] * 8) >= 0
                && (v[4] = v[6] < nn ? nn + v[10] : v[9] * n) >= 0
                && (v[5] = v[6] < nn ? n : 1) > 0) instanceof IntPredicate adv
            && ((IntPredicate) s ->
                mk[0] != 0
                    ? (queue[v[8]++] = v[4] + (v[7] * 64 + Long.numberOfTrailingZeros(mk[0])) * v[5]) >= 0
                        && (parent[queue[v[8] - 1]] = v[6]) >= -1
                        && ((mk[0] &= mk[0] - 1) | 1) != 0
                    : v[1] < v[2]
                        ? (v[7] = nz[v[1]] & 7) >= 0
                            && ((mk[0] = adj[nz[v[1]++]] & ~seen[v[3] + v[7]]) | 1) != 0
                            && ((seen[v[3] + v[7]] |= mk[0]) | 1) != 0
                        : adv.test(s)) instanceof IntPredicate step
            && (IntStream.range(0, Integer.MAX_VALUE).allMatch(step) || true)
            ? (seen[(n - 1) * 8] & 1L) == 0
                ? "-1"
                : IntStream.iterate((n - 1) * n, c -> c != -1, c -> parent[c] >= 0 ? parent[parent[c]] : -1).toArray() instanceof int[] rev
                    ? (rev.length - 1) + "\n"
                        + IntStream.range(0, rev.length).mapToObj(k -> String.valueOf(rev[rev.length - 1 - k] / n + 1)).collect(Collectors.joining(" ")) + "\n"
                        + IntStream.range(0, rev.length).mapToObj(k -> String.valueOf(rev[rev.length - 1 - k] % n + 1)).collect(Collectors.joining(" "))
                    : "-1"
            : "-1");
    }
}
