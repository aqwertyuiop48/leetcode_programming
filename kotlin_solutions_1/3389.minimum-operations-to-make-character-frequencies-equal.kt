/*
 * @lc app=leetcode id=3389 lang=java
 *
 * [3389] Minimum Operations to Make Character Frequencies Equal
 */

fun makeStringGood(s: String): Int = s.groupingBy { it }.eachCount().let { countsMap -> IntArray(26) { countsMap.getOrDefault('a' + it, 0) }.let { counts -> (0..counts.maxOrNull()!!).minOf { target -> counts.fold(0 to 0) { (dp0, dp1), c -> minOf(dp0, dp1) + c to minOf(dp0 + maxOf(0, target - c), dp1 + maxOf(0, target - c), if (c > target) minOf(dp0, dp1) + (c - target) else 1000000000) }.let { minOf(it.first, it.second) } } } }