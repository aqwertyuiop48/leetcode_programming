import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                (new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                && new long[nm[0] + 1][nm[1] + 1] instanceof long[][] pre
                && new long[nm[0] + 1][nm[1] + 1] instanceof long[][] dp
                && IntStream.rangeClosed(1, nm[0]).allMatch(i ->
                    IntStream.rangeClosed(1, nm[1]).allMatch(j -> (pre[i][j] = pre[i][j - 1] + s.nextLong()) == pre[i][j]))
                && IntStream.rangeClosed(1, nm[1]).allMatch(j -> (dp[1][j] = pre[1][j]) == dp[1][j])
                && new long[]{-4000000000000L} instanceof long[] run
                && IntStream.rangeClosed(2, nm[0]).allMatch(i ->
                    (run[0] = -4000000000000L) == run[0]
                    && (i % 2 == 0
                        ? IntStream.range(0, nm[1]).allMatch(idx ->
                            (dp[i][nm[1] - idx] = pre[i][nm[1] - idx] + run[0]) == dp[i][nm[1] - idx]
                            && (run[0] = Math.max(run[0], dp[i - 1][nm[1] - idx])) == run[0])
                        : IntStream.range(1, nm[1] + 1).allMatch(j ->
                            (dp[i][j] = pre[i][j] + run[0]) == dp[i][j]
                            && (run[0] = Math.max(run[0], dp[i - 1][j])) == run[0])))
                && nm[0] >= 1)
                ? LongStream.rangeClosed(1, nm[1]).map(j -> dp[nm[0]][(int) j]).max().getAsLong()
                : 0L
            )
        );
    }
}
