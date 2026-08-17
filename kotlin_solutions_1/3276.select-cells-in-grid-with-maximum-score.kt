/*
 * @lc app=leetcode id=3276 lang=java
 *
 * [3276] Select Cells in Grid With Maximum Score
 */

class Solution {
    fun maxScore(grid: List<List<Int>>): Int = grid.flatMapIndexed { r, row -> row.map { it to r } }.groupBy({ it.first }, { it.second }).toList().sortedByDescending { it.first }.let { items -> mutableMapOf<Pair<Int, Int>, Int>().let { memo -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (idx, mask) -> if (idx == items.size) 0 else memo.getOrPut(idx to mask) { maxOf(callRecursive(idx + 1 to mask), items[idx].second.filter { (mask and (1 shl it)) == 0 }.maxOfOrNull { items[idx].first + callRecursive(idx + 1 to (mask or (1 shl it))) } ?: 0) } }(0 to 0) } }
}