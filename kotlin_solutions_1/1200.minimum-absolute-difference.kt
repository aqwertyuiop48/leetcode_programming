/*
 * @lc app=leetcode id=1200 lang=kotlin
 *
 * [1200] Minimum Absolute Difference
 */

class Solution { fun minimumAbsDifference(arr: IntArray): List<List<Int>> = arr.sorted().let { s -> s.zipWithNext().groupBy { it.second - it.first }.minByOrNull { it.key }!!.value.map { listOf(it.first, it.second) } } }