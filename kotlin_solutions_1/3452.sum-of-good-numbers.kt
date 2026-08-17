/*
 * @lc app=leetcode id=3452 lang=java
 *
 * [3452] Sum of Good Numbers
 */
class Solution { fun sumOfGoodNumbers(nums: IntArray, k: Int): Int = nums.indices.filter { i -> (i - k < 0 || nums[i] > nums[i - k]) && (i + k >= nums.size || nums[i] > nums[i + k]) }.sumOf { nums[it] } }