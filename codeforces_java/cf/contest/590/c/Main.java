import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer m && (Integer) (m + 2) instanceof Integer W && (Integer) ((n + 2) * W) instanceof Integer N
            && IntStream.concat(IntStream.range(0, W).map(i -> -1), IntStream.range(0, n).mapToObj(i -> sc.next()).flatMapToInt(row -> IntStream.concat(IntStream.concat(IntStream.of(-1), row.chars().map(c -> c == '.' ? 0 : c == '#' ? -1 : c - '0')), IntStream.of(-1)))).toArray() instanceof int[] g0
            && IntStream.concat(IntStream.of(g0), IntStream.range(0, W).map(i -> -1)).toArray() instanceof int[] g
            && (Integer) (1 << 29) instanceof Integer INF
            && ((IntFunction<int[]>) s -> IntStream.range(0, N).map(i -> g[i] == s ? 0 : INF).toArray() instanceof int[] dist && new int[2][2 * N + 4] instanceof int[][] qq && new int[2] instanceof int[] cnt
                && new int[]{0, 0, 0} instanceof int[] stt
                && IntStream.range(0, N).filter(i -> g[i] == s && (qq[0][cnt[0]++] = i) >= 0).count() >= 0
                && ((IntUnaryOperator) w -> g[w] >= 0 && (Integer) (stt[1] + (g[w] == 0 ? 1 : 0)) instanceof Integer nd && nd < dist[w] && (dist[w] = nd) >= 0 && (qq[nd & 1][cnt[nd & 1]++] = w) >= 0 ? 0 : 0) instanceof IntUnaryOperator rel
                && IntStream.iterate(0, k -> stt[2] == 0, k -> k + 1).filter(k -> stt[0] < cnt[stt[1] & 1]
                    ? (Integer) qq[stt[1] & 1][stt[0]++] instanceof Integer u && (dist[u] != stt[1] || rel.applyAsInt(u + 1) + rel.applyAsInt(u - 1) + rel.applyAsInt(u + W) + rel.applyAsInt(u - W) >= 0)
                    : cnt[(stt[1] & 1) ^ 1] == 0 ? (stt[2] = 1) > 0 : (cnt[stt[1] & 1] = 0) + (stt[1]++) + (stt[0] = 0) >= 0).count() >= 0 ? dist : null) instanceof IntFunction<int[]> bfs
            && bfs.apply(1) instanceof int[] d1 && bfs.apply(2) instanceof int[] d2 && bfs.apply(3) instanceof int[] d3
            && IntStream.range(0, N).filter(i -> g[i] >= 0 && d1[i] < INF && d2[i] < INF && d3[i] < INF).map(i -> d1[i] + d2[i] + d3[i] - (g[i] == 0 ? 2 : 0)).min() instanceof OptionalInt res
            ? (res.isPresent() ? res.getAsInt() : -1) : 0);
    }
}
