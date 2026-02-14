/*
 * @lc app=leetcode id=576 lang=kotlin
 *
 * [576] Out of Boundary Paths
 */

class Solution(val mem: Array<Array<LongArray>> = Array(51) { Array(51) { LongArray(51) { -1 } } }) { fun findPaths(m: Int, n: Int, maxMove: Int, r: Int, c: Int): Int = when { maxMove < 0 -> {0} r !in 0..<m || c !in 0..<n -> {1} mem[r][c][maxMove] != -1L -> {mem[r][c][maxMove].toInt()} else -> listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0).sumOf { (dx, dy) -> findPaths(m, n, maxMove - 1, r + dx, c + dy).toLong() }.mod(1000000007L).also { mem[r][c][maxMove] = it }.toInt() } }

