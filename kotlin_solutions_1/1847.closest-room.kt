/*
 * @lc app=leetcode id=1847 lang=kotlin
 *
 * [1847] Closest Room
 */
class Solution { fun closestRoom(rooms: Array<IntArray>, queries: Array<IntArray>): IntArray = IntArray(queries.size).apply { queries.indices.map { i -> intArrayOf(queries[i][0], queries[i][1], i) }.sortedByDescending { it[1] }.let { q -> java.util.TreeSet<Int>().let { ts -> rooms.sortedByDescending { it[1] }.let { r -> intArrayOf(0).let { j -> q.forEach { x -> generateSequence { if (j[0] < r.size && r[j[0]][1] >= x[1]) r[j[0]++][0] else null }.forEach { ts.add(it) }.run { this@apply[x[2]] = listOfNotNull(ts.floor(x[0]), ts.ceiling(x[0])).minByOrNull { Math.abs(it - x[0]) } ?: -1 } } } } } } }