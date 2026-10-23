import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer k
            && new int[k * k] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> ++cnt[(t[2].charAt(i) - 'a') * k + t[3].charAt(i) - 'a'] > 0)
            && new int[1 << k] instanceof int[] dp
            && new int[1 << k] instanceof int[] ch
            && IntStream.range(1, 1 << k).allMatch(m -> (dp[m] = -1) < 0)
            && IntStream.range(0, 1 << k).allMatch(m ->
                dp[m] < 0 || IntStream.range(0, k).allMatch(j ->
                    (m >> j & 1) == 1
                    || dp[m] + cnt[Integer.bitCount(m) * k + j] <= dp[m | 1 << j]
                    || ((dp[m | 1 << j] = dp[m] + cnt[Integer.bitCount(m) * k + j]) >= 0 && (ch[m | 1 << j] = j) >= 0)))
            && new char[k] instanceof char[] res
            && IntStream.iterate((1 << k) - 1, m -> m > 0, m -> m ^ (1 << ch[m])).allMatch(m -> (res[Integer.bitCount(m) - 1] = (char) ('a' + ch[m])) > 0)
            ? dp[(1 << k) - 1] + "\n" + new String(res)
            : "");
    }
}
