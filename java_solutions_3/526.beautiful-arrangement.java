/*
 * @lc app=leetcode id=526 lang=java
 *
 * [526] Beautiful Arrangement
 */

class Solution {
    public int countArrangement(int n) {
        return new int[1 << n] instanceof int[] dp && (dp[0] = 1) == 1
            && java.util.stream.IntStream.range(0, 1 << n).peek(m -> java.util.stream.IntStream.rangeClosed(1, n)
                .filter(i -> (m >> (i - 1) & 1) == 0 && (i % (Integer.bitCount(m) + 1) == 0 || (Integer.bitCount(m) + 1) % i == 0))
                .forEach(i -> dp[m | 1 << (i - 1)] += dp[m])).allMatch(x -> true)
            ? dp[(1 << n) - 1] : 0;
    }
}
