import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new double[n * n] instanceof double[] p
                && IntStream.range(0, n * n).allMatch(t -> (p[t] = s.nextDouble()) >= 0)
                && new double[1 << n] instanceof double[] dp
                && (dp[(1 << n) - 1] = 1.0) >= 0
                && IntStream.range(0, (1 << n) - 1).allMatch(x ->
                    (Integer) ((1 << n) - 1 - x) instanceof Integer m
                    && (dp[m] == 0 || Integer.bitCount(m) < 2
                        || (Double) (2.0 * dp[m] / (Integer.bitCount(m) * (Integer.bitCount(m) - 1))) instanceof Double w
                        && IntStream.iterate(m, r -> r != 0, r -> r & (r - 1)).allMatch(r ->
                            (Integer) Integer.numberOfTrailingZeros(r) instanceof Integer a
                            && IntStream.iterate(r & (r - 1), q -> q != 0, q -> q & (q - 1)).allMatch(q ->
                                (Integer) Integer.numberOfTrailingZeros(q) instanceof Integer b
                                && (dp[m ^ (1 << b)] += w * p[a * n + b]) >= 0
                                && (dp[m ^ (1 << a)] += w * p[b * n + a]) >= 0))))
                && new StringBuilder() instanceof StringBuilder sb
                && IntStream.range(0, n).allMatch(i -> (i > 0 ? sb.append(" ") : sb).append(String.format(Locale.ROOT, "%.6f", dp[1 << i])) != null)
                ? sb.toString()
                : "")));
    }
}

