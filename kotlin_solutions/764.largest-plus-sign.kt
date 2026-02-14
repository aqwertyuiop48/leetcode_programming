/*
 * @lc app=leetcode id=764 lang=kotlin
 *
 * [764] Largest Plus Sign
 */

class Solution {fun orderOfLargestPlusSign(n: Int, mines: Array<IntArray>) = Array(n) { IntArray(n) { n } }.apply { mines.forEach { this[it[0]][it[1]] = 0 } }.also { grid -> (0 until n).forEach { i -> listOf(0 to 1, n - 1 to -1).fold(0 to 0) { (left, right), (jStart, jDir) -> (0 until n).fold(left to right) { (l, r), idx -> (if (jDir == 1) idx else jStart - idx).let { j -> (if (grid[i][j] == 0) 0 else l + 1).also { grid[i][j] = minOf(grid[i][j], it) } to (if (grid[i][n - 1 - j] == 0) 0 else r + 1).also { grid[i][n - 1 - j] = minOf(grid[i][n - 1 - j], it) } } } }.run { listOf(0 to 1, n - 1 to -1).fold(0 to 0) { (up, down), (jStart, jDir) -> (0 until n).fold(up to down) { (u, d), idx -> (if (jDir == 1) idx else jStart - idx).let { j -> (if (grid[j][i] == 0) 0 else u + 1).also { grid[j][i] = minOf(grid[j][i], it) } to (if (grid[n - 1 - j][i] == 0) 0 else d + 1).also { grid[n - 1 - j][i] = minOf(grid[n - 1 - j][i], it) } } } } } } }.let { grid -> grid.maxOf { row -> row.maxOrNull() ?: 0 } }}

