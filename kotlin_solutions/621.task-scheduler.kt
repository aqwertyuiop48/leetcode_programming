/*
 * @lc app=leetcode id=621 lang=kotlin
 *
 * [621] Task Scheduler
 */

class Solution {fun leastInterval(tasks: CharArray, n: Int): Int = tasks.groupBy { it }.mapValues { it.value.size }.values.sorted().let { freqs -> freqs.last().let { maxFreq -> maxOf((maxFreq - 1) * (n + 1) + freqs.count { it == maxFreq }, tasks.size) } }}

