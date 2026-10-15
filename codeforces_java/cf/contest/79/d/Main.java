import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer k
            && Integer.valueOf(t[2]) instanceof Integer l
            && new int[n + 2] instanceof int[] b
            && IntStream.range(0, k).allMatch(i -> (b[t[3 + i]] = 1) > 0)
            && IntStream.rangeClosed(1, n + 1).filter(i -> b[i] != b[i - 1]).toArray() instanceof int[] pts
            && Integer.valueOf(pts.length) instanceof Integer m
            && Arrays.copyOfRange(t, 3 + k, 3 + k + l) instanceof int[] xs
            && new int[m][m] instanceof int[][] dd
            && IntStream.range(0, m).allMatch(s -> new int[n + 2] instanceof int[] D
                && IntStream.range(0, n + 2).allMatch(i -> (D[i] = -1) < 0)
                && new int[n + 2] instanceof int[] qq
                && new int[]{1} instanceof int[] qn
                && (qq[0] = pts[s]) >= 0
                && (D[pts[s]] = 0) == 0
                && IntStream.iterate(0, i -> i < qn[0], i -> i + 1).allMatch(i -> Arrays.stream(xs).flatMap(x -> IntStream.of(qq[i] - x, qq[i] + x)).filter(v -> v >= 1 && v <= n + 1 && D[v] < 0)
                    .allMatch(v -> (D[v] = D[qq[i]] + 1) > 0 && (qq[qn[0]++] = v) > 0))
                && IntStream.range(0, m).allMatch(q -> (dd[s][q] = D[pts[q]] < 0 ? 1000000 : D[pts[q]]) >= 0))
            && new int[1 << m] instanceof int[] dp
            && IntStream.range(0, 1 << m).allMatch(x -> (dp[x] = 1000000000) > 0)
            && (dp[0] = 0) == 0
            && IntStream.range(0, (1 << m) - 1).allMatch(mask -> dp[mask] >= 1000000000 || Integer.valueOf(Integer.numberOfTrailingZeros(~mask)) instanceof Integer i0
                && IntStream.range(i0 + 1, m).filter(j -> (mask >> j & 1) == 0).allMatch(j -> (dp[mask | 1 << i0 | 1 << j] = Math.min(dp[mask | 1 << i0 | 1 << j], dp[mask] + dd[i0][j])) >= 0))
            ? (dp[(1 << m) - 1] >= 1000000 ? -1 : dp[(1 << m) - 1]) : 0);
    }
}

