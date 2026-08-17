/*
 * @lc app=leetcode id=3363 lang=java
 *
 * [3363] Find the Maximum Number of Fruits Collected
 */
class Solution {
    fun maxCollectedFruits(grid: Array<IntArray>): Int = grid.size.let { n -> (0 until n).sumOf { grid[it][it] } + arrayOf(true, false).sumOf { isTop -> Array(n) { IntArray(n) { -1 } }.apply { this[0][n - 1] = grid[0][n - 1] }.let { dp -> (1 until n - 1).forEach { i -> (maxOf(i + 1, n - 1 - i)..n - 1).forEach { j -> arrayOf(-1, 0, 1).map { dj -> if (isTop) dp[i - 1][j + dj] else dp[i - 1][j + dj] }.filter { it != -1 }.maxOrNull()?.let { prev -> dp[i][j] = prev + (if (isTop) grid[i][j] else grid[j][i]) } } }.run { dp[n - 2][n - 1] } } }
}