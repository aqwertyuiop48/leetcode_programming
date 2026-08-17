/*
 * @lc app=leetcode id=3190 lang=kotlin
 *
 * [3190] Find Minimum Operations to Make All Elements Divisible by Three
 */
class Solution { fun minimumOperations(nums: IntArray): Int = nums.count { it % 3 != 0 } }