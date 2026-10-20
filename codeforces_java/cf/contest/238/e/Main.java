import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) g0[0] instanceof Integer n
            && (Integer) g0[1] instanceof Integer m
            && (Integer) (g0[2] - 1) instanceof Integer a
            && (Integer) (g0[3] - 1) instanceof Integer b
            && (Integer) g0[4 + 2 * m] instanceof Integer k
            && new int[n][n] instanceof int[][] d
            && new boolean[n][n] instanceof boolean[][] adj
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000000) >= 0))
            && IntStream.range(0, m).allMatch(e -> (d[g0[4 + 2 * e] - 1][g0[5 + 2 * e] - 1] = 1) > 0 && (adj[g0[4 + 2 * e] - 1][g0[5 + 2 * e] - 1] = true))
            && IntStream.range(0, n).filter(c -> IntStream.range(0, n).filter(i -> IntStream.range(0, n).filter(j -> (d[i][j] = Math.min(d[i][j], d[i][c] + d[c][j])) < 0).count() > 0).count() > 0).count() == 0
            && new boolean[k][n] instanceof boolean[][] must
            && IntStream.range(0, k).allMatch(i -> IntStream.range(0, n).allMatch(v ->
                (must[i][v] = d[g0[5 + 2 * m + 2 * i] - 1][v] + d[v][g0[6 + 2 * m + 2 * i] - 1] == d[g0[5 + 2 * m + 2 * i] - 1][g0[6 + 2 * m + 2 * i] - 1]
                    && d[g0[5 + 2 * m + 2 * i] - 1][g0[6 + 2 * m + 2 * i] - 1] < 1000000
                    && IntStream.range(0, n).filter(w -> d[g0[5 + 2 * m + 2 * i] - 1][w] + d[w][g0[6 + 2 * m + 2 * i] - 1] == d[g0[5 + 2 * m + 2 * i] - 1][g0[6 + 2 * m + 2 * i] - 1]
                        && d[g0[5 + 2 * m + 2 * i] - 1][w] == d[g0[5 + 2 * m + 2 * i] - 1][v]).count() == 1) || true))
            && new int[n] instanceof int[] dp
            && IntStream.range(0, n).allMatch(v -> (dp[v] = v == b ? 0 : 1000000) >= 0)
            && new int[n] instanceof int[] mk
            && new int[n] instanceof int[] memo
            && new int[]{0, 0, 0} instanceof int[] st
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
            && fr.getAndSet(v -> mk[v] == st[0] ? memo[v]
                : (mk[v] = st[0]) >= 0
                    ? (memo[v] = Math.min(dp[v], IntStream.range(0, n).filter(u -> adj[v][u] && d[v][st[1]] == d[u][st[1]] + 1).map(u -> fr.get().applyAsInt(u)).max().orElse(1000000)))
                    : 0) == null
            && IntStream.iterate(0, r -> r + 1).anyMatch(r ->
                (st[2] = 0) == 0
                    && IntStream.range(0, k).map(i ->
                        (++st[0] > 0 & (st[1] = g0[6 + 2 * m + 2 * i] - 1) >= 0)
                            ? IntStream.range(0, n).filter(v -> must[i][v]).map(v ->
                                fr.get().applyAsInt(v) + 1 < dp[v] ? (dp[v] = fr.get().applyAsInt(v) + 1) * 0 + (st[2] = 1) : 0).sum()
                            : 0).sum() >= 0
                    && st[2] == 0)
            ? dp[a] >= 1000000 ? -1 : dp[a]
            : -2);
    }
}
