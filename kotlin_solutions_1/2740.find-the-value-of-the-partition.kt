/* @lc app=leetcode id=2740 lang=kotlin */
class Solution { fun findValueOfPartition(nums: IntArray): Int = nums.sorted().let { s -> (0 until s.size - 1).minOf { s[it + 1] - s[it] } } }