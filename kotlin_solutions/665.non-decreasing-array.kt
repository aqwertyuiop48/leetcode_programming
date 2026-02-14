/*
 * @lc app=leetcode id=665 lang=kotlin
 *
 * [665] Non-decreasing Array
 */

class Solution { fun checkPossibility(nums: IntArray): Boolean = nums.indices.drop(1).count { nums[it] < nums[it - 1] }.let { it <= 1 && nums.indices.drop(1).firstOrNull { nums[it] < nums[it - 1] }?.let { i -> (i == 1 || nums[i] >= nums[i - 2]) || (i == nums.lastIndex || nums[i + 1] >= nums[i - 1]) } ?: true } }

