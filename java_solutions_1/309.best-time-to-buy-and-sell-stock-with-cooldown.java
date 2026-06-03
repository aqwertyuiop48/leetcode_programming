/*
 * @lc app=leetcode id=309 lang=java
 *
 * [309] Best Time to Buy and Sell Stock with Cooldown
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        return java.util.stream.Stream.of(0).map(_v -> java.util.stream.IntStream.range(0, prices.length).boxed().reduce(new int[]{-1000000, 0, 0}, (dp, i) -> new int[]{Math.max(dp[0], dp[2] - prices[i]), dp[0] + prices[i], Math.max(dp[2], dp[1])}, (a, b) -> b)).mapToInt(dp -> Math.max(dp[1], dp[2])).findFirst().getAsInt();
    }
}
// @lc code=end
