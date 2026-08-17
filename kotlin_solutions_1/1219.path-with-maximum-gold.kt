/*
 * @lc app=leetcode id=1219 lang=kotlin
 *
 * [1219] Path with Maximum Gold
 */

class Solution { fun getMaximumGold(grid: Array<IntArray>): Int = DeepRecursiveFunction<Pair<Int, Int>, Int> { pair -> pair.first.let { row -> pair.second.let { column -> if (row !in grid.indices || column !in grid[0].indices || grid[row][column] == 0) 0 else grid[row][column].let { gold -> grid.also { it[row][column] = 0 }.let { gold + maxOf(callRecursive(row + 1 to column), callRecursive(row - 1 to column), callRecursive(row to column + 1), callRecursive(row to column - 1)).also { grid[row][column] = gold } } } } } }.let { search -> grid.indices.maxOf { row -> grid[0].indices.maxOf { column -> search.invoke(row to column) } } } }