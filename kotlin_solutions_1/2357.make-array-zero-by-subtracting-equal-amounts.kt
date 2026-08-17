/* @lc app=leetcode id=2357 lang=kotlin */
class Solution { fun minimumOperations(nums: IntArray): Int = nums.filter { it > 0 }.distinct().count() }