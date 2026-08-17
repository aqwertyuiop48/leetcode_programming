/*
 * @lc app=leetcode id=3364 lang=java
 *
 * [3364] Minimum Positive Sum Subarray 
 */
class Solution {
    fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int = (l..r).mapNotNull { len -> (0..nums.size - len).map { i -> (i until i + len).sumOf { nums[it] } }.filter { it > 0 }.minOrNull() }.minOrNull() ?: -1
}