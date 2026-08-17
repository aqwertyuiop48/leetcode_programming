/*
 * @lc app=leetcode id=1914 lang=kotlin
 *
 * [1914] Cyclically Rotating a Grid
 */

class Solution {
    fun rotateGrid(grid: Array<IntArray>, k: Int): Array<IntArray> = grid.also { _ -> (0 until minOf(grid.size, grid[0].size) / 2).forEach { layer -> ((layer until grid[0].size - 1 - layer).map { layer to it } + (layer until grid.size - 1 - layer).map { it to grid[0].size - 1 - layer } + (grid[0].size - 1 - layer downTo layer + 1).map { grid.size - 1 - layer to it } + (grid.size - 1 - layer downTo layer + 1).map { it to layer }).let { coords -> coords.map { grid[it.first][it.second] }.let { vals -> coords.forEachIndexed { idx, (r, c) -> grid[r][c] = vals[(idx + k) % coords.size] } } } } }
}