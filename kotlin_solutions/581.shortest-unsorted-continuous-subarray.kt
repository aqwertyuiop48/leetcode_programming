/*
 * @lc app=leetcode id=581 lang=kotlin
 *
 * [581] Shortest Unsorted Continuous Subarray
 */

class Solution { fun findUnsortedSubarray(nums: IntArray): Int = nums.sorted().let { sorted -> nums.indices.firstOrNull { nums[it] != sorted[it] }?.let { left -> nums.indices.lastOrNull { nums[it] != sorted[it] }?.let { right -> right - left + 1 } ?: 0 } ?: 0 } }
