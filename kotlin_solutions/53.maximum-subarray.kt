/*
 * @lc app=leetcode id=53 lang=kotlin
 *
 * [53] Maximum Subarray
 */

class Solution {fun maxSubArray(nums: IntArray): Int = nums.asSequence().drop(1).runningFold(nums[0]) { prefix, num -> if (prefix < 0) num else prefix + num }.maxOrNull() ?: nums[0]}