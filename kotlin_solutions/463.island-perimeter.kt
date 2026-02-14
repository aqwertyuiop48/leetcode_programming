/*
 * @lc app=leetcode id=463 lang=kotlin
 *
 * [463] Island Perimeter
 */

class Solution { fun islandPerimeter(grid: Array<IntArray>): Int = grid.flatMapIndexed { i, row -> row.mapIndexed { j, cell -> if (cell == 1) { 4 - listOf(i - 1 to j, i + 1 to j, i to j - 1, i to j + 1) .count { (r, c) -> r in grid.indices && c in row.indices && grid[r][c] == 1 } } else 0 } }.sum() }