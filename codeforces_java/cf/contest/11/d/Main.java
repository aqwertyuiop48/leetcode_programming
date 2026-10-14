import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                new int[nm[0]] instanceof int[] adj
                && IntStream.range(0, nm[1]).allMatch(i ->
                    new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] uv
                    && (adj[uv[0]] |= (1 << uv[1])) >= 0
                    && (adj[uv[1]] |= (1 << uv[0])) >= 0)
                && new long[1 << nm[0]][nm[0]] instanceof long[][] dp
                && new long[]{0} instanceof long[] total
                && ((Function<Integer, Boolean>) (mask ->
                        new int[]{Integer.numberOfTrailingZeros(mask)} instanceof int[] sArr
                        && (mask == (1 << sArr[0]) ? (dp[mask][sArr[0]] = 1) >= 0 : true)
                        && IntStream.range(0, nm[0]).filter(v -> (mask & (1 << v)) != 0 && dp[mask][v] > 0).allMatch(v ->
                            IntStream.range(sArr[0], nm[0]).filter(u -> (adj[v] & (1 << u)) != 0).allMatch(u ->
                                (mask & (1 << u)) == 0
                                    ? (dp[mask | (1 << u)][u] += dp[mask][v]) >= 0
                                    : (u == sArr[0] && Integer.bitCount(mask) >= 3 ? (total[0] += dp[mask][v]) >= 0 : true))))) instanceof Function<Integer, Boolean> processMask
                && IntStream.range(1, 1 << nm[0]).allMatch(processMask::apply)
                ? total[0] / 2
                : 0L)));
    }
}
