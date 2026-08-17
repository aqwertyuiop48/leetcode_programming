/*
 * @lc app=leetcode id=980 lang=kotlin
 *
 * [980] Unique Paths III
 */

class Solution {
    fun uniquePathsIII(grid: Array<IntArray>): Int = (0 until grid.size).flatMap { r -> (0 until grid[0].size).map { c -> r to c } }.let { cells -> cells.first { (r, c) -> grid[r][c] == 1 }.let { (sr, sc) -> cells.count { (r, c) -> grid[r][c] == 0 }.let { emptyCount -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (r, c, remain) -> if (r !in grid.indices || c !in grid[0].indices || grid[r][c] < 0) 0 else if (grid[r][c] == 2) if (remain == 0) 1 else 0 else grid[r][c].let { temp -> Unit.also { grid[r][c] = -1 }.let { callRecursive(Triple(r + 1, c, remain - 1)) + callRecursive(Triple(r - 1, c, remain - 1)) + callRecursive(Triple(r, c + 1, remain - 1)) + callRecursive(Triple(r, c - 1, remain - 1)) }.also { grid[r][c] = temp } } }.invoke(Triple(sr, sc, emptyCount + 1)) } } }
}