/*
 * @lc app=leetcode id=695 lang=kotlin
 *
 * [695] Max Area of Island
 */

class Solution { fun maxAreaOfIsland(grid: Array<IntArray>): Int = grid.indices.maxOf { i -> grid[0].indices.maxOf { j -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (r, c) -> when { r !in grid.indices || c !in grid[0].indices || grid[r][c] == 0 ->{ 0} else -> run { grid[r][c] = 0 }.let { 1 + listOf(r-1 to c, r+1 to c, r to c-1, r to c+1).sumOf { callRecursive(it) } } } }(i to j) }} }