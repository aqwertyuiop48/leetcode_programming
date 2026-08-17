/*
 * @lc app=leetcode id=1463 lang=kotlin
 *
 * [1463] Cherry Pickup II
 */

class Solution {
    fun cherryPickup(grid: Array<IntArray>): Int = Array(grid.size) { Array(grid[0].size) { IntArray(grid[0].size) { -1 } } }.let { dp -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (r, c1, c2) -> if (r == grid.size) 0 else dp[r][c1][c2].takeIf { it != -1 } ?: (grid[r][c1] + (if (c1 == c2) 0 else grid[r][c2]) + ((-1..1).flatMap { d1 -> (-1..1).map { d2 -> c1 + d1 to c2 + d2 } }.filter { (nc1, nc2) -> nc1 in grid[0].indices && nc2 in grid[0].indices }.maxOfOrNull { (nc1, nc2) -> callRecursive(Triple(r + 1, nc1, nc2)) } ?: 0)).also { dp[r][c1][c2] = it } }.invoke(Triple(0, 0, grid[0].size - 1)) }
}