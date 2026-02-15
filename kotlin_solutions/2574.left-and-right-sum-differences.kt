/*
 * @lc app=leetcode id=2574 lang=kotlin
 *
 * [2574] Left and Right Sum Differences
 */

class Solution {fun leftRightDifference(nums: IntArray) = nums.indices.map { i -> Math.abs(nums.take(i).sum() - nums.drop(i + 1).sum()) }.toIntArray()}

