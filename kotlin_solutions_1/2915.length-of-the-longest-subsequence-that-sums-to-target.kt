/*
 * @lc app=leetcode id=2915 lang=kotlin
 *
 * [2915] Length of the Longest Subsequence That Sums to Target
 */

class Solution { fun lengthOfLongestSubsequence(nums: List<Int>, target: Int): Int = IntArray(target + 1) { if (it == 0) 0 else -1 }.also { dp -> nums.forEach { num -> (target downTo num).forEach { j -> if (dp[j - num] != -1) dp[j] = maxOf(dp[j], dp[j - num] + 1) } } }[target] }