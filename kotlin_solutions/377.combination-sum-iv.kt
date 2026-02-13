/*
 * @lc app=leetcode id=377 lang=kotlin
 *
 * [377] Combination Sum IV
 */

class Solution {fun combinationSum4(nums: IntArray, target: Int): Int = (1..target).fold(IntArray(target + 1).apply { this[0] = 1 }) { dp, i -> nums.forEach { n -> if (i >= n) dp[i] += dp[i - n] }.run{dp} }[target]}