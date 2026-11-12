
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && new long[n * n + 2] instanceof long[] pw && (pw[0] = 1) == 1 && IntStream.range(1, n * n + 2).allMatch(i -> (pw[i] = pw[i - 1] * 2 % 1000000007L) > 0)
            && new long[k + 2][n + 9] instanceof long[][] dp && (dp[0][0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(r -> new long[r + 8] instanceof long[] wr
                && IntStream.range(0, r).allMatch(i -> (wr[i] = pw[i * (r - i)] * ((pw[r - i] + 1000000006L) % 1000000007L) % 1000000007L) >= 0)
                && IntStream.range(0, Math.min(k, r)).allMatch(j -> dp[j] instanceof long[] d && (dp[j + 1][r] = IntStream.range(0, (r - j + 7) / 8).mapToLong(q -> (d[j + 8 * q + 0] * wr[j + 8 * q + 0] + d[j + 8 * q + 1] * wr[j + 8 * q + 1] + d[j + 8 * q + 2] * wr[j + 8 * q + 2] + d[j + 8 * q + 3] * wr[j + 8 * q + 3] + d[j + 8 * q + 4] * wr[j + 8 * q + 4] + d[j + 8 * q + 5] * wr[j + 8 * q + 5] + d[j + 8 * q + 6] * wr[j + 8 * q + 6] + d[j + 8 * q + 7] * wr[j + 8 * q + 7]) % 1000000007L).sum() % 1000000007L) >= 0))
            ? k <= n ? IntStream.rangeClosed(0, n).mapToLong(i -> dp[k][i] * pw[i * (n - i)] % 1000000007L).sum() % 1000000007L : 0 : 0);
    }
}



