/*
 * @lc app=leetcode id=3301 lang=java
 *
 * [3301] Maximize the Total Height of Unique Towers
 */

class Solution {
    fun maximumTotalSum(maximumHeight: IntArray): Long = maximumHeight.sortedDescending().fold(longArrayOf(0L, 2000000000L)) { acc, h -> acc.apply { acc[1] = minOf(h.toLong(), acc[1] - 1).also { acc[0] += it } } }.let { if (it[1] <= 0) -1L else it[0] }
}