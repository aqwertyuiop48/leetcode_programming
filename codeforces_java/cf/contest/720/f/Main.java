import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf((int) Long.parseLong(tk.nextToken())) instanceof Integer k
            && new long[n + 1] instanceof long[] pre
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + Integer.parseInt(tk.nextToken())) > Long.MIN_VALUE)
            && IntStream.range(0, n).mapToObj(l -> IntStream.range(0, n).mapToObj(rho -> rho < l ? new long[0]
                : Long.valueOf(pre[rho + 1] - pre[l]) instanceof Long vl && IntStream.range(l, rho).mapToLong(r -> pre[r + 1] - pre[l]).sorted().toArray() instanceof long[] vals
                ? LongStream.concat(LongStream.of(0), IntStream.rangeClosed(1, rho - l + 1).mapToLong(c -> vl + IntStream.range(0, c - 1).mapToLong(i -> vals[vals.length - 1 - i]).sum())).toArray() : new long[0]).toArray(long[][]::new))
                .toArray(long[][][]::new) instanceof long[][][] best
            && new long[n + 1][k + 1] instanceof long[][] dp
            && IntStream.rangeClosed(0, n).allMatch(r -> Arrays.stream(new long[]{0}).peek(z -> Arrays.fill(dp[r], Long.MIN_VALUE / 4)).sum() == 0)
            && (dp[0][0] = 0) == 0
            && IntStream.range(0, n).allMatch(l -> new long[n + 1][k + 1] instanceof long[][] nd
                && IntStream.rangeClosed(0, n).allMatch(r -> Arrays.stream(new long[]{0}).peek(z -> Arrays.fill(nd[r], Long.MIN_VALUE / 4)).sum() == 0)
                && IntStream.rangeClosed(0, n).allMatch(r0 -> IntStream.rangeClosed(0, k).filter(cnt -> dp[r0][cnt] > Long.MIN_VALUE / 8).allMatch(cnt ->
                    (r0 - 1 < l || (nd[r0][cnt] = Math.max(nd[r0][cnt], dp[r0][cnt])) > Long.MIN_VALUE)
                    && IntStream.range(l, n).allMatch(rho -> Integer.valueOf(Math.max(r0 - 1, rho) + 1) instanceof Integer nr
                        && IntStream.rangeClosed(1, Math.min(rho - l + 1, k - cnt)).allMatch(c ->
                            (nd[nr][cnt + c] = Math.max(nd[nr][cnt + c], dp[r0][cnt] + best[l][rho][c])) > Long.MIN_VALUE)))
                    || true)
                && IntStream.rangeClosed(0, n).allMatch(r -> (dp[r] = nd[r]) != null)
                || true)
            ? String.valueOf(dp[n][k]) : "");
    }
}
