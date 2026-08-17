/*
 * @lc app=leetcode id=1267 lang=kotlin
 *
 * [1267] Count Servers that Communicate
 */

class Solution {
    fun countServers(grid: Array<IntArray>): Int = IntArray(grid.size).let { r -> IntArray(grid[0].size).let { c -> grid.indices.forEach { i -> grid[0].indices.forEach { j -> if (grid[i][j] == 1) r[i]++.also { c[j]++ } } }.run { grid.indices.sumOf { i -> grid[0].indices.count { j -> grid[i][j] == 1 && (r[i] > 1 || c[j] > 1) } } } } }
}