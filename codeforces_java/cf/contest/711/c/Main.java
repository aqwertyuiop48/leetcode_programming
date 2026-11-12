import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m && Integer.valueOf((int) t[2]) instanceof Integer k
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long INF && Integer.valueOf(k + 1) instanceof Integer K
            && new long[n + 1][(m + 1) * K] instanceof long[][] dp
            && Stream.of(0).peek(z -> Arrays.stream(dp).forEach(r -> Arrays.fill(r, INF))).findFirst().isPresent()
            && (dp[0][m * K] = 0) == 0
            && IntStream.rangeClosed(1, n).allMatch(i -> new long[K] instanceof long[] b1 && new long[K] instanceof long[] b2 && new int[K] instanceof int[] a1
                && Stream.of(0).peek(z -> Arrays.fill(b1, INF)).findFirst().isPresent() && Stream.of(0).peek(z -> Arrays.fill(b2, INF)).findFirst().isPresent()
                && IntStream.rangeClosed(0, m).filter(j -> IntStream.range(0, K).filter(b -> dp[i - 1][j * K + b] < b1[b] ? (b2[b] = b1[b]) >= 0 & (b1[b] = dp[i - 1][j * K + b]) >= 0 & (a1[b] = j) >= 0 : dp[i - 1][j * K + b] < b2[b] && (b2[b] = dp[i - 1][j * K + b]) >= 0).count() >= 0).count() >= 0
                && IntStream.range(0, m).filter(j -> Long.valueOf(t[3 + i - 1] == 0 ? t[3 + n + (i - 1) * m + j] : t[3 + i - 1] == j + 1 ? 0 : INF) instanceof Long cost
                    && cost < INF
                    && IntStream.rangeClosed(1, k).filter(b -> Long.valueOf(Math.min(dp[i - 1][j * K + b], a1[b - 1] == j ? b2[b - 1] : b1[b - 1])) instanceof Long pv
                        && (dp[i][j * K + b] = pv >= INF ? INF : pv + cost) >= 0).count() >= 0).count() >= 0)
            ? (Long.valueOf(IntStream.range(0, m).mapToLong(j -> dp[n][j * K + k]).min().getAsLong()) instanceof Long r ? (r >= INF ? (Object) (-1) : (Object) r) : "") : "");
    }
}
