/* @lc app=leetcode id=2428 lang=kotlin */
class Solution {
    fun maxSum(grid: Array<IntArray>): Int = (0 until grid.size - 2).maxOf { r -> (0 until grid[0].size - 2).maxOf { c -> grid[r][c] + grid[r][c + 1] + grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2] } }
}