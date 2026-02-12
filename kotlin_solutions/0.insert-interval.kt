/*
 * @lc app=leetcode id=57 lang=kotlin
 *
 * [57] Insert Interval
 */

class Solution { fun insert(intervals1: Array<IntArray>, newInterval: IntArray): Array<IntArray> = (intervals1 + arrayOf(newInterval)).sortedBy { it[0] }.fold(mutableListOf<IntArray>()) { acc, curr -> (acc.takeIf { it.isNotEmpty() && it.last()[1] >= curr[0] }?.also { it[it.lastIndex][1] = maxOf(it.last()[1], curr[1]) } ?: acc.also { it.add(curr) }) }.toTypedArray() }
