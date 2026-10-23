import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Long) s.nextLong() instanceof Long b
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), IntStream.range(0, s.nextInt()).map(j -> 1 << (s.nextInt() - 1)).reduce(0, (x, y) -> x | y)}).sorted(Comparator.comparingLong(f -> f[1])).toList() instanceof List<long[]> fr
            && new long[1 << m] instanceof long[] dp && IntStream.range(1, 1 << m).allMatch(i -> (dp[i] = Long.MAX_VALUE / 4) > 0)
            ? (Long) fr.stream().mapToLong(f -> IntStream.range(0, 1 << m).allMatch(mask -> (dp[mask | (int) f[2]] = Math.min(dp[mask | (int) f[2]], dp[mask] + f[0])) >= 0) ? dp[(1 << m) - 1] + f[1] * b : 0).min().getAsLong() instanceof Long r
                ? r >= Long.MAX_VALUE / 8 ? -1 : r : 0 : 0);
    }
}
