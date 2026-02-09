/*
 * @lc app=leetcode id=56 lang=kotlin
 *
 * [56] Merge Intervals
 */

class Solution {fun merge(intervals: Array<IntArray>): Array<IntArray> = intervals.sortedBy { it[0] }.fold(mutableListOf<IntArray>()) { acc, interval -> if (acc.isNotEmpty() && acc.last()[1] >= interval[0]) acc.apply { acc[acc.lastIndex][1] = maxOf(acc.last()[1], interval[1]) } else acc.apply { add(interval) } }.toTypedArray()}

