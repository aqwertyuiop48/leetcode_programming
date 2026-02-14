/*
 * @lc app=leetcode id=435 lang=kotlin
 *
 * [435] Non-overlapping Intervals
 */

class Solution {fun eraseOverlapIntervals(intervals: Array<IntArray>): Int = intervals.sortedBy { it[1] }.fold(-50001 to 0) { (end, cnt), interval -> if (interval[0] >= end) interval[1] to cnt else end to cnt + 1 }.second}

