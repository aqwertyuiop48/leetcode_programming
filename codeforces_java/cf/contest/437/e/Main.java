import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] p
            && (Long) IntStream.range(0, n).mapToLong(i -> p[i][0] * p[(i + 1) % n][1] - p[(i + 1) % n][0] * p[i][1]).sum() instanceof Long area
            && new long[n][n] instanceof long[][] dp && IntStream.range(0, n - 1).allMatch(i -> (dp[i][i + 1] = 1) > 0)
            && IntStream.rangeClosed(2, n - 1).allMatch(len -> IntStream.range(0, n - len).allMatch(i -> (Integer) (i + len) instanceof Integer j
                && (dp[i][j] = IntStream.range(i + 1, j).filter(k -> ((p[k][0] - p[i][0]) * (p[j][1] - p[i][1]) - (p[k][1] - p[i][1]) * (p[j][0] - p[i][0])) * Long.signum(area) > 0).mapToLong(k -> dp[i][k] * dp[k][j] % 1000000007L).sum() % 1000000007L) >= 0))
            ? dp[0][n - 1] : 0);
    }
}
