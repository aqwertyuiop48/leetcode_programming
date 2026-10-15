import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                new int[nm[0]] instanceof int[] adj
                && IntStream.range(0, nm[1]).allMatch(i ->
                    new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] uv
                    && (adj[uv[0]] |= (1 << uv[1])) >= 0
                    && (adj[uv[1]] |= (1 << uv[0])) >= 0)
                && new long[(1 << nm[0]) * nm[0]] instanceof long[] dp
                && new long[]{0} instanceof long[] total
                && IntStream.range(1, 1 << nm[0]).allMatch(mask ->
                    (Integer) Integer.numberOfTrailingZeros(mask) instanceof Integer st
                    && (mask != 1 << st || (dp[mask * nm[0] + st] = 1) > 0)
                    && IntStream.iterate(mask, x -> x != 0, x -> x & (x - 1)).allMatch(x ->
                        (Integer) Integer.numberOfTrailingZeros(x) instanceof Integer v
                        && (dp[mask * nm[0] + v] == 0
                            || (((adj[v] >> st & 1) == 0 || Integer.bitCount(mask) < 3 || (total[0] += dp[mask * nm[0] + v]) > 0)
                                && IntStream.iterate(adj[v] & ~mask & ~((2 << st) - 1), y -> y != 0, y -> y & (y - 1)).allMatch(y ->
                                    (dp[(mask | (y & -y)) * nm[0] + Integer.numberOfTrailingZeros(y)] += dp[mask * nm[0] + v]) > 0)))))
                ? total[0] / 2
                : 0L)));
    }
}
