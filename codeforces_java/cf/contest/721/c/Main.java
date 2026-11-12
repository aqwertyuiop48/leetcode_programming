import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m && Integer.valueOf(a[2]) instanceof Integer T
            && new int[][]{new int[n + 1], new int[n + 1]} instanceof int[][] dp
            && new short[n + 2][n + 1] instanceof short[][] par && new int[]{1} instanceof int[] best
            && IntStream.rangeClosed(0, n).allMatch(v -> (dp[1][v] = Integer.MAX_VALUE) > 0)
            && (dp[1][1] = 0) == 0
            && IntStream.range(1, n).allMatch(k -> new int[][]{dp[k & 1], dp[(k + 1) & 1]} instanceof int[][] cn
                && IntStream.rangeClosed(0, n).allMatch(v -> (cn[1][v] = Integer.MAX_VALUE) > 0)
                && IntStream.range(0, m).allMatch(e -> (cn[0][a[3 + 3 * e]] <= T && cn[0][a[3 + 3 * e]] + a[5 + 3 * e] <= T && cn[0][a[3 + 3 * e]] + a[5 + 3 * e] < cn[1][a[4 + 3 * e]]
                    && (cn[1][a[4 + 3 * e]] = cn[0][a[3 + 3 * e]] + a[5 + 3 * e]) > 0 && (par[k + 1][a[4 + 3 * e]] = (short) a[3 + 3 * e]) > 0) || true)
                && ((cn[1][n] <= T && (best[0] = k + 1) > 0) || true))
            && new int[best[0]] instanceof int[] p && (p[best[0] - 1] = n) > 0
            && IntStream.iterate(best[0] - 1, i -> i > 0, i -> i - 1).allMatch(i -> (p[i - 1] = par[i + 1][p[i]]) > 0)
            ? best[0] + "\n" + Arrays.stream(p).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
