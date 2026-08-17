/*
 * @lc app=leetcode id=3288 lang=java
 *
 * [3288] Length of the Longest Increasing Path
 */

class Solution {
    fun maxPathLength(coordinates: Array<IntArray>, k: Int): Int = coordinates[k].let { p -> { pts: List<IntArray> -> pts.sortedWith(compareBy<IntArray>({ it[0] }, { -it[1] })).map { it[1] }.fold(mutableListOf<Int>()) { l, y -> l.apply { java.util.Collections.binarySearch(this, y).let { if (it < 0) (-(it + 1)).let { idx -> if (idx == size) add(y) else set(idx, y) } } } }.size }.let { lis -> lis(coordinates.filter { it[0] < p[0] && it[1] < p[1] }) + lis(coordinates.filter { it[0] > p[0] && it[1] > p[1] }) + 1 } }
}