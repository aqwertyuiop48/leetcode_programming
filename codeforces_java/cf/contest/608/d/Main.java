import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && new int[n + 3] instanceof int[] c && new int[n + 3][n + 3] instanceof int[][] dp
            && IntStream.range(0, n).filter(i -> (c[i] = Integer.parseInt(t.nextToken())) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(len -> IntStream.range(0, n - len + 1).filter(l -> Integer.valueOf(l + len - 1) instanceof Integer r
                && (dp[l][r] = Math.min(dp[l + 1][r] + 1, Math.min(len >= 2 && c[l] == c[l + 1] ? 1 + dp[l + 2][r] : 1000000, IntStream.rangeClosed(l + 2, r).filter(k -> c[k] == c[l]).map(k -> dp[l + 1][k - 1] + dp[k + 1][r]).min().orElse(1000000)))) > 0).count() >= 0).count() >= 0
            ? dp[0][n - 1] : "");
    }
}
