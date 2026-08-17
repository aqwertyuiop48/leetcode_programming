/*
 * @lc app=leetcode id=3393 lang=java
 *
 * [3393] Count Paths With the Given XOR Value
 */

fun countPathsWithXorValue(grid: Array<IntArray>, k: Int): Int = Array(grid.size) { Array(grid[0].size) { IntArray(16) } }.apply { this[0][0][grid[0][0]] = 1 }.also { dp -> grid.indices.forEach { r -> grid[0].indices.forEach { c -> (0..15).forEach { x -> if (dp[r][c][x] > 0) listOf(if (r + 1 < grid.size) dp[r + 1][c][x xor grid[r + 1][c]] = (dp[r + 1][c][x xor grid[r + 1][c]] + dp[r][c][x]) % 1000000007 else Unit, if (c + 1 < grid[0].size) dp[r][c + 1][x xor grid[r][c + 1]] = (dp[r][c + 1][x xor grid[r][c + 1]] + dp[r][c][x]) % 1000000007 else Unit) } } } }.let { it[grid.size - 1][grid[0].size - 1][k] }