/*
 * @lc app=leetcode id=152 lang=kotlin
 *
 * [152] Maximum Product Subarray
 */

class Solution { fun maxProduct(nums: IntArray) = nums.fold(Triple(1, 1, nums[0])) { t, x -> listOf(x, x * t.first, x * t.second).let { (a, b, c) -> Triple(listOf(a, b, c).maxOrNull()!!, listOf(a, b, c).minOrNull()!!, maxOf(t.third, listOf(a, b, c).maxOrNull()!!)) } }.run { third } }