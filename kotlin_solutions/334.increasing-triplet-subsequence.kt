/*
 * @lc app=leetcode id=334 lang=kotlin
 *
 * [334] Increasing Triplet Subsequence
 */

class Solution {fun increasingTriplet(nums: IntArray): Boolean = nums.fold(Int.MAX_VALUE to Int.MAX_VALUE) { (first, second), num -> when { num <= first -> {num to second} num <= second -> {first to num} else -> return true } }.let { false }}
