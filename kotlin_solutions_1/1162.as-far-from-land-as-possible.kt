/*
 * @lc app=leetcode id=1162 lang=kotlin
 *
 * [1162] As Far from Land as Possible
 */

class Solution { fun maxDistance(grid: Array<IntArray>): Int = grid.indices.flatMap { r -> grid[0].indices.mapNotNull { c -> if (grid[r][c] == 1) r to c else null } }.let { lands -> if (lands.isEmpty() || lands.size == grid.size * grid.size) -1 else Array(grid.size) { r -> BooleanArray(grid.size) { c -> grid[r][c] == 1 } }.let { vis -> generateSequence(lands) { q -> q.flatMap { (r, c) -> listOf(r - 1 to c, r + 1 to c, r to c - 1, r to c + 1).filter { (nr, nc) -> nr in grid.indices && nc in grid[0].indices && !vis[nr][nc].also { if (!it) vis[nr][nc] = true } } }.takeIf { it.isNotEmpty() } }.count() - 1 } } }