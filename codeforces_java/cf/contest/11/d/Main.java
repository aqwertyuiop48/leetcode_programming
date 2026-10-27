import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
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
                && new int[]{0, 0, 0} instanceof int[] cur
                && IntStream.range(0, nm[0]).allMatch(i -> (dp[(1 << i) * nm[0] + i] = 1) > 0)
                && new IntPredicate[1] instanceof IntPredicate[] inner
                && (inner[0] = y -> y == 0
                    || ((dp[(cur[0] | (y & -y)) * nm[0] + Integer.numberOfTrailingZeros(y)] += dp[cur[1]]) > 0 && inner[0].test(y & (y - 1)))) != null
                && new IntPredicate[1] instanceof IntPredicate[] outer
                && (outer[0] = x -> x == 0
                    || ((cur[1] = cur[0] * nm[0] + Integer.numberOfTrailingZeros(x)) >= 0
                        && (dp[cur[1]] == 0
                            || (((adj[Integer.numberOfTrailingZeros(x)] >> Integer.numberOfTrailingZeros(cur[0]) & 1) == 0 || Integer.bitCount(cur[0]) < 3 || (total[0] += dp[cur[1]]) > 0)
                                && inner[0].test(adj[Integer.numberOfTrailingZeros(x)] & ~cur[0] & ~((2 << Integer.numberOfTrailingZeros(cur[0])) - 1))))
                        && outer[0].test(x & (x - 1)))) != null
                && IntStream.range(1, 1 << nm[0]).allMatch(mask -> (cur[0] = mask) > 0 && outer[0].test(mask))
                ? total[0] / 2
                : 0L)));
    }
}


