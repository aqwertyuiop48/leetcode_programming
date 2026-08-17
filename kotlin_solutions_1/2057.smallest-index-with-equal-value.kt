/* @lc app=leetcode id=2057 lang=kotlin */
class Solution { fun smallestEqual(nums: IntArray): Int = nums.indices.firstOrNull { it % 10 == nums[it] } ?: -1 }