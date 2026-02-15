/*
 * @lc app=leetcode id=2656 lang=kotlin
 *
 * [2656] Maximum Sum With Exactly K Elements 
 */

class Solution {fun maximizeSum(nums: IntArray, k: Int) = nums.maxOrNull()?.let { it * k + k * (k - 1) / 2 } ?: 0}