/*
 * @lc app=leetcode id=724 lang=kotlin
 *
 * [724] Find Pivot Index
 */

class Solution { fun pivotIndex(nums: IntArray): Int = nums.sum().let { total -> nums.indices.fold(0) { left, i -> if (left == total - left - nums[i]) return i else left + nums[i] }.let { -1 }} }