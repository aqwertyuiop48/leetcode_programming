/*
 * @lc app=leetcode id=1219 lang=kotlin
 *
 * [1219] Path with Maximum Gold
 */

class Solution {
    fun getMaximumGold(grid: Array<IntArray>): Int = DeepRecursiveFunction<Pair<Int, Int>, Int> { (r, c) -> if (r !in grid.indices || c !in grid[0].indices || grid[r][c] == 0) 0 else grid[r][c].let { v -> (grid[r][c] = 0).run { v + maxOf(callRecursive(r + 1 to c), callRecursive(r - 1 to c), callRecursive(r to c + 1), callRecursive(r to c - 1)) }.also { grid[r][c] = v } } }.let { dfs -> grid.indices.maxOf { r -> grid[0].indices.maxOf { c -> dfs(r to c) } } }
}