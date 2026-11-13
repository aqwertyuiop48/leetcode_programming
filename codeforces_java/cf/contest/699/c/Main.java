import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && new int[]{0, 0, 0} instanceof int[] dp
            && IntStream.range(0, n).filter(i -> Integer.valueOf(sc.nextInt()) instanceof Integer a && new int[]{Math.min(dp[0], Math.min(dp[1], dp[2])) + 1,
                (a & 1) != 0 ? Math.min(dp[0], dp[2]) : 1000, (a & 2) != 0 ? Math.min(dp[0], dp[1]) : 1000} instanceof int[] nd
                && (dp[0] = nd[0]) >= 0 && (dp[1] = nd[1]) >= 0 && (dp[2] = nd[2]) >= 0).count() >= 0
            ? Math.min(dp[0], Math.min(dp[1], dp[2])) : "");
    }
}
