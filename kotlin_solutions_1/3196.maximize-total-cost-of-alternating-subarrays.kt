/*
 * @lc app=leetcode id=3196 lang=kotlin
 *
 * [3196] Maximize Total Cost of Alternating Subarrays
 */
class Solution { fun maximumTotalCost(nums: IntArray): Long = nums.drop(1).fold(nums[0].toLong() to nums[0].toLong()) { (dp0, dp1), num -> maxOf(dp0, dp1) + num to dp0 - num }.let { (dp0, dp1) -> maxOf(dp0, dp1) } }