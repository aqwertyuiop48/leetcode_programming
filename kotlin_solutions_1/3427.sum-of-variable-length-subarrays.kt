/*
 * @lc app=leetcode id=3427 lang=kotlin
 *
 * [3427] Sum of Variable Length Subarrays
 */

class Solution {
    fun subarraySum(nums: IntArray): Int = nums.indices.sumOf { i -> (maxOf(0, i - nums[i])..i).sumOf { j -> nums[j] } }
}