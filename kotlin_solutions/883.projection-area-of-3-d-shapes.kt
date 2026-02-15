/*
 * @lc app=leetcode id=883 lang=kotlin
 *
 * [883] Projection Area of 3D Shapes
 */

class Solution { fun projectionArea(grid: Array<IntArray>) = grid.sumOf { it.count { v -> v > 0 } } + grid.sumOf { it.max()!! } + grid[0].indices.sumOf { c -> grid.maxOf { it[c] } } }
