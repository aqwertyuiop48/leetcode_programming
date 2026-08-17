/*
 * @lc app=leetcode id=2944 lang=kotlin
 *
 * [2944] Minimum Number of Coins for Fruits
 */

class Solution {
    fun minimumCoins(prices: IntArray): Int = IntArray(prices.size + 1) { 200000000 }.also { dp -> dp[0] = 0 }.also { dp -> (1..prices.size).forEach { i -> (i..minOf(prices.size, i * 2)).forEach { j -> dp[j] = minOf(dp[j], dp[i - 1] + prices[i - 1]) } } }[prices.size]
}