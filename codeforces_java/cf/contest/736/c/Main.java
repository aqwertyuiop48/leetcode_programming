import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer k
            && new boolean[n][n] instanceof boolean[][] adj
            && IntStream.range(0, n - 1).allMatch(j -> Integer.valueOf(Integer.parseInt(tk[2 + 2 * j]) - 1) instanceof Integer a && Integer.valueOf(Integer.parseInt(tk[3 + 2 * j]) - 1) instanceof Integer b
                && (adj[a][b] = true) && (adj[b][a] = true))
            && new int[n] instanceof int[] q && new int[n] instanceof int[] pr && new int[]{1} instanceof int[] qt && (pr[0] = -1) < 0
            && IntStream.range(0, n).allMatch(qi -> IntStream.range(0, n).filter(u -> adj[q[qi]][u] && u != pr[q[qi]]).allMatch(u -> 0 * ((pr[u] = q[qi]) + (q[qt[0]++] = u)) == 0))
            && new long[n][2 * k + 2] instanceof long[][] dp
            && IntStream.range(0, n).allMatch(v -> (dp[v][0] = 1) + (dp[v][k + 1] = 1) == 2)
            && IntStream.iterate(n - 1, oi -> oi > 0, oi -> oi - 1).allMatch(oi -> Integer.valueOf(q[oi]) instanceof Integer v && Integer.valueOf(pr[v]) instanceof Integer p
                && new long[2 * k + 2] instanceof long[] nd
                && IntStream.range(0, 2 * k + 2).allMatch(i -> IntStream.range(0, 2 * k + 1).allMatch(j -> Integer.valueOf(i + j + 1 <= 2 * k + 1 ? Math.min(i, j + 1) : Math.max(i, j + 1)) instanceof Integer ni
                    && (nd[ni] = (nd[ni] + dp[p][i] * dp[v][j]) % 1000000007L) >= 0))
                && IntStream.range(0, 2 * k + 2).allMatch(i -> (dp[p][i] = nd[i]) >= 0))
            ? IntStream.rangeClosed(0, k).mapToLong(i -> dp[0][i]).sum() % 1000000007L : "");
    }
}
