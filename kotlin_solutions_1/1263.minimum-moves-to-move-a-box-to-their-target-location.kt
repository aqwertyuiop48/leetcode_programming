/*
 * @lc app=leetcode id=1263 lang=kotlin
 *
 * [1263] Minimum Moves to Move a Box to Their Target Location
 */

class Solution {
    fun minPushBox(grid: Array<CharArray>): Int = grid.size.let { m -> grid[0].size.let { n -> grid.indices.flatMap { r -> grid[0].indices.map { c -> grid[r][c] to (r to c) } }.toMap().let { pos -> pos['S']!! to (pos['B']!! to pos['T']!!) }.let { (s, bt) -> bt.first.let { b -> bt.second.let { t -> java.util.PriorityQueue<IntArray>(compareBy { it[0] }).apply { add(intArrayOf(0, b.first, b.second, s.first, s.second)) }.let { pq -> mutableSetOf<Long>().let { vis -> generateSequence { if (pq.isNotEmpty()) pq.poll() else null }.firstNotNullOfOrNull { curr -> if (curr[1] == t.first && curr[2] == t.second) curr[0] else ((curr[1].toLong() shl 24) or (curr[2].toLong() shl 16) or (curr[3].toLong() shl 8) or curr[4].toLong()).takeIf { vis.add(it) }?.run { arrayOf(0 to 1, 1 to 0, 0 to -1, -1 to 0).forEach { (dr, dc) -> (curr[3] + dr to curr[4] + dc).let { (npR, npC) -> if (npR in 0 until m && npC in 0 until n && grid[npR][npC] != '#') if (npR == curr[1] && npC == curr[2]) (curr[1] + dr to curr[2] + dc).let { (nbR, nbC) -> if (nbR in 0 until m && nbC in 0 until n && grid[nbR][nbC] != '#') pq.add(intArrayOf(curr[0] + 1, nbR, nbC, npR, npC)) } else pq.add(intArrayOf(curr[0], curr[1], curr[2], npR, npC)) } } }.run { null } } ?: -1 } } } } } }
}}