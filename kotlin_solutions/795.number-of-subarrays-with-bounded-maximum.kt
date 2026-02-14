/*
 * @lc app=leetcode id=795 lang=kotlin
 *
 * [795] Number of Subarrays with Bounded Maximum
 */

class Solution { fun numSubarrayBoundedMax(nums: IntArray, left: Int, right: Int): Int = nums.indices.fold(Triple(0, -1, -1)) { (count, lastValid, lastInvalid), i -> when { nums[i] in left..right -> {Triple(count + i - lastInvalid, i, lastInvalid)} nums[i] < left -> {Triple(count + maxOf(lastValid - lastInvalid, 0), lastValid, lastInvalid)} else -> Triple(count, lastValid, i) } }.first }