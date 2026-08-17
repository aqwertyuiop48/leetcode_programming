/*
 * @lc app=leetcode id=1368 lang=kotlin
 *
 * [1368] Minimum Cost to Make at Least One Valid Path in a Grid
 */

class Solution { fun minCost(grid: Array<IntArray>): Int = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0)).let { dirs -> Array(grid.size) { IntArray(grid[0].size) { Int.MAX_VALUE } }.also { dist -> dist[0][0] = 0 }.let { dist -> java.util.ArrayDeque<Pair<Int, Int>>().also { q -> q.add(0 to 0) }.let { q -> generateSequence { q.poll() }.forEach { (r, c) -> dirs.forEachIndexed { i, (dr, dc) -> (r + dr to c + dc).let { (nr, nc) -> if (nr in grid.indices && nc in grid[0].indices) (dist[r][c] + if (grid[r][c] == i + 1) 0 else 1).let { newCost -> if (newCost < dist[nr][nc]) newCost.also { dist[nr][nc] = it }.also { if (grid[r][c] == i + 1) q.addFirst(nr to nc) else q.addLast(nr to nc) } } } } }.run { dist[grid.size - 1][grid[0].size - 1] } } } }
}