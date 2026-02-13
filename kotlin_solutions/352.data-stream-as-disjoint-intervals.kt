/*
 * @lc app=leetcode id=352 lang=kotlin
 *
 * [352] Data Stream as Disjoint Intervals
 */

class SummaryRanges(private val intervals: MutableSet<Int> = sortedSetOf<Int>()) { fun addNum(value: Int) = intervals.add(value) fun getIntervals(): Array<IntArray> = intervals.fold(mutableListOf<IntArray>()) { acc, num -> acc.apply { if (isEmpty() || last()[1] + 1 < num) add(intArrayOf(num, num)) else last()[1] = num } }.toTypedArray()}

