import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Arrays.stream(tk).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && Integer.valueOf(in[0]) instanceof Integer n && Integer.valueOf(in[1]) instanceof Integer m && Integer.valueOf(in[2]) instanceof Integer a && Integer.valueOf(in[3]) instanceof Integer b
            && new int[n + 1][n + 1] instanceof int[][] d && new boolean[n + 1][n + 1] instanceof boolean[][] adj
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000000) >= 0))
            && IntStream.range(0, m).allMatch(i -> (adj[in[4 + 2 * i]][in[5 + 2 * i]] = true) && (d[in[4 + 2 * i]][in[5 + 2 * i]] = Math.min(d[in[4 + 2 * i]][in[5 + 2 * i]], 1)) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(k -> IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, n).allMatch(j -> d[i][k] + d[k][j] >= d[i][j] || (d[i][j] = d[i][k] + d[k][j]) > 0)))
            && Integer.valueOf(in[4 + 2 * m]) instanceof Integer kk
            && IntStream.range(0, kk).filter(i -> d[in[5 + 2 * m + 2 * i]][in[6 + 2 * m + 2 * i]] < 1000000).mapToObj(i -> Integer.valueOf(in[5 + 2 * m + 2 * i]) instanceof Integer s && Integer.valueOf(in[6 + 2 * m + 2 * i]) instanceof Integer t
                ? IntStream.concat(IntStream.of(t), IntStream.rangeClosed(1, n).filter(v -> d[s][v] + d[v][t] == d[s][t]).boxed().sorted(Comparator.comparingInt((Integer v) -> d[v][t])).mapToInt(v -> IntStream.rangeClosed(1, n).filter(u -> d[s][u] + d[u][t] == d[s][t] && d[s][u] == d[s][v]).count() == 1 ? v : -v)).toArray() : null).toList() instanceof List<int[]> buses
            && new int[n + 1] instanceof int[] dp && IntStream.rangeClosed(1, n).allMatch(v -> (dp[v] = v == b ? 0 : 100000000) >= 0)
            && new boolean[]{true} instanceof boolean[] ch
            && IntStream.iterate(0, z -> ch[0], z -> z + 1).allMatch(z -> !(ch[0] = false) && buses.stream().allMatch(bus -> new int[n + 1] instanceof int[] g
                && IntStream.range(1, bus.length).allMatch(j -> Integer.valueOf(Math.abs(bus[j])) instanceof Integer v
                    && (v == bus[0] ? (g[v] = dp[v]) >= 0
                        : Integer.valueOf(IntStream.rangeClosed(1, n).filter(u -> adj[v][u] && d[u][bus[0]] == d[v][bus[0]] - 1).map(u -> g[u]).max().getAsInt()) instanceof Integer mx
                            && (bus[j] < 0 || mx + 1 >= dp[v] || (dp[v] = mx + 1) > 0 && (ch[0] = true))
                            && (g[v] = Math.min(dp[v], mx)) >= 0))))
            ? dp[a] >= 100000000 ? -1 : dp[a] : "");
    }
}
