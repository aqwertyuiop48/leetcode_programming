import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> it.next()).toArray()).toArray(int[][]::new) instanceof int[][] a
            && Long.valueOf(Long.MIN_VALUE / 4) instanceof Long NEG
            ? IntStream.rangeClosed(1, 2 * n - 2).boxed().reduce(IntStream.range(0, n).mapToObj(i -> LongStream.range(0, n).map(j -> i == 0 && j == 0 ? a[0][0] : NEG).toArray()).toArray(long[][]::new),
                (dp, d) -> IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToLong(j -> d - i >= 0 && d - i < n && d - j >= 0 && d - j < n
                    ? Long.valueOf(Math.max(Math.max(dp[i][j], i > 0 ? dp[i - 1][j] : NEG), Math.max(j > 0 ? dp[i][j - 1] : NEG, i > 0 && j > 0 ? dp[i - 1][j - 1] : NEG))) instanceof Long b && b > NEG / 2
                        ? b + a[i][d - i] + (i == j ? 0 : a[j][d - j]) : NEG
                    : NEG).toArray()).toArray(long[][]::new), (x, y) -> x)[n - 1][n - 1] : "");
    }
}
