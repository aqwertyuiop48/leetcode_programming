/*
 * @lc app=leetcode id=1851 lang=kotlin
 *
 * [1851] Minimum Interval to Include Each Query
 */
class Solution { fun minInterval(intervals: Array<IntArray>, queries: IntArray): IntArray = IntArray(queries.size).apply { queries.indices.map { i -> intArrayOf(queries[i], i) }.sortedBy { it[0] }.let { q -> intervals.sortedBy { it[0] }.let { sortedInvs -> java.util.PriorityQueue<IntArray>(compareBy { it[1] - it[0] }).let { pq -> intArrayOf(0).let { ptr -> q.forEach { x -> generateSequence { if (ptr[0] < sortedInvs.size && sortedInvs[ptr[0]][0] <= x[0]) sortedInvs[ptr[0]++] else null }.forEach { pq.add(it) }.run { generateSequence { if (pq.isNotEmpty() && pq.peek()[1] < x[0]) pq.poll() else null }.forEach {} }.run { this@apply[x[1]] = if (pq.isEmpty()) -1 else pq.peek()[1] - pq.peek()[0] + 1 } } } } } } }