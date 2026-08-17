/*
 * @lc app=leetcode id=3192 lang=kotlin
 *
 * [3192] Minimum Operations to Make Binary Array Elements Equal to One II
 */
class Solution { fun minOperations(nums: IntArray): Int = nums.fold(0) { flips, num -> if ((num + flips) % 2 == 0) flips + 1 else flips } }