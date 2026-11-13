import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long c
            && new long[][]{new long[n + 2], new long[n + 2]} instanceof long[][] dp
            && IntStream.range(0, n + 2).allMatch(j -> (dp[0][j] = j == 0 ? 0 : Long.MAX_VALUE / 4) >= 0 && (dp[1][j] = Long.MAX_VALUE / 4) > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> new long[][]{dp[(i - 1) & 1], dp[i & 1]} instanceof long[][] cn
                && IntStream.rangeClosed(0, i).filter(j -> (cn[1][j] = Math.min(cn[0][j] + t[1 + i] + c * j, j > 0 ? cn[0][j - 1] + t[1 + n + i] : Long.MAX_VALUE / 4)) < 0).count() == 0)
            ? Arrays.stream(dp[n & 1], 0, n + 1).min().getAsLong() : "");
    }
}
