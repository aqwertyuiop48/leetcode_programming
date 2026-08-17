/*
 * @lc app=leetcode id=1091 lang=kotlin
 *
 * [1091] Shortest Path in Binary Matrix
 */

class Solution {
    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int = if (grid[0][0] != 0 || grid.last().last() != 0) -1 else grid.size.let { n -> kotlin.collections.ArrayDeque<Triple<Int, Int, Int>>().apply { add(Triple(0, 0, 1)) }.apply { grid[0][0] = 1 }.let { q -> generateSequence { q.removeFirstOrNull() }.firstOrNull { (r, c, d) -> if (r == n - 1 && c == n - 1) true else run { arrayOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 1, 1 to -1, 1 to 0, 1 to 1).forEach { (dr, dc) -> (r + dr to c + dc).let { (nr, nc) -> if (nr in 0 until n && nc in 0 until n && grid[nr][nc] == 0) grid[nr].set(nc, 1).run { q.add(Triple(nr, nc, d + 1)) } } }.run{false} } } }?.third ?: -1 } }
