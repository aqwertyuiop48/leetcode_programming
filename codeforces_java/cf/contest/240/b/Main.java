import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && Integer.valueOf(in[0]) instanceof Integer n && Integer.valueOf(in[1]) instanceof Integer a && Integer.valueOf(in[2]) instanceof Integer b
            && Arrays.stream(in, 3, 3 + n).toArray() instanceof int[] h && Integer.valueOf(Arrays.stream(h).sum()) instanceof Integer S
            && new int[n][2][S + 1] instanceof int[][][] dp
            && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(0, S).allMatch(j -> (dp[i][0][j] = 1000000000) > 0 && (dp[i][1][j] = 1000000000) > 0))
            && (dp[0][1][0] = 0) == 0 && (dp[0][0][h[0]] = 0) == 0
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(Math.min(h[i - 1], h[i])) instanceof Integer w
                && IntStream.rangeClosed(0, S).allMatch(j -> (dp[i][1][j] = Math.min(dp[i - 1][1][j], dp[i - 1][0][j] + w)) >= 0
                    && (j < h[i] || (dp[i][0][j] = Math.min(dp[i - 1][0][j - h[i]], dp[i - 1][1][j - h[i]] + w)) >= 0)))
            && Integer.valueOf(IntStream.rangeClosed(0, S).filter(j -> j <= a && S - j <= b).map(j -> Math.min(dp[n - 1][0][j], dp[n - 1][1][j])).min().orElse(1000000000)) instanceof Integer best
            ? best >= 1000000000 ? -1 : best : "");
    }
}
