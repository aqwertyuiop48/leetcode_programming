import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && new long[n * n + 2] instanceof long[] pw && (pw[0] = 1) == 1 && IntStream.range(1, n * n + 2).allMatch(i -> (pw[i] = pw[i - 1] * 2 % 1000000007L) > 0)
            && new long[n + 1][k + 2] instanceof long[][] dp && (dp[0][0] = 1) == 1
            && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(i + 1, n).allMatch(r -> (Long) (pw[i * (r - i)] * ((pw[r - i] + 1000000006L) % 1000000007L) % 1000000007L) instanceof Long w
                && IntStream.range(0, k).allMatch(j -> dp[i][j] == 0 || (dp[r][j + 1] = (dp[r][j + 1] + dp[i][j] * w) % 1000000007L) >= 0)))
            ? IntStream.rangeClosed(0, n).mapToLong(i -> k <= n ? dp[i][k] * pw[i * (n - i)] % 1000000007L : 0).sum() % 1000000007L : 0);
    }
}
