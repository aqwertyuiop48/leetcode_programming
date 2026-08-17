/*
 * @lc app=leetcode id=1288 lang=kotlin
 *
 * [1288] Remove Covered Intervals
 */

class Solution {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int = intervals.sortedWith(compareBy<IntArray> { it[0] }.thenByDescending { it[1] }).fold(0 to 0) { (count, maxEnd), curr -> if (curr[1] > maxEnd) (count + 1) to curr[1] else count to maxEnd }.first
}