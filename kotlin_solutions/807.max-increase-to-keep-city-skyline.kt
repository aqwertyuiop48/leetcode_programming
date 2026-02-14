/*
 * @lc app=leetcode id=807 lang=kotlin
 *
 * [807] Max Increase to Keep City Skyline
 */

class Solution { fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int = (grid.map { it.max() } to grid[0].indices.map { j -> grid.maxOf { it[j] } }).let { (r, c) -> grid.indices.sumOf { i -> grid[i].indices.sumOf { j -> minOf(r[i], c[j]) - grid[i][j] } } }}
