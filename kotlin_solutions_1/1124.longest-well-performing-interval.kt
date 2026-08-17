/*
 * @lc app=leetcode id=1124 lang=kotlin
 *
 * [1124] Longest Well-Performing Interval
 */

class Solution { fun longestWPI(hours: IntArray): Int = hours.foldIndexed(Triple(0, 0, mutableMapOf<Int, Int>())) { i, (score, maxLen, map), h -> (score + if (h > 8) 1 else -1).let { s -> map.putIfAbsent(s, i) Triple( s, if (s > 0) i + 1 else maxOf(maxLen, map[s - 1]?.let { i - it } ?: 0), map ) } }.second }