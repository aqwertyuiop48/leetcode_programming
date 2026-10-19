import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(it.nextInt()) instanceof Integer p
            && new double[n + 1][p + 1] instanceof double[][] dp && (dp[0][0] = 1) == 1
            && Arrays.stream(a).allMatch(x -> IntStream.iterate(n - 1, j -> j >= 0, j -> j - 1).allMatch(j -> IntStream.iterate(p - x, s -> s >= 0, s -> s - 1).allMatch(s -> (dp[j + 1][s + x] += dp[j][s]) >= 0)))
            ? String.format("%.10f", IntStream.rangeClosed(1, n).mapToDouble(k -> Arrays.stream(dp[k]).sum() / IntStream.rangeClosed(1, k).mapToDouble(i -> (double) (n - k + i) / i).reduce(1, (x, y) -> x * y)).sum()) : "");
    }
}
