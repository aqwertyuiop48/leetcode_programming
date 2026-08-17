/*
 * @lc app=leetcode id=1293 lang=kotlin
 *
 * [1293] Shortest Path in a Grid with Obstacles Elimination
 */

class Solution {
    fun shortestPath(grid: Array<IntArray>, k: Int): Int =
        Array(grid.size) { IntArray(grid[0].size) { -1 } }.let { vis ->
            vis[0][0] = k
            java.util.ArrayDeque<IntArray>().apply { add(intArrayOf(0, 0, k, 0)) }.let { q ->
                generateSequence { q.poll() }
                    .firstOrNull { (r, c, rem, d) ->
                        if (r == grid.size - 1 && c == grid[0].size - 1) true
                        else {
                            arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1).forEach { (dr, dc) ->
                                val nr = r + dr
                                val nc = c + dc
                                if (nr in grid.indices && nc in grid[0].indices && rem - grid[nr][nc] > vis[nr][nc]) {
                                    vis[nr][nc] = rem - grid[nr][nc]
                                    q.add(intArrayOf(nr, nc, rem - grid[nr][nc], d + 1))
                                }
                            }
                            false
                        }
                    }?.get(3) ?: -1
            }
        }
}