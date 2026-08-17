/*
 * @lc app=leetcode id=3195 lang=kotlin
 *
 * [3195] Find the Minimum Area to Cover All Ones I
 */
class Solution { fun minimumArea(grid: Array<IntArray>): Int = grid.indices.flatMap { r -> grid[0].indices.filter { c -> grid[r][c] == 1 }.map { c -> r to c } }.let { ones -> (ones.maxOf { it.first } - ones.minOf { it.first } + 1) * (ones.maxOf { it.second } - ones.minOf { it.second } + 1) } }