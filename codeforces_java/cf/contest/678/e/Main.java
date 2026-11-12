import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Arrays.stream(t, 1, 1 + n * n).mapToDouble(Double::parseDouble).toArray() instanceof double[] p
            && Integer.valueOf((1 << n) - 1) instanceof Integer full
            && new double[(1 << n) * n] instanceof double[] dp
            && (dp[full * n] = 1) == 1
            && IntStream.range(1, n).allMatch(lv -> IntStream.range(1, full).parallel().filter(mask -> Integer.bitCount(mask) == n - lv && IntStream.range(0, n * n).filter(idx -> (mask >> idx / n & 1) == 1 && (mask >> idx % n & 1) == 0)
                .mapToDouble(idx -> dp[mask * n + idx / n] = Math.max(dp[mask * n + idx / n], p[idx] * dp[(mask | 1 << idx % n) * n + idx / n] + p[idx % n * n + idx / n] * dp[(mask | 1 << idx % n) * n + idx % n])
                ).sum() < 0).count() == 0)
            ? String.format(Locale.US, "%.15f", n == 1 ? 1.0 : IntStream.range(0, n * n).filter(idx -> idx / n < idx % n)
                .mapToDouble(idx -> p[idx] * dp[((1 << idx / n) | (1 << idx % n)) * n + idx / n] + p[idx % n * n + idx / n] * dp[((1 << idx / n) | (1 << idx % n)) * n + idx % n]).max().getAsDouble()) : "");
    }
}
