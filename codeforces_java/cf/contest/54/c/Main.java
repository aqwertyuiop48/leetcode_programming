import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> r
                && new double[n + 1] instanceof double[] dp
                && (dp[0] = 1) == 1
                && ((LongUnaryOperator) x -> LongStream.iterate(1L, q -> q * 10).limit(19).map(q -> Math.max(0, Math.min(x, 2 * q - 1) - q + 1)).sum()) instanceof LongUnaryOperator f
                && r.stream().mapToDouble(rg -> (f.applyAsLong(rg[1]) - f.applyAsLong(rg[0] - 1)) / (double) (rg[1] - rg[0] + 1)).boxed()
                    .allMatch(p -> IntStream.iterate(n, j -> j >= 0, j -> j - 1).allMatch(j -> (dp[j] = dp[j] * (1 - p) + (j > 0 ? dp[j - 1] * p : 0)) >= 0))
                ? String.format(Locale.US, "%.15f", IntStream.rangeClosed((s.nextInt() * n + 99) / 100, n).mapToDouble(j -> dp[j]).sum())
                : "")));
    }
}


