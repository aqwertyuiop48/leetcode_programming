import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextLine().trim())).ifPresent(n ->
            Optional.of(sc.nextLine().trim()).ifPresent(s ->
                System.out.println(
                    new StringBuilder() instanceof StringBuilder comp
                    && IntStream.range(0, s.length()).allMatch(i -> ((i == 0 || s.charAt(i) != s.charAt(i - 1)) && comp.append(s.charAt(i)) != null) || true)
                    && new int[]{comp.length()} instanceof int[] kArr
                    && new long[4][kArr[0] + 1][kArr[0] + 1][kArr[0] + 1] instanceof long[][][][] dp
                    && (dp[3][0][0][0] = 1) >= 0
                    && IntStream.range(0, kArr[0]).allMatch(i ->
                        new int[]{comp.charAt(i) - 'a'} instanceof int[] chArr
                        && new long[kArr[0] + 1][kArr[0] + 1][kArr[0] + 1] instanceof long[][][] newSlice
                        && IntStream.rangeClosed(0, kArr[0]).allMatch(a -> IntStream.rangeClosed(0, kArr[0] - a).allMatch(b -> IntStream.rangeClosed(0, kArr[0] - a - b).allMatch(c ->
                            new long[]{((dp[0][a][b][c] + dp[1][a][b][c] + dp[2][a][b][c] + dp[3][a][b][c]) - dp[chArr[0]][a][b][c]) % 51123987L} instanceof long[] val
                            && new int[]{a + (chArr[0] == 0 ? 1 : 0), b + (chArr[0] == 1 ? 1 : 0), c + (chArr[0] == 2 ? 1 : 0)} instanceof int[] nidx
                            && (nidx[0] > kArr[0] || nidx[1] > kArr[0] || nidx[2] > kArr[0] ? true : (newSlice[nidx[0]][nidx[1]][nidx[2]] = val[0]) >= Long.MIN_VALUE))))
                        && (dp[chArr[0]] = newSlice) != null)
                    && new long[n + 1][n + 1] instanceof long[][] C
                    && IntStream.rangeClosed(0, n).allMatch(i -> (C[i][0] = 1) >= 0 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + (j <= i - 1 ? C[i - 1][j] : 0)) % 51123987L) >= Long.MIN_VALUE))
                    && new long[]{0} instanceof long[] ansArr
                    && IntStream.rangeClosed(0, n).allMatch(totalA ->
                        IntStream.rangeClosed(0, n - totalA).allMatch(totalB ->
                            new int[]{n - totalA - totalB} instanceof int[] totalCArr
                            && new long[]{Math.abs(totalA - totalB), Math.abs(totalA - totalCArr[0]), Math.abs(totalB - totalCArr[0])} instanceof long[] diffs
                            && (diffs[0] > 1 || diffs[1] > 1 || diffs[2] > 1
                                ? true
                                : IntStream.rangeClosed(0, Math.min(kArr[0], totalA == 0 ? 0 : totalA)).allMatch(a ->
                                    new long[]{a == 0 ? (totalA == 0 ? 1 : 0) : (totalA >= 1 && a - 1 <= totalA - 1 ? C[totalA - 1][a - 1] : 0)} instanceof long[] waysA
                                    && (waysA[0] == 0 && !(a == 0 && totalA == 0)
                                        ? true
                                        : IntStream.rangeClosed(0, kArr[0] - a).allMatch(b ->
                                            new long[]{b == 0 ? (totalB == 0 ? 1 : 0) : (totalB >= 1 ? C[totalB - 1][b - 1] : 0)} instanceof long[] waysB
                                            && (waysB[0] == 0 && !(b == 0 && totalB == 0)
                                                ? true
                                                : IntStream.rangeClosed(0, kArr[0] - a - b).allMatch(c ->
                                                    new long[]{c == 0 ? (totalCArr[0] == 0 ? 1 : 0) : (totalCArr[0] >= 1 ? C[totalCArr[0] - 1][c - 1] : 0)} instanceof long[] waysC
                                                    && (waysC[0] == 0 && !(c == 0 && totalCArr[0] == 0)
                                                        ? true
                                                        : (a == 0 && b == 0 && c == 0)
                                                            ? true
                                                            : new long[]{(dp[0][a][b][c] + dp[1][a][b][c] + dp[2][a][b][c]) % 51123987L} instanceof long[] patterns
                                                                && (patterns[0] == 0
                                                                    ? true
                                                                    : (ansArr[0] = (ansArr[0] + patterns[0] * waysA[0] % 51123987L * waysB[0] % 51123987L * waysC[0]) % 51123987L) >= Long.MIN_VALUE))))))))))
                    ? ansArr[0]
                    : 0L))));
    }
}

