/*
 * @lc app=leetcode id=1266 lang=kotlin
 *
 * [1266] Minimum Time Visiting All Points
 */

class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int = (0 until points.size - 1).sumOf { i -> maxOf(kotlin.math.abs(points[i + 1][0] - points[i][0]), kotlin.math.abs(points[i + 1][1] - points[i][1])) }
}