import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m -> Optional.of(s.nextInt()).ifPresent(k ->
            System.out.println(
                new boolean[n][n] instanceof boolean[][] adj
                && new long[1 << n][1 << n] instanceof long[][] dp
                && IntStream.range(0, m).allMatch(e -> new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] p
                    && (adj[p[0]][p[1]] = adj[p[1]][p[0]] = true)
                    && (dp[(1 << p[0]) | (1 << p[1])][(1 << p[0]) | (1 << p[1])] = 1) == 1)
                && IntStream.range(0, 1 << n).allMatch(mask -> IntStream.range(0, 1 << n).filter(l -> dp[mask][l] > 0).allMatch(l ->
                    IntStream.range(0, n).filter(v -> ((mask >> v) & 1) == 0).allMatch(v ->
                        IntStream.range(0, n).filter(u -> ((mask >> u) & 1) == 1 && adj[u][v] && (l & ~(1 << u) & ((1 << v) - 1)) == 0)
                            .allMatch(u -> (dp[mask | (1 << v)][(l & ~(1 << u)) | (1 << v)] += dp[mask][l]) > 0))))
                ? IntStream.range(0, 1 << n).filter(l -> Integer.bitCount(l) == k).mapToLong(l -> dp[(1 << n) - 1][l]).sum()
                : 0L)))));
    }
}
