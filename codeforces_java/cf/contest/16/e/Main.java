import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new double[n][n] instanceof double[][] p
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (p[i][j] = s.nextDouble()) >= 0))
                && new int[]{(1 << n) - 1} instanceof int[] fullArr
                && new double[1 << n] instanceof double[] dp
                && (dp[fullArr[0]] = 1.0) >= 0
                && IntStream.rangeClosed(1, fullArr[0]).allMatch(x ->
                    new int[]{fullArr[0] - x + 1} instanceof int[] mArr
                    && (dp[mArr[0]] == 0
                        || IntStream.range(0, n).filter(ii -> (mArr[0] & (1 << ii)) != 0).toArray() instanceof int[] alive
                        && (alive.length == 1
                            || new double[]{2.0 / (alive.length * (alive.length - 1))} instanceof double[] pp
                            && IntStream.range(0, alive.length).allMatch(a ->
                                IntStream.range(a + 1, alive.length).allMatch(b ->
                                    (dp[mArr[0] & ~(1 << alive[b])] += dp[mArr[0]] * pp[0] * p[alive[a]][alive[b]]) >= 0
                                    && (dp[mArr[0] & ~(1 << alive[a])] += dp[mArr[0]] * pp[0] * p[alive[b]][alive[a]]) >= 0)))))
                && new StringBuilder() instanceof StringBuilder sb
                && IntStream.range(0, n).allMatch(i -> (i > 0 ? sb.append(" ") : sb).append(String.format("%.6f", dp[1 << i])) != null)
                ? sb.toString()
                : "")));
    }
}




