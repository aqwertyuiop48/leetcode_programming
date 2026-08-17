/* @lc app=leetcode id=2811 lang=kotlin */
class Solution { fun canSplitArray(nums: List<Int>, m: Int): Boolean = nums.size <= 2 || nums.zipWithNext().any { it.first + it.second >= m } }