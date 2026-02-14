/*
 * @lc app=leetcode id=674 lang=kotlin
 *
 * [674] Longest Continuous Increasing Subsequence
 */

class Solution { fun findLengthOfLCIS(nums: IntArray): Int = nums.indices.drop(1).fold(1 to 1) { (cur, max), i -> (if (nums[i] > nums[i - 1]) cur + 1 else 1).let { it to maxOf(max, it) } }.second.let { if (nums.isEmpty()) 0 else it } }