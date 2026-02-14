/*
 * @lc app=leetcode id=474 lang=kotlin
 *
 * [474] Ones and Zeroes
 */

class Solution { fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int = strs.fold(Array(m + 1) { IntArray(n + 1) }) { dp, s -> s.count { it == '0' }.let { zeros -> s.count { it == '1' }.let { ones -> (m downTo zeros).forEach { i -> (n downTo ones).forEach { j -> dp[i][j] = maxOf(dp[i][j], dp[i - zeros][j - ones] + 1) } } } } .run{dp} }[m][n] }