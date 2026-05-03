/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

class Solution {
    public int coinChange(int[] coins, int amount) { return java.util.Optional.of(java.util.Arrays.stream(coins).boxed().reduce(java.util.stream.IntStream.rangeClosed(0, amount).map(i -> i == 0 ? 0 : amount + 1).toArray(), (dp, c) -> java.util.stream.IntStream.rangeClosed(c, amount).peek(i -> dp[i] = Math.min(dp[i], dp[i - c] + 1)).count() >= 0 ? dp : dp, (a, b) -> a)).map(dp -> dp[amount] > amount ? -1 : dp[amount]).get(); }
}
