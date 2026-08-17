/*
 * @lc app=leetcode id=1547 lang=kotlin
 *
 * [1547] Minimum Cost to Cut a Stick
 */

class Solution { fun minCost(n: Int, cuts: IntArray): Int = (intArrayOf(0) + cuts.sortedArray() + intArrayOf(n)).let { c -> Array(c.size) { IntArray(c.size) }.also { dp -> (2 until c.size).forEach { len -> (0 until c.size - len).forEach { i -> (i + len).let { j -> dp[i][j] = c[j] - c[i] + (i + 1 until j).minOf { dp[i][it] + dp[it][j] } } } } }[0][c.size - 1] } }