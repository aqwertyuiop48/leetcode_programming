/*
 * @lc app=leetcode id=3105 lang=kotlin
 *
 * [3105] Longest Strictly Increasing or Strictly Decreasing Subarray
 */

class Solution { fun longestMonotonicSubarray(nums: IntArray): Int = nums.indices.drop(1).fold(Triple(1, 1, 1)) { (inc, dec, maxL), i -> (if (nums[i] > nums[i - 1]) (inc + 1) to 1 else if (nums[i] < nums[i - 1]) 1 to (dec + 1) else 1 to 1).let { (ni, nd) -> Triple(ni, nd, maxOf(maxL, ni, nd)) } }.third }