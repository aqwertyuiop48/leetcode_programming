import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((nums[(int) st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Long.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf((int) nums[1]) instanceof Integer m
            && new long[n + 1][m + 1] instanceof long[][] pre
            && IntStream.rangeClosed(1, n).allMatch(i ->
                IntStream.rangeClosed(1, m).allMatch(j -> (pre[i][j] = pre[i][j - 1] + nums[2 + (i - 1) * m + (j - 1)]) == pre[i][j]))
            && new long[n + 1][m + 1] instanceof long[][] dp
            && IntStream.rangeClosed(1, m).allMatch(j -> (dp[1][j] = pre[1][j]) == dp[1][j])
            && new long[]{-4000000000000L} instanceof long[] run
            && IntStream.rangeClosed(2, n).allMatch(i ->
                (run[0] = -4000000000000L) == run[0]
                && (i % 2 == 0
                    ? IntStream.range(0, m).allMatch(idx ->
                        (dp[i][m - idx] = pre[i][m - idx] + run[0]) == dp[i][m - idx]
                        && (run[0] = Math.max(run[0], dp[i - 1][m - idx])) == run[0])
                    : IntStream.range(1, m + 1).allMatch(j ->
                        (dp[i][j] = pre[i][j] + run[0]) == dp[i][j]
                        && (run[0] = Math.max(run[0], dp[i - 1][j])) == run[0])))
            ? LongStream.rangeClosed(1, m).map(j -> dp[n][(int) j]).max().getAsLong()
            : 0L);
    }
}
