import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong()}).sorted(Comparator.comparingLong(p -> p[0])).toArray(long[][]::new) instanceof long[][] t
            && new long[n + 1] instanceof long[] a && new long[n + 1] instanceof long[] l && IntStream.range(0, n).allMatch(i -> (a[i + 1] = t[i][0]) >= 0 && (l[i + 1] = t[i][1]) > 0)
            && new long[2 * n + 1] instanceof long[] rv && (rv[0] = -4000000000000000000L) < 0 && IntStream.rangeClosed(1, n).allMatch(j -> (rv[2 * j - 1] = a[j]) >= 0 && (rv[2 * j] = a[j] + l[j]) > 0)
            && new long[n + 1][2 * n + 1] instanceof long[][] dp && IntStream.range(0, n + 1).allMatch(i -> IntStream.range(0, 2 * n + 1).allMatch(s -> (dp[i][s] = -1) < 0)) && (dp[0][0] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, 2 * n + 1).filter(s -> dp[i][s] >= 0).allMatch(s -> new long[]{-4000000000000000000L, 0} instanceof long[] pm
                && IntStream.rangeClosed(i + 1, n).allMatch(k -> IntStream.range(0, 2).filter(q -> (Long) (q == 0 ? a[k] - l[k] : a[k]) instanceof Long lk && (Long) (q == 0 ? a[k] : a[k] + l[k]) instanceof Long rk
                        && (Long) Math.max(pm[0], rk) instanceof Long mxv && (Integer) (pm[0] > rk ? (int) pm[1] : 2 * k - 1 + q) instanceof Integer mxs && (Integer) (rv[s] >= mxv ? s : mxs) instanceof Integer ns
                        && (dp[k][ns] = Math.max(dp[k][ns], dp[i][s] + Math.max(0, mxv - Math.max(lk, rv[s])))) >= 0).count() >= 0
                    && (a[k] + l[k] <= pm[0] || (pm[0] = a[k] + l[k]) > 0 && (pm[1] = 2 * k) > 0))))
            ? Arrays.stream(dp[n]).max().getAsLong() : "");
    }
}
