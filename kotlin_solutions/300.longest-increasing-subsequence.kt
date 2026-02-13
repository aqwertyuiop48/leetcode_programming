/*
 * @lc app=leetcode id=300 lang=kotlin
 *
 * [300] Longest Increasing Subsequence
 */

class Solution {fun lengthOfLIS(nums: IntArray) = nums.fold(mutableListOf<Int>()) { dp, num -> dp.binarySearch(num).let { pos -> if (pos < 0) -pos - 1 else pos }.let { idx -> if (idx == dp.size) dp.add(num) else dp[idx] = num }.let { dp } }.size}
