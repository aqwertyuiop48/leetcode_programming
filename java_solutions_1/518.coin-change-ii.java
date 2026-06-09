/*
 * @lc app=leetcode id=518 lang=java
 *
 * [518] Coin Change II
 */

class Solution {
    public int change(int amount, int[] coins) {
        return java.util.stream.Stream.of(0).map(_v -> new int[amount + 1]).peek(dp -> dp[0] = 1).peek(dp -> java.util.Arrays.stream(coins).forEach(coin -> java.util.stream.IntStream.rangeClosed(coin, amount).forEach(i -> dp[i] += dp[i - coin]))).map(dp -> dp[amount]).findFirst().get();
    }
}
