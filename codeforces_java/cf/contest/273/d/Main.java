import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(m + 2) instanceof Integer w
            && new long[4][w * w] instanceof long[][] dp && new long[4][w * w] instanceof long[][] P
            && IntStream.rangeClosed(1, m).allMatch(l -> IntStream.rangeClosed(l, m).allMatch(r -> (dp[0][l * w + r] = 1) > 0))
            && ((LongUnaryOperator) z -> P[(int) (z & 255)][(int) ((z >> 16) & 255) * w + (int) ((z >> 32) & 255)] - P[(int) (z & 255)][(int) ((z >> 8) & 255) * w + (int) ((z >> 32) & 255)]
                - P[(int) (z & 255)][(int) ((z >> 16) & 255) * w + (int) ((z >> 24) & 255)] + P[(int) (z & 255)][(int) ((z >> 8) & 255) * w + (int) ((z >> 24) & 255)]) instanceof LongUnaryOperator R
            && ((BooleanSupplier) () -> IntStream.rangeClosed(0, 3).allMatch(s -> IntStream.rangeClosed(1, m).allMatch(l -> IntStream.rangeClosed(1, m).allMatch(r ->
                    (P[s][l * w + r] = (dp[s][l * w + r] + P[s][(l - 1) * w + r] + P[s][l * w + r - 1] - P[s][(l - 1) * w + r - 1] + 1000000007L) % 1000000007L) >= 0)))
                && IntStream.rangeClosed(1, m).allMatch(l -> IntStream.rangeClosed(l, m).allMatch(r ->
                    ((dp[0][l * w + r] = (R.applyAsLong(0 + ((l - 1) << 8) + (r << 16) + ((long) (l - 1) << 24) + ((long) r << 32)) % 1000000007L + 1000000007L) % 1000000007L) >= 0)
                    && ((dp[1][l * w + r] = (R.applyAsLong(0 + ((l - 1) << 8) + (r << 16) + ((long) r << 24) + ((long) m << 32))
                        + R.applyAsLong(1 + ((l - 1) << 8) + (r << 16) + ((long) (r - 1) << 24) + ((long) m << 32)) + 4 * 1000000007L) % 1000000007L) >= 0)
                    && ((dp[2][l * w + r] = (R.applyAsLong(0 + (0 << 8) + ((l - 1) << 16) + ((long) (l - 1) << 24) + ((long) r << 32))
                        + R.applyAsLong(2 + (0 << 8) + (l << 16) + ((long) (l - 1) << 24) + ((long) r << 32)) + 4 * 1000000007L) % 1000000007L) >= 0)
                    && ((dp[3][l * w + r] = (R.applyAsLong(0 + (0 << 8) + ((l - 1) << 16) + ((long) r << 24) + ((long) m << 32))
                        + R.applyAsLong(1 + (0 << 8) + ((l - 1) << 16) + ((long) (r - 1) << 24) + ((long) m << 32))
                        + R.applyAsLong(2 + (0 << 8) + (l << 16) + ((long) r << 24) + ((long) m << 32))
                        + R.applyAsLong(3 + (0 << 8) + (l << 16) + ((long) (r - 1) << 24) + ((long) m << 32)) + 8 * 1000000007L) % 1000000007L) >= 0)))) instanceof BooleanSupplier step
            ? IntStream.rangeClosed(1, n).mapToLong(h -> (h == 1 || step.getAsBoolean()) ? (n - h + 1) * (Arrays.stream(dp).mapToLong(a -> Arrays.stream(a).sum() % 1000000007L).sum() % 1000000007L) % 1000000007L : 0).sum() % 1000000007L : "");
    }
}
