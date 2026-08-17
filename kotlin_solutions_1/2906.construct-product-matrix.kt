/*
 * @lc app=leetcode id=2906 lang=kotlin
 *
 * [2906] Construct Product Matrix
 */

class Solution { fun constructProductMatrix(grid: Array<IntArray>): Array<IntArray> = Array(grid.size) { IntArray(grid[0].size) }.also { ans -> IntArray(1) { 1 }.also { p -> (0 until grid.size * grid[0].size).forEach { k -> (ans[k / grid[0].size][k % grid[0].size] = p[0]).also { p[0] = (p[0] * grid[k / grid[0].size][k % grid[0].size]) % 12345 } } }.also { p -> p[0] = 1 }.also { p -> (grid.size * grid[0].size - 1 downTo 0).forEach { k -> (ans[k / grid[0].size][k % grid[0].size] = (ans[k / grid[0].size][k % grid[0].size] * p[0]) % 12345).also { p[0] = (p[0] * grid[k / grid[0].size][k % grid[0].size]) % 12345 } } } } }