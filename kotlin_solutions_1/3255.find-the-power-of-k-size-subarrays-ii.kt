/*
 * @lc app=leetcode id=3255 lang=java
 *
 * [3255] Find the Power of K-Size Subarrays II
 */
class Solution { fun resultsArray(nums: IntArray, k: Int): IntArray = IntArray(nums.size).also { c -> nums.indices.forEach { i -> c[i] = if (i > 0 && nums[i] == nums[i - 1] + 1) c[i - 1] + 1 else 1 } }.let { c -> IntArray(nums.size - k + 1) { i -> if (c[i + k - 1] >= k) nums[i + k - 1] else -1 } } }