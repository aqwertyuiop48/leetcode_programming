import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && new long[100002] instanceof long[] cnt
            && IntStream.range(0, tk[0]).allMatch(i -> ++cnt[tk[1 + i]] > 0)
            && new long[100002] instanceof long[] dp
            && IntStream.rangeClosed(1, 100000).allMatch(v -> (dp[v] = Math.max(dp[v - 1], (v >= 2 ? dp[v - 2] : 0) + cnt[v] * v)) >= 0)
            ? dp[100000] : "");
    }
}
