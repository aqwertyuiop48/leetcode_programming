/*
 * @lc app=leetcode id=747 lang=kotlin
 *
 * [747] Largest Number At Least Twice of Others
 */
class Solution { fun dominantIndex(nums: IntArray): Int = nums.indices.maxByOrNull { nums[it] }!!.let { maxIdx -> if (nums.all { it == nums[maxIdx] || nums[maxIdx] >= 2 * it }) maxIdx else -1 } }
