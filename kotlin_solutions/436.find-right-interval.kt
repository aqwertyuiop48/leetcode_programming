/*
 * @lc app=leetcode id=436 lang=kotlin
 *
 * [436] Find Right Interval
 */

class Solution {fun findRightInterval(intervals: Array<IntArray>): IntArray = intervals.mapIndexed { i, it -> it[0] to i }.sortedBy { it.first }.let { sorted -> intervals.map { interval -> sorted.binarySearch { it.first.compareTo(interval[1]) }.let { if (it >= 0) sorted[it].second else sorted.getOrNull(-it - 1)?.second ?: -1 } }.toIntArray() }}
