/*
 * @lc app=leetcode id=198 lang=kotlin
 *
 * [198] House Robber
 */

class Solution { fun rob(nums: IntArray): Int = nums.fold(0 to 0) { (prev2, prev1), num -> prev1 to maxOf(prev1, prev2 + num) }.second }
