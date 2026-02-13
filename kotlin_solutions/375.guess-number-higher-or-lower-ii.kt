/*
 * @lc app=leetcode id=375 lang=kotlin
 *
 * [375] Guess Number Higher or Lower II
 */

class Solution {fun getMoneyAmount(n: Int): Int = (1..n).fold(Array(n + 1) { IntArray(n + 1) }) { dp, len -> (1..n - len + 1).forEach { i -> dp[i][i + len - 1] = if (len == 1) 0 else (i until i + len).minOf { k -> k + maxOf(if (k - 1 >= i) dp[i][k - 1] else 0, if (k + 1 < i + len) dp[k + 1][i + len - 1] else 0) } }.run{dp} }[1][n]}
