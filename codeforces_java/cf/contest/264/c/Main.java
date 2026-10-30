import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] vals && new long[4] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (pr[3] = 1) > 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = pr[3] == 1 ? -pr[0] : pr[0]) != Long.MAX_VALUE && (pr[0] = 0) == 0 && (pr[2] = 0) == 0 && (pr[3] = 0) == 0))
            && Integer.valueOf((int) vals[0]) instanceof Integer n && Integer.valueOf((int) vals[1]) instanceof Integer q
            && Arrays.copyOfRange(vals, 2, 2 + n) instanceof long[] v
            && IntStream.range(0, n).map(i -> (int) vals[2 + n + i]).toArray() instanceof int[] c
            ? IntStream.range(0, q).mapToObj(qi -> Long.valueOf(vals[2 + 2 * n + 2 * qi]) instanceof Long a && Long.valueOf(vals[3 + 2 * n + 2 * qi]) instanceof Long b
                && new long[n + 1] instanceof long[] dp && IntStream.rangeClosed(0, n).allMatch(i -> (dp[i] = Long.MIN_VALUE / 4) < 0)
                && new long[]{0, Long.MIN_VALUE / 4, 0} instanceof long[] s
                && IntStream.range(0, n).allMatch(i -> (dp[c[i]] = Math.max(dp[c[i]], Math.max(dp[c[i]] + v[i] * a, (s[2] != c[i] ? s[0] : s[1]) + v[i] * b))) > Long.MIN_VALUE
                    && (dp[c[i]] <= s[0] && s[2] != c[i] ? dp[c[i]] <= s[1] || (s[1] = dp[c[i]]) > Long.MIN_VALUE
                        : dp[c[i]] <= s[0] || (s[2] == c[i] ? (s[0] = dp[c[i]]) > Long.MIN_VALUE : (s[1] = s[0]) > Long.MIN_VALUE && (s[0] = dp[c[i]]) > Long.MIN_VALUE && (s[2] = c[i]) > 0)))
                ? String.valueOf(s[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}
