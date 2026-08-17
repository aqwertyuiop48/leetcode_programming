/*
 * @lc app=leetcode id=3341 lang=java
 *
 * [3341] Find Minimum Time to Reach Last Room I
 */
class Solution {
    fun minTimeToReach(moveTime: Array<IntArray>): Int = java.util.PriorityQueue<IntArray>(compareBy { it[2] }).apply { add(intArrayOf(0, 0, 0)) }.let { pq -> Array(moveTime.size) { IntArray(moveTime[0].size) { Int.MAX_VALUE } }.also { it[0][0] = 0 }.let { dist -> generateSequence { pq.poll() }.filterNotNull().mapNotNull { curr -> if (curr[0] == moveTime.size - 1 && curr[1] == moveTime[0].size - 1) curr[2] else if (curr[2] > dist[curr[0]][curr[1]]) null else arrayOf(0 to 1, 0 to -1, 1 to 0, -1 to 0).mapNotNull { (dr, dc) -> (curr[0] + dr to curr[1] + dc).takeIf { (nr, nc) -> nr in moveTime.indices && nc in moveTime[0].indices }?.let { (nr, nc) -> (maxOf(curr[2], moveTime[nr][nc]) + 1).let { nt -> if (nt < dist[nr][nc]) run { dist[nr][nc] = nt }.run { pq.add(intArrayOf(nr, nc, nt)) } } } }.run { null } }.first() } }
}