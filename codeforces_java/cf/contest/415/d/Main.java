import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && new int[k][n + 1] instanceof int[][] dp && IntStream.rangeClosed(1, n).allMatch(d -> (dp[0][d] = 1) > 0)
            && IntStream.range(0, k - 1).allMatch(t -> IntStream.rangeClosed(1, n).allMatch(d -> IntStream.iterate(d, m -> m <= n, m -> m + d).allMatch(m -> (dp[t + 1][m] = (dp[t + 1][m] + dp[t][d]) % 1000000007) >= 0)))
            ? IntStream.rangeClosed(1, n).mapToLong(d -> dp[k - 1][d]).sum() % 1000000007 : "");
    }
}
