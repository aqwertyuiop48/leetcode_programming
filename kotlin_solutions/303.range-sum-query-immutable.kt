/*
 * @lc app=leetcode id=303 lang=kotlin
 *
 * [303] Range Sum Query - Immutable
 */

class NumArray(nums: IntArray, private val prefixSum: List<Int> = nums.runningFold(0) { acc, num -> acc + num }) {fun sumRange(left: Int, right: Int) = prefixSum[right + 1] - prefixSum[left]}

