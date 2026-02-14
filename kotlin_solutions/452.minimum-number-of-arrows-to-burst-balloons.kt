/*
 * @lc app=leetcode id=452 lang=kotlin
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

class Solution { fun findMinArrowShots(points: Array<IntArray>): Int = points.sortedBy { it[1] }.fold(Long.MIN_VALUE to 0) { (end, count), p -> if (p[0].toLong() > end) p[1].toLong() to count + 1 else end to count }.second }

