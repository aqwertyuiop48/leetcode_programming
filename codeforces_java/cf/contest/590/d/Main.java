import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer k && (Long) sc.nextLong() instanceof Long s0
            && (Integer) (int) Math.min(s0, (long) k * (n - k)) instanceof Integer S && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] q
            && (Integer) 1000000000 instanceof Integer INF && IntStream.range(0, k + 1).mapToObj(j -> IntStream.range(0, S + 1).map(c -> j == 0 && c == 0 ? 0 : INF).toArray()).toArray(int[][]::new) instanceof int[][] dp
            && IntStream.range(0, n).filter(i -> IntStream.iterate(Math.min(i, k - 1), j -> j >= Math.max(0, k - n + i), j -> j - 1).filter(j -> IntStream.rangeClosed(0, S - (i - j))
                .filter(c -> dp[j][c] < INF && dp[j + 1][c + i - j] > dp[j][c] + q[i] && (dp[j + 1][c + i - j] = dp[j][c] + q[i]) > 0).count() >= 0).count() >= 0).count() >= 0
            ? Arrays.stream(dp[k]).min().getAsInt() : 0);
    }
}
