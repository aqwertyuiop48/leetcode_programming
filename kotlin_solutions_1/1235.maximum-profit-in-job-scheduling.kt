/*
 * @lc app=leetcode id=1235 lang=kotlin
 *
 * [1235] Maximum Profit in Job Scheduling
 */
class Solution { fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int = java.util.TreeMap<Int, Int>().apply { put(0, 0) }.also { dp -> startTime.indices.map { Triple(startTime[it], endTime[it], profit[it]) }.sortedBy { it.second }.forEach { (s, e, p) -> (p + dp.floorEntry(s).value).also { if (it > dp.lastEntry().value) dp[e] = it } } }.lastEntry().value }