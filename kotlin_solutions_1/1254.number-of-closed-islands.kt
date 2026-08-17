/*
 * @lc app=leetcode id=1254 lang=kotlin
 *
 * [1254] Number of Closed Islands
 */

class Solution { fun closedIsland(grid: Array<IntArray>): Int = DeepRecursiveFunction<Pair<Int, Int>, Unit> { (r, c) -> if (r in grid.indices && c in grid[0].indices && grid[r][c] == 0) (grid[r][c] = 1).also { callRecursive(r + 1 to c) }.also { callRecursive(r - 1 to c) }.also { callRecursive(r to c + 1) }.also { callRecursive(r to c - 1) } }.let { dfs -> grid.indices.forEach { r -> grid[0].indices.forEach { c -> if (r == 0 || r == grid.lastIndex || c == 0 || c == grid[0].lastIndex) dfs(r to c) } }.let { (1 until grid.lastIndex).sumOf { r -> (1 until grid[0].lastIndex).count { c -> (grid[r][c] == 0).also { if (it) dfs(r to c) } } } } } }