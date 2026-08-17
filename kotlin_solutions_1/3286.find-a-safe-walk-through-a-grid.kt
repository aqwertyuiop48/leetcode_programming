/*
 * @lc app=leetcode id=3286 lang=java
 *
 * [3286] Find a Safe Walk Through a Grid
 */
class Solution { fun findSafeWalk(grid: List<List<Int>>, health: Int): Boolean = java.util.PriorityQueue<IntArray>(compareBy { it[2] }).apply { add(intArrayOf(0, 0, grid[0][0])) }.let { pq -> Array(grid.size) { IntArray(grid[0].size) { 1000000 } }.apply { this[0][0] = grid[0][0] }.let { dists -> generateSequence { pq.poll() }.takeWhile { it != null }.any { curr -> curr[0].let { r -> curr[1].let { c -> curr[2].let { h -> if (h >= health) false else if (r == grid.size - 1 && c == grid[0].size - 1) true else listOf(0, 1, 0, -1, 0).windowed(2).forEach { d -> (r + d[0] to c + d[1]).let { (nr, nc) -> if (nr in grid.indices && nc in grid[0].indices && h + grid[nr][nc] < minOf(health, dists[nr][nc])) { run { dists[nr][nc] = h + grid[nr][nc] }.run { pq.add(intArrayOf(nr, nc, dists[nr][nc])) } } } }.run { false } } } } } } } }