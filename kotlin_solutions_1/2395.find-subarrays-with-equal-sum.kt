/* @lc app=leetcode id=2395 lang=kotlin */
class Solution { fun findSubarrays(nums: IntArray): Boolean = nums.zipWithNext { a, b -> a + b }.let { it.size != it.distinct().size } }