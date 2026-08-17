/*
 * @lc app=leetcode id=1254 lang=kotlin
 *
 * [1254] Number of Closed Islands
 */

class Solution { fun closedIsland(grid: Array<IntArray>): Int = DeepRecursiveFunction<Pair<Int, Int>, Unit> { pair -> pair.first.let { row -> pair.second.let { column -> if (row in grid.indices && column in grid[0].indices && grid[row][column] == 0) grid.also { it[row][column] = 1 }.let { callRecursive(row + 1 to column).let { callRecursive(row - 1 to column).let { callRecursive(row to column + 1).let { callRecursive(row to column - 1) } } } } } } }.let { fill -> grid.indices.forEach { row -> grid[0].indices.forEach { column -> if (row == 0 || row == grid.lastIndex || column == 0 || column == grid[0].lastIndex) fill.invoke(row to column) } }.let { (1 until grid.lastIndex).sumOf { row -> (1 until grid[0].lastIndex).count { column -> (grid[row][column] == 0).also { if (it) fill.invoke(row to column) } } } } } }