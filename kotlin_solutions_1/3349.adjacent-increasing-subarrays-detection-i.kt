/*
 * @lc app=leetcode id=3349 lang=java
 *
 * [3349] Adjacent Increasing Subarrays Detection I
 */
class Solution {
    fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean = (0..nums.size - 2 * k).any { i -> (0 until k - 1).all { j -> nums[i + j] < nums[i + j + 1] } && (0 until k - 1).all { j -> nums[i + k + j] < nums[i + k + j + 1] } }
}