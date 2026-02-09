/*
 * @lc app=leetcode id=80 lang=kotlin
 *
 * [80] Remove Duplicates from Sorted Array II
 */

class Solution { fun removeDuplicates(nums: IntArray): Int = if (nums.size <= 2) nums.size else (2 until nums.size).fold(2) { slow, fast -> if (nums[slow - 2] != nums[fast]) slow.also { nums[it] = nums[fast] } + 1 else slow } }

