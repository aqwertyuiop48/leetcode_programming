/*
 * @lc app=leetcode id=3128 lang=kotlin
 *
 * [3128] Right Triangles
 */

class Solution {
    fun numberOfRightTriangles(grid: Array<IntArray>): Long = IntArray(grid.size) { r -> grid[r].sum() }.let { rC -> IntArray(grid[0].size) { c -> grid.sumOf { it[c] } }.let { cC -> grid.indices.sumOf { r -> grid[0].indices.filter { c -> grid[r][c] == 1 }.sumOf { c -> (rC[r] - 1).toLong() * (cC[c] - 1) } } } }
}