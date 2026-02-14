/*
 * @lc app=leetcode id=416 lang=kotlin
 *
 * [416] Partition Equal Subset Sum
 */

class Solution {fun canPartition(nums: IntArray): Boolean = nums.sum().let { sum -> if (sum % 2 == 1) false else nums.fold(setOf(0)) { dp, n -> dp + dp.map { it + n } }.contains(sum / 2) }}

