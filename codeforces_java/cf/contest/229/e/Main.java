import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> IntStream.range(0, it.next()).map(j -> it.next()).toArray()).toList() instanceof List<int[]> ps
            && ps.stream().flatMapToInt(Arrays::stream).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Integer> all
            && Integer.valueOf(all.get(n - 1)) instanceof Integer T
            && new double[1001][1001] instanceof double[][] C
            && IntStream.rangeClosed(0, 1000).allMatch(i -> (C[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = C[i - 1][j - 1] + C[i - 1][j]) >= 0))
            ? String.format("%.9f", ps.stream().reduce(IntStream.rangeClosed(0, n).mapToDouble(j -> j == 0 ? 1.0 : 0.0).toArray(),
                (dp, arr) -> Long.valueOf(Arrays.stream(arr).filter(x -> x > T).count()) instanceof Long g && Long.valueOf(Arrays.stream(arr).filter(x -> x == T).count()) instanceof Long e
                    ? IntStream.rangeClosed(0, n).mapToDouble(j -> IntStream.rangeClosed(0, Math.min(j, arr.length)).filter(c -> c >= g && c - g <= e).mapToDouble(c -> dp[j - c] * C[(int) (long) e][(int) (c - g)] / C[arr.length][c]).max().orElse(0.0)).toArray() : dp,
                (x, y) -> x)[n]) : "");
    }
}
