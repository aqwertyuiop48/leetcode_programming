/*
 * @lc app=leetcode id=3402 lang=java
 *
 * [3402] Minimum Operations to Make Columns Strictly Increasing
 */

fun minimumOperations(grid: Array<IntArray>): Int = (0 until grid[0].size).sumOf { c -> (1 until grid.size).fold(0 to grid[0][c]) { (sum, last), r -> maxOf(last + 1, grid[r][c]).let { (sum + (it - grid[r][c])) to it } }.first }