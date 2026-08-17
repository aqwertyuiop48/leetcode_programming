/*
 * @lc app=leetcode id=3439 lang=kotlin
 *
 * [3439] Reschedule Meetings for Maximum Free Time I
 */

class Solution {
    fun maxFreeTime(eventTime: Int, k: Int, startTime: IntArray, endTime: IntArray): Int = (intArrayOf(startTime[0]) + IntArray(startTime.size - 1) { i -> startTime[i + 1] - endTime[i] } + intArrayOf(eventTime - endTime.last())).let { g -> (0..k).sumOf { g[it] }.let { s -> (k + 1 until g.size).fold(s to s) { (m, c), i -> (c + g[i] - g[i - k - 1]).let { n -> maxOf(m, n) to n } }.first } }
}