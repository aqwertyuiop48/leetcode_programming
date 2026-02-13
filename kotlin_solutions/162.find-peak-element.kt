/*
 * @lc app=leetcode id=162 lang=kotlin
 *
 * [162] Find Peak Element
 */

class Solution { fun findPeakElement(nums: IntArray): Int = generateSequence(0 to nums.lastIndex) { (left, right) -> (left < right).takeIf { it }?.let { ((left + right) / 2).let { mid -> if (nums[mid] < nums[mid + 1]) (mid + 1) to right else left to mid } } }.first { (left, right) -> left >= right }.first }
