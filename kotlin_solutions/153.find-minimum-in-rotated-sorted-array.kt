/*
 * @lc app=leetcode id=153 lang=kotlin
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

class Solution { fun findMin(nums: IntArray): Int = generateSequence(0 to nums.lastIndex) { (left, right) -> ((left < right).takeIf { it }?.let { ((left + right) / 2).let { mid -> if (nums[mid] > nums[right]) (mid + 1) to right else left to mid } }) }.first { (left, right) -> left >= right }.first.let { nums[it] } }

