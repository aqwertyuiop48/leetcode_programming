import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Long.valueOf(1000000007L) instanceof Long M && Integer.valueOf(m + 2) instanceof Integer w
            && new long[4][w * w] instanceof long[][] dp && new long[4][w * w] instanceof long[][] P
            && IntStream.rangeClosed(1, m).allMatch(l -> IntStream.rangeClosed(l, m).allMatch(r -> (dp[0][l * w + r] = 1) > 0))
            && ((ToLongFunction<int[]>) q -> q[1] > q[2] || q[3] > q[4] ? 0
                : (((P[q[0]][q[2] * w + q[4]] - P[q[0]][(q[1] - 1) * w + q[4]] - P[q[0]][q[2] * w + q[3] - 1] + P[q[0]][(q[1] - 1) * w + q[3] - 1]) % M) + M) % M) instanceof ToLongFunction<int[]> rc
            && ((BooleanSupplier) () -> IntStream.rangeClosed(0, 3).allMatch(s -> IntStream.rangeClosed(1, m).allMatch(l -> IntStream.rangeClosed(1, m).allMatch(r ->
                    (P[s][l * w + r] = (dp[s][l * w + r] + P[s][(l - 1) * w + r] + P[s][l * w + r - 1] - P[s][(l - 1) * w + r - 1] + M) % M) >= 0)))
                && IntStream.rangeClosed(0, 3).allMatch(t -> IntStream.rangeClosed(1, m).allMatch(l -> IntStream.rangeClosed(l, m).allMatch(r ->
                    (dp[t][l * w + r] = Arrays.stream(t / 2 == 0 ? new int[][]{{0, l, r}} : new int[][]{{0, 1, l - 1}, {1, 1, l}})
                        .mapToLong(la -> Arrays.stream(t % 2 == 0 ? new int[][]{{0, l, r}} : new int[][]{{0, r + 1, m}, {1, r, m}})
                            .mapToLong(rb -> rc.applyAsLong(new int[]{la[0] * 2 + rb[0], la[1], la[2], rb[1], rb[2]})).sum()).sum() % M) >= 0)))) instanceof BooleanSupplier step
            ? IntStream.rangeClosed(1, n).mapToLong(h -> (h == 1 || step.getAsBoolean()) ? (n - h + 1) * (Arrays.stream(dp).mapToLong(a -> Arrays.stream(a).sum() % M).sum() % M) % M : 0).sum() % M : "");
    }
}
