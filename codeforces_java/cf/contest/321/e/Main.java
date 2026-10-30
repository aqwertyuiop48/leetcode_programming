import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] bs
            && Integer.valueOf(IntStream.range(0, bs.length).filter(i -> bs[i] == '\n').findFirst().getAsInt()) instanceof Integer nl
            && Arrays.stream(new String(bs, 0, nl).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nk
            && Integer.valueOf(nk[0]) instanceof Integer n && Integer.valueOf(nk[1]) instanceof Integer k && Integer.valueOf(n + 1) instanceof Integer w
            && new int[w * w] instanceof int[] ps && new int[] {w + 1, 0} instanceof int[] cur
            && IntStream.range(nl + 1, bs.length).allMatch(i -> bs[i] < 48 || bs[i] > 57
                || ((ps[cur[0]] = bs[i] - 48 + ps[cur[0] - w] + ps[cur[0] - 1] - ps[cur[0] - w - 1]) >= 0 && cur[0]++ >= 0 && (++cur[1] < n || ((cur[1] = 0) == 0 && (cur[0] += 1) > 0))))
            && new int[w] instanceof int[] dg && IntStream.range(0, w).allMatch(x -> (dg[x] = ps[x * w + x]) >= 0)
            && ((IntBinaryOperator) (l, r) -> (dg[r] - 2 * ps[r * w + l - 1] + dg[l - 1]) / 2) instanceof IntBinaryOperator cost
            && new int[k + 1][n + 2] instanceof int[][] dp && new int[k + 1][n + 2] instanceof int[][] opt
            && IntStream.rangeClosed(1, n).allMatch(i -> (dp[1][i] = cost.applyAsInt(1, i)) >= 0)
            && new int[6] instanceof int[] s && (s[0] = 2) == 2 && (s[1] = n) == n
            && ((IntPredicate) z -> (s[2] = Math.max(s[0] - 1, opt[s[0] - 1][s[1]])) >= 0
                && (s[3] = Math.max(s[2], Math.min(s[1] - 1, s[1] == n ? n - 1 : opt[s[0]][s[1] + 1]))) >= 0 && (s[5] = Integer.MAX_VALUE) > 0 && (s[4] = 0) == 0) instanceof IntPredicate init
            ? k == 1 ? String.valueOf(dp[1][n])
                : init.test(0) && IntStream.generate(() -> 0).anyMatch(z -> s[2] <= s[3]
                    ? (dp[s[0] - 1][s[2]] + cost.applyAsInt(s[2] + 1, s[1]) < s[5] ? (s[5] = dp[s[0] - 1][s[2]] + cost.applyAsInt(s[2] + 1, s[1])) >= 0 && (s[4] = s[2]) >= 0 : true) && ++s[2] < 0
                    : (dp[s[0]][s[1]] = s[5]) >= 0 && (opt[s[0]][s[1]] = s[4]) >= 0
                        && (--s[1] >= s[0] ? init.test(0) && false : (++s[0] > k || ((s[1] = n) == n && init.test(0) && false)))) ? String.valueOf(dp[k][n]) : "" : "");
    }
}
