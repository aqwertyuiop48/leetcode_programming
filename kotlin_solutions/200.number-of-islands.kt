/*
 * @lc app=leetcode id=200 lang=kotlin
 *
 * [200] Number of Islands
 */

class Solution { fun numIslands(grid: Array<CharArray>): Int = grid.indices.sumOf { i -> grid[i].indices.count { j -> grid[i][j] == '1' && mutableListOf(i to j).let { stack -> while (stack.isNotEmpty()) stack.removeLast().let { (r, c) -> if (r in grid.indices && c in grid[r].indices && grid[r][c] == '1') listOf(1 to 0, 0 to 1, -1 to 0, 0 to -1) .onEach { (dr, dc) -> stack += (r + dr to c + dc) } .also { grid[r][c] = '0' } } }.let { true } } } }
