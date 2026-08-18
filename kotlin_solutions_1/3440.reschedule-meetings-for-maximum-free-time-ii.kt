/*
 * @lc app=leetcode id=3440 lang=kotlin
 *
 * [3440] Reschedule Meetings for Maximum Free Time II
 */

class Solution {
    fun maxFreeTime(eventTime: Int, startTime: IntArray, endTime: IntArray): Int = (intArrayOf(startTime[0]) + IntArray(startTime.size - 1) { i -> startTime[i + 1] - endTime[i] } + intArrayOf(eventTime - endTime.last())).let { g -> g.indices.map { it to g[it] }.sortedByDescending { it.second }.take(3).let { top -> startTime.indices.maxOf { i -> (g[i] + g[i + 1]).let { base -> (endTime[i] - startTime[i]).let { d -> if (top.any { it.first != i && it.first != i + 1 && it.second >= d }) base + d else base } } } } }
}