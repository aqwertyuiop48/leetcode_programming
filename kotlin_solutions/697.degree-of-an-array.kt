/*
 * @lc app=leetcode id=697 lang=kotlin
 *
 * [697] Degree of an Array
 */

class Solution { fun findShortestSubArray(nums: IntArray): Int = nums.withIndex().groupBy { it.value }.let { groups -> groups.values.maxOf { it.size }.let { degree -> groups.values.filter { it.size == degree }.minOf { it.last().index - it.first().index + 1 } } } }

