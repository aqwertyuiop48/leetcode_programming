/*
 * @lc app=leetcode id=3034 lang=kotlin
 *
 * [3034] Number of Subarrays That Match a Pattern I
 */

class Solution { fun countMatchingSubarrays(nums: IntArray, pattern: IntArray): Int = (0 until nums.size - pattern.size).count { i -> pattern.indices.all { k -> java.lang.Integer.compare(nums[i + k + 1], nums[i + k]) == pattern[k] } } }