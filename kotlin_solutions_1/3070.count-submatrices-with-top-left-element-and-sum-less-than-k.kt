/*
 * @lc app=leetcode id=3070 lang=kotlin
 *
 * [3070] Count Submatrices with Top-Left Element and Sum Less Than k
 */

class Solution { fun countSubmatrices(grid: Array<IntArray>, k: Int): Int = grid.indices.sumOf { r -> grid[0].indices.count { c -> (grid[r][c] + (if (r > 0) grid[r - 1][c] else 0) + (if (c > 0) grid[r][c - 1] else 0) - (if (r > 0 && c > 0) grid[r - 1][c - 1] else 0)).also { grid[r][c] = it } <= k } } }