/*
 * @lc app=leetcode id=1403 lang=kotlin
 *
 * [1403] Minimum Subsequence in Non-Increasing Order
 */

class Solution { fun minSubsequence(nums: IntArray): List<Int> = nums.sortedDescending().let { sorted -> sorted.take(sorted.scan(0) { acc, x -> acc + x }.indexOfFirst { it * 2 > nums.sum() }) } }