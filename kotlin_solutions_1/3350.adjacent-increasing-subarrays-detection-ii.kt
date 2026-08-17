/*
 * @lc app=leetcode id=3350 lang=java
 *
 * [3350] Adjacent Increasing Subarrays Detection II
 */
class Solution {
    fun maxIncreasingSubarrays(nums: List<Int>): Int = IntArray(nums.size) { 1 }.also { inc -> (nums.size - 2 downTo 0).forEach { i -> if (nums[i] < nums[i + 1]) inc[i] = inc[i + 1] + 1 } }.let { inc -> nums.indices.maxOf { i -> maxOf(inc[i] / 2, if (i + inc[i] < nums.size) minOf(inc[i], inc[i + inc[i]]) else 0) } }
}