/*
 * @lc app=leetcode id=2099 lang=kotlin
 *
 * [2099] Find Subsequence of Length K With the Largest Sum
 */

class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray = nums.indices.sortedByDescending { nums[it] }.take(k).sorted().map { nums[it] }.toIntArray()
}