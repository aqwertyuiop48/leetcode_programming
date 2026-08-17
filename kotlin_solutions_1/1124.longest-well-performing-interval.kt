/*
 * @lc app=leetcode id=1124 lang=kotlin
 *
 * [1124] Longest Well-Performing Interval
 */

class Solution {
    fun longestWPI(hours: IntArray): Int = HashMap<Int, Int>().let { map -> hours.foldIndexed(Triple(0, 0, map)) { i, (score, maxLen, m), h -> (score + if (h > 8) 1 else -1).let { ns -> if (ns > 0) Triple(ns, i + 1, m) else { m.putIfAbsent(ns, i).run{Triple(ns, maxOf(maxLen, if (m.containsKey(ns - 1)) i - m[ns - 1]!! else 0), m) }} } }.second }
}