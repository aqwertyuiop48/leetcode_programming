/* @lc app=leetcode id=2206 lang=kotlin */
class Solution { fun divideArray(nums: IntArray): Boolean = nums.groupBy { it }.values.all { it.size % 2 == 0 } }