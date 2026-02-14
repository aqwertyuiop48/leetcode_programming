/*
 * @lc app=leetcode id=539 lang=kotlin
 *
 * [539] Minimum Time Difference
 */

class Solution { fun findMinDifference(timePoints: List<String>) = timePoints.map { it.split(":").let { (h, m) -> h.toInt() * 60 + m.toInt() } }.sorted().let { sorted -> (sorted.zipWithNext { a, b -> b - a } + (sorted.first() + 1440 - sorted.last())).min() } }
