import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && new long[n + 2] instanceof long[] dp && (dp[1] = t[1]) == t[1]
            && IntStream.rangeClosed(2, n).filter(i -> (dp[i] = Math.min(dp[i - 1] + t[1], (i & 1) == 0 ? dp[i / 2] + t[2] : dp[(i + 1) / 2] + t[2] + t[1])) >= 0).count() >= 0
            ? dp[n] : "");
    }
}
