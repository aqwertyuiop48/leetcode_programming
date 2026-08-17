/*
 * @lc app=leetcode id=3392 lang=java
 *
 * [3392] Count Subarrays of Length Three With a Condition
 */

fun countSubarrays(nums: IntArray): Int = (0 until nums.size - 2).count { i -> (nums[i] + nums[i + 2]) * 2 == nums[i + 1] }