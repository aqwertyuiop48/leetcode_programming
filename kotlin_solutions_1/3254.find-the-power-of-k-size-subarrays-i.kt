/*
 * @lc app=leetcode id=3254 lang=java
 *
 * [3254] Find the Power of K-Size Subarrays I
 */
class Solution { fun resultsArray(nums: IntArray, k: Int): IntArray = IntArray(nums.size - k + 1) { i -> if ((i until i + k - 1).all { j -> nums[j + 1] == nums[j] + 1 }) nums[i + k - 1] else -1 } }