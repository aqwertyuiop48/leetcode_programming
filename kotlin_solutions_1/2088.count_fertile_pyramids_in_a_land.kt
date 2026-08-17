/*
 * @lc app=leetcode id=2088 lang=kotlin
 *
 * [2088] Count Fertile Pyramids in a Land
 */

class Solution {
    fun countPyramids(grid: Array<IntArray>): Int = listOf(Array(grid.size) { grid[it].clone() }, Array(grid.size) { grid[grid.size - 1 - it].clone() }).sumOf { g -> (1 until g.size).sumOf { i -> IntArray(1).let { rowSeq -> (0 until g[i].size).sumOf { j -> (if (g[i][j] == 0) 0.also { rowSeq.set(0, 0) } else g[i][j].also { rowSeq.set(0, rowSeq[0] + 1) }).let { if (it == 0 || j == 0) g[i][j] else minOf(g[i - 1][j - 1] + 1, (rowSeq[0] + 1) / 2) }.also { g[i].set(j, it) }.let { maxOf(0, it - 1) } } } } }
}