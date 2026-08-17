/*
 * @lc app=leetcode id=2444 lang=kotlin
 *
 * [2444] Count Subarrays With Fixed Bounds
 */
class Solution { fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long = nums.indices.fold(longArrayOf(0, -1, -1, -1)) { a, i -> a.apply { if (nums[i] < minK || nums[i] > maxK) set(3, i.toLong()) }.apply { if (nums[i] == minK) set(1, i.toLong()) }.apply { if (nums[i] == maxK) set(2, i.toLong()) }.apply { set(0, get(0) + kotlin.math.max(0L, kotlin.math.min(get(1), get(2)) - get(3))) } }.let { it[0] } }