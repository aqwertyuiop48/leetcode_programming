/*
 * @lc app=leetcode id=892 lang=kotlin
 *
 * [892] Surface Area of 3D Shapes
 */

class Solution { fun surfaceArea(grid: Array<IntArray>) = grid.indices.sumOf { i -> grid[0].indices.sumOf { j -> if (grid[i][j] == 0) 0 else 2 + grid[i][j] * 4 - (if (i > 0) 2 * minOf(grid[i][j], grid[i-1][j]) else 0) - (if (j > 0) 2 * minOf(grid[i][j], grid[i][j-1]) else 0) } } }
