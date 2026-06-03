/*
 * @lc app=leetcode id=375 lang=java
 *
 * [375] Guess Number Higher or Lower II
 */

// @lc code=start
class Solution {
    public int getMoneyAmount(int n) {
        return java.util.stream.Stream.of(0).map(_v -> new int[n + 2][n + 2]).peek(dp -> java.util.stream.IntStream.rangeClosed(2, n).forEach(len -> java.util.stream.IntStream.rangeClosed(1, n - len + 1).forEach(i -> dp[i][i + len - 1] = java.util.stream.IntStream.rangeClosed(i, i + len - 1).map(k -> k + Math.max(dp[i][k - 1], dp[k + 1][i + len - 1])).min().getAsInt()))).map(dp -> dp[1][n]).findFirst().get();
    }
}
// @lc code=end
