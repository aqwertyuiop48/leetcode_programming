import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer b && (Integer) s.nextInt() instanceof Integer mod
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && new int[m + 1][b + 1] instanceof int[][] dp && (dp[0][0] = 1 % mod) >= 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> IntStream.rangeClosed(a[i], b).allMatch(k -> (dp[j + 1][k] = (dp[j + 1][k] + dp[j][k - a[i]]) % mod) >= 0)))
            ? IntStream.rangeClosed(0, b).mapToLong(k -> dp[m][k]).sum() % mod : 0);
    }
}
