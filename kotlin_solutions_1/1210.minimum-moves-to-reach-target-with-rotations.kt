/*
 * @lc app=leetcode id=1210 lang=kotlin
 *
 * [1210] Minimum Moves to Reach Target with Rotations
 */

class Solution {
    fun minimumMoves(grid: Array<IntArray>): Int = grid.size.let { n -> Array(n) { Array(n) { BooleanArray(2) } }.also { it[0][0][0] = true }.let { vis -> java.util.ArrayDeque<IntArray>().apply { add(intArrayOf(0, 0, 0, 0)) }.let { q -> generateSequence { if (q.isNotEmpty()) q.poll() else null }.onEach { (r, c, d, dist) -> listOfNotNull(if (d == 0 && c + 2 < n && grid[r][c + 2] == 0) intArrayOf(r, c + 1, 0) else null, if (d == 0 && r + 1 < n && grid[r + 1][c] == 0 && grid[r + 1][c + 1] == 0) intArrayOf(r + 1, c, 0) else null, if (d == 0 && r + 1 < n && grid[r + 1][c] == 0 && grid[r + 1][c + 1] == 0) intArrayOf(r, c, 1) else null, if (d == 1 && r + 2 < n && grid[r + 2][c] == 0) intArrayOf(r + 1, c, 1) else null, if (d == 1 && c + 1 < n && grid[r][c + 1] == 0 && grid[r + 1][c + 1] == 0) intArrayOf(r, c + 1, 1) else null, if (d == 1 && c + 1 < n && grid[r][c + 1] == 0 && grid[r + 1][c + 1] == 0) intArrayOf(r, c, 0) else null).forEach { (nr, nc, nd) -> if (!vis[nr][nc][nd]) (vis[nr][nc][nd] = true).run { q.add(intArrayOf(nr, nc, nd, dist + 1)) } } }.firstOrNull { (r, c, d) -> r == n - 1 && c == n - 2 && d == 0 }?.get(3) ?: -1 } } }
}