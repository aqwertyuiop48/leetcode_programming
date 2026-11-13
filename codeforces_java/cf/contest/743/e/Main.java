import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[i + 1]) - 1).toArray() instanceof int[] a
            && IntStream.range(0, 8).mapToObj(v -> IntStream.range(0, n).filter(i -> a[i] == v).toArray()).toArray(int[][]::new) instanceof int[][] occ
            && IntStream.range(0, 8).mapToObj(v -> IntStream.rangeClosed(0, n)
                .map(p -> (int) IntStream.of(occ[v]).filter(x -> x < p).count()).toArray()).toArray(int[][]::new) instanceof int[][] cnt
            && (IntUnaryOperator) (k -> IntStream.range(0, (n + 1) * 256).map(i -> i == 0 ? 0 : -1).toArray() instanceof int[] dp
                && IntStream.rangeClosed(0, n).filter(p -> IntStream.range(0, 256).filter(m -> dp[p * 256 + m] >= 0)
                    .filter(m -> (p == n || (dp[(p + 1) * 256 + m] = Math.max(dp[(p + 1) * 256 + m], dp[p * 256 + m])) >= 0)
                        && IntStream.range(0, 16)
                            .filter(x -> ((m >> (x >> 1)) & 1) == 0 && cnt[x >> 1][p] + k - 1 + (x & 1) < occ[x >> 1].length)
                            .filter(x -> (dp[(occ[x >> 1][cnt[x >> 1][p] + k - 1 + (x & 1)] + 1) * 256 + (m | (1 << (x >> 1)))]
                                = Math.max(dp[(occ[x >> 1][cnt[x >> 1][p] + k - 1 + (x & 1)] + 1) * 256 + (m | (1 << (x >> 1)))],
                                    dp[p * 256 + m] + (x & 1))) >= 0).count() >= 0).count() >= 0).count() >= 0
                && IntStream.rangeClosed(0, n).map(p -> dp[p * 256 + 255]).max().getAsInt() >= 0
                ? 8 * k + IntStream.rangeClosed(0, n).map(p -> dp[p * 256 + 255]).max().getAsInt() : -1) instanceof IntUnaryOperator f
            && new int[]{0, n / 8} instanceof int[] lh
            && IntStream.range(0, 12).filter(i -> lh[0] < lh[1]).filter(i -> f.applyAsInt((lh[0] + lh[1] + 1) / 2) >= 0
                ? (lh[0] = (lh[0] + lh[1] + 1) / 2) >= 0 : (lh[1] = (lh[0] + lh[1] + 1) / 2 - 1) >= 0).count() >= 0
            ? Math.max((int) IntStream.range(0, 8).filter(v -> occ[v].length > 0).count(), lh[0] >= 1 ? f.applyAsInt(lh[0]) : 0) : 0);
    }
}
