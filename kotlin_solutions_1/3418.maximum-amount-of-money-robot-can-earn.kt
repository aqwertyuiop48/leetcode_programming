/*
 * @lc app=leetcode id=3418 lang=kotlin
 *
 * [3418] Maximum Amount of Money Robot Can Earn
 */

class Solution {
    fun maximumAmount(coins: Array<IntArray>): Int = Array(coins.size) { Array(coins[0].size) { IntArray(3) { -1000000000 } } }.apply { this[0][0][0] = coins[0][0] }.apply { if (coins[0][0] < 0) this[0][0][1] = 0 }.also { dp -> coins.indices.forEach { i -> coins[0].indices.forEach { j -> (0..2).forEach { k -> if (i > 0 || j > 0) dp[i][j][k] = maxOf(if (i > 0) dp[i - 1][j][k] + coins[i][j] else -1000000000, if (j > 0) dp[i][j - 1][k] + coins[i][j] else -1000000000).let { v -> if (k > 0 && coins[i][j] < 0) maxOf(v, if (i > 0) dp[i - 1][j][k - 1] else -1000000000, if (j > 0) dp[i][j - 1][k - 1] else -1000000000) else v } } } } }.let { dp -> dp.last().last().maxOrNull()!! }
}