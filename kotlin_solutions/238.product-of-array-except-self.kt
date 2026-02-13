/*
 * @lc app=leetcode id=238 lang=kotlin
 *
 * [238] Product of Array Except Self
 */

class Solution { fun productExceptSelf(nums: IntArray): IntArray = nums.runningFold(1) { prod, num -> prod * num }.let { pre -> nums.reversed().runningFold(1) { prod, num -> prod * num }.reversed().let { suf -> nums.indices.map { pre[it] * suf[it + 1] }.toIntArray() } } }
