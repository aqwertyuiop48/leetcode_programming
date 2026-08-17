/*
 * @lc app=leetcode id=2435 lang=kotlin
 *
 * [2435] Paths in Matrix Whose Sum Is Divisible by K
 */
class Solution { fun numberOfPaths(grid: Array<IntArray>, k: Int): Int = Array(grid[0].size) { IntArray(k) }.let { dp -> grid.indices.forEach { i -> IntArray(grid[0].size * k).let { nextRow -> grid[0].indices.forEach { j -> (0 until k).forEach { r -> nextRow[j * k + (r + grid[i][j]) % k] = ((if (i == 0 && j == 0) (if (r == 0) 1 else 0) else (if (i > 0) dp[j][r] else 0) + (if (j > 0) nextRow[(j - 1) * k + r] else 0)) % 1000000007) } } }.run { (0 until grid[0].size).forEach { j -> (0 until k).forEach { r -> dp[j][r] = it[j * k + r] } } } }.run { dp[grid[0].size - 1][0] } }