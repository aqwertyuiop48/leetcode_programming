/*
 * @lc app=leetcode id=57 lang=kotlin
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution { fun insert(intervals1: Array<IntArray>, newInterval: IntArray): Array<IntArray> = (intervals1 + newInterval) .sortedBy { it[0] } .fold(mutableListOf<IntArray>()) { acc, curr -> acc.apply { if (isNotEmpty() && last()[1] >= curr[0]) { last()[1] = maxOf(last()[1], curr[1]) } else { add(curr) } } } .toTypedArray() }
// @lc code=end

