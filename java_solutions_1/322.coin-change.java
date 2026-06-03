/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        return java.util.stream.Stream.of(0).map(_v -> new int[amount + 1]).peek(dp -> java.util.Arrays.fill(dp, amount + 1)).peek(dp -> dp[0] = 0).peek(dp -> java.util.stream.IntStream.rangeClosed(1, amount).forEach(i -> java.util.Arrays.stream(coins).filter(c -> c <= i).forEach(c -> dp[i] = Math.min(dp[i], dp[i - c] + 1)))).map(dp -> dp[amount] > amount ? -1 : dp[amount]).findFirst().get();
    }
}
// @lc code=end
