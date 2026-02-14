/*
 * @lc app=leetcode id=826 lang=kotlin
 *
 * [826] Most Profit Assigning Work
 */

class Solution { fun maxProfitAssignment(difficulties: IntArray, profits: IntArray, workers: IntArray): Int = difficulties.zip(profits).sortedBy { it.first }.let { jobs -> jobs.fold(mutableListOf<Pair<Int, Int>>()) { acc, (d, p) -> acc.apply { add(d to maxOf(p, acc.lastOrNull()?.second ?: 0)) } }.let { maxJobs -> workers.sumOf { worker -> maxJobs.lastOrNull { it.first <= worker }?.second ?: 0 } } }}