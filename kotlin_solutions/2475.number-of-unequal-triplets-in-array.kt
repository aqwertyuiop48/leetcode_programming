/*
 * @lc app=leetcode id=2475 lang=kotlin
 *
 * [2475] Number of Unequal Triplets in Array
 */

class Solution { fun unequalTriplets(nums: IntArray): Int = nums.indices.sumOf { i -> (i + 1 until nums.size).sumOf { j -> (j + 1 until nums.size).count { k -> nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k] } } } }