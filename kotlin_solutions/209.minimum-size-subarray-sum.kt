/*
 * @lc app=leetcode id=209 lang=kotlin
 *
 * [209] Minimum Size Subarray Sum
 */

class Solution { fun minSubArrayLen(target: Int, nums: IntArray): Int = nums.indices.fold(Triple(0, 0, Int.MAX_VALUE)) { (left, sum, minLen), right -> (sum + nums[right]).let { newSum -> generateSequence(left to newSum) { (l, s) -> (s - nums[l] >= target).takeIf { it && l < right }?.let { (l + 1) to (s - nums[l]) } }.last().let { (newLeft, finalSum) -> Triple( newLeft, finalSum, if (finalSum >= target) minOf(minLen, right - newLeft + 1) else minLen ) } } }.third.let { if (it == Int.MAX_VALUE) 0 else it } }


