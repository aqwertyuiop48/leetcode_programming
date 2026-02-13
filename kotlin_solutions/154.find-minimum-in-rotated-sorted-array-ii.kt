/*
 * @lc app=leetcode id=154 lang=kotlin
 *
 * [154] Find Minimum in Rotated Sorted Array II
 */

class Solution { fun findMin(nums: IntArray): Int = generateSequence(0 to nums.lastIndex) { (left, right) -> (left < right).takeIf { it }?.let { ((left + right) / 2).let { mid -> when { nums[mid] > nums[right] -> {(mid + 1) to right} nums[mid] < nums[right] -> {left to mid} else -> {left to (right - 1)} } } } }.first { (left, right) -> left >= right }.first.let { nums[it] } }

