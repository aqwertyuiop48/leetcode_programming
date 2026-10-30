import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next().getBytes()).toArray(byte[][]::new) instanceof byte[][] g
            && new int[2][n + 2][n + 2] instanceof int[][][] dp
            && (dp[0][1][n] = g[0][0] == g[n - 1][m - 1] ? 1 : 0) >= 0
            && (Integer) ((n + m - 2) / 2) instanceof Integer tt
            && IntStream.range(0, tt).filter(t -> IntStream.rangeClosed(Math.max(0, t - m), Math.min(n - 1, t + 1)).filter(i ->
                dp[(t + 1) & 1][i + 1] instanceof int[] nr && dp[t & 1][i + 1] instanceof int[] o0 && dp[t & 1][i] instanceof int[] o1
                && (Integer) (t + 1 - i >= 0 && t + 1 - i < m ? (int) g[i][t + 1 - i] : -1) instanceof Integer ch
                && IntStream.rangeClosed(Math.max(i, n - 2 - t), Math.min(n - 1, n + m - 1 - t)).filter(j ->
                    (nr[j + 1] = (ch >= 0 && n + m - 3 - t - j >= 0 && n + m - 3 - t - j < m && g[j][n + m - 3 - t - j] == ch)
                        ? (int) ((0L + o0[j + 1] + o1[j + 1] + o0[j + 2] + o1[j + 2]) % 1000000007L) : 0) >= 0 || true).count() >= 0 || true).count() >= 0 || true).count() >= 0
            ? (int) (IntStream.range(0, n).mapToLong(i -> (long) dp[tt & 1][i + 1][i + 1] + ((n + m - 1) % 2 == 0 ? dp[tt & 1][i + 1][i + 2] : 0)).sum() % 1000000007L)
            : 0);
    }
}
