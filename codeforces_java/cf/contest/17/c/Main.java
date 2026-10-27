import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextLine().trim())).ifPresent(n ->
            Optional.of(sc.nextLine().trim()).ifPresent(s ->
                System.out.println(
                    new StringBuilder() instanceof StringBuilder comp
                    && IntStream.range(0, s.length()).allMatch(i -> ((i == 0 || s.charAt(i) != s.charAt(i - 1)) && comp.append(s.charAt(i)) != null) || true)
                    && new int[]{comp.length(), n / 3 + 2} instanceof int[] kArr
                    && new long[4][kArr[1] + 1][kArr[1] + 1][kArr[1] + 1] instanceof long[][][][] dp
                    && (dp[3][0][0][0] = 1) >= 0
                    && IntStream.range(0, kArr[0]).allMatch(i ->
                        Integer.valueOf(comp.charAt(i) - 'a') instanceof Integer ch
                        && new long[kArr[1] + 1][kArr[1] + 1][kArr[1] + 1] instanceof long[][][] ns
                        && IntStream.rangeClosed(0, kArr[1]).allMatch(a -> IntStream.rangeClosed(0, kArr[1]).allMatch(b -> IntStream.rangeClosed(0, kArr[1]).allMatch(c ->
                            (ch == 0 ? a : ch == 1 ? b : c) >= kArr[1]
                            || (ns[a + (ch == 0 ? 1 : 0)][b + (ch == 1 ? 1 : 0)][c + (ch == 2 ? 1 : 0)] =
                                (dp[0][a][b][c] + dp[1][a][b][c] + dp[2][a][b][c] + dp[3][a][b][c] - dp[ch][a][b][c] + 51123987L) % 51123987L) >= Long.MIN_VALUE)))
                        && (dp[ch] = ns) != null)
                    && new long[n + 1][n + 1] instanceof long[][] C
                    && IntStream.rangeClosed(0, n).allMatch(i -> (C[i][0] = 1) >= 0 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + (j <= i - 1 ? C[i - 1][j] : 0)) % 51123987L) >= Long.MIN_VALUE))
                    && new long[]{0} instanceof long[] ansArr
                    && IntStream.rangeClosed(0, n).allMatch(totalA ->
                        IntStream.rangeClosed(0, n - totalA).allMatch(totalB ->
                            new int[]{n - totalA - totalB} instanceof int[] totalCArr
                            && (Math.abs(totalA - totalB) > 1 || Math.abs(totalA - totalCArr[0]) > 1 || Math.abs(totalB - totalCArr[0]) > 1
                                || totalA > kArr[1] || totalB > kArr[1] || totalCArr[0] > kArr[1]
                                ? true
                                : IntStream.rangeClosed(0, totalA).allMatch(a ->
                                    new long[]{a == 0 ? (totalA == 0 ? 1 : 0) : C[totalA - 1][a - 1]} instanceof long[] waysA
                                    && (waysA[0] == 0
                                        ? true
                                        : IntStream.rangeClosed(0, totalB).allMatch(b ->
                                            new long[]{b == 0 ? (totalB == 0 ? 1 : 0) : C[totalB - 1][b - 1]} instanceof long[] waysB
                                            && (waysB[0] == 0
                                                ? true
                                                : IntStream.rangeClosed(0, totalCArr[0]).allMatch(c ->
                                                    new long[]{c == 0 ? (totalCArr[0] == 0 ? 1 : 0) : C[totalCArr[0] - 1][c - 1]} instanceof long[] waysC
                                                    && (waysC[0] == 0 || (a == 0 && b == 0 && c == 0)
                                                        ? true
                                                        : (ansArr[0] = (ansArr[0] + (dp[0][a][b][c] + dp[1][a][b][c] + dp[2][a][b][c]) % 51123987L * waysA[0] % 51123987L * waysB[0] % 51123987L * waysC[0]) % 51123987L) >= Long.MIN_VALUE)))))))))
                    ? ansArr[0]
                    : 0L))));
    }
}





