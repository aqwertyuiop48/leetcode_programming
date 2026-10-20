import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> a[i] - k * it.next()).toArray() instanceof int[] c
            && Integer.valueOf(100000) instanceof Integer off && new int[n + 1][2 * off + 1] instanceof int[][] dp
            && Arrays.stream(dp).allMatch(r -> IntStream.range(0, r.length).allMatch(s -> (r[s] = -1) < 0))
            && (dp[0][off] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, 2 * off + 1).allMatch(s -> (dp[i + 1][s] = Math.max(dp[i][s], s - c[i] >= 0 && s - c[i] <= 2 * off && dp[i][s - c[i]] >= 0 ? dp[i][s - c[i]] + a[i] : -1)) >= -1))
            ? dp[n][off] > 0 ? dp[n][off] : -1 : "");
    }
}
