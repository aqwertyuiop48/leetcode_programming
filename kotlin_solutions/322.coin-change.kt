/*
 * @lc app=leetcode id=322 lang=kotlin
 *
 * [322] Coin Change
 */

class Solution {fun coinChange(coins: IntArray, amount: Int) = (1..amount).fold(IntArray(amount + 1) { if (it == 0) 0 else amount + 1 }) { dp, i -> coins.forEach { coin -> if (i >= coin) dp[i] = minOf(dp[i], dp[i - coin] + 1) }.let { dp } }[amount].let { if (it > amount) -1 else it }}