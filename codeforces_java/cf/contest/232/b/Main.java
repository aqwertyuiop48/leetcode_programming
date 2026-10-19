import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Long.valueOf(sc.nextLong()) instanceof Long m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M
            && new long[n + 1][n + 1] instanceof long[][] C
            && IntStream.rangeClosed(0, n).allMatch(i -> (C[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % M) >= 0))
            && new java.util.function.LongBinaryOperator[1] instanceof java.util.function.LongBinaryOperator[] pw
            && (pw[0] = (b, e) -> LongStream.iterate(62, i -> i >= 0, i -> i - 1).reduce(1L, (r, i) -> (e >> i & 1) == 1 ? r * r % M * b % M : r * r % M)) != null
            && LongStream.rangeClosed(0, n).map(c -> pw[0].applyAsLong(C[n][(int) c], (m - 1) / n + 1)).toArray() instanceof long[] p1
            && LongStream.rangeClosed(0, n).map(c -> pw[0].applyAsLong(C[n][(int) c], (m - 1) / n)).toArray() instanceof long[] p2
            ? IntStream.range(0, n).boxed().reduce(IntStream.rangeClosed(0, k).mapToLong(s -> s == 0 ? 1 : 0).toArray(),
                (dp, i) -> IntStream.rangeClosed(0, k).mapToLong(s -> IntStream.rangeClosed(0, Math.min(n, s)).mapToLong(c -> dp[s - c] * ((i < m % n || m % n == 0 ? p1 : p2)[c]) % M).sum() % M).toArray(), (x, y) -> x)[k] : "");
    }
}
