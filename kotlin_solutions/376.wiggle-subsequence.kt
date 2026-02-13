/*
 * @lc app=leetcode id=376 lang=kotlin
 *
 * [376] Wiggle Subsequence
 */

class Solution {fun wiggleMaxLength(nums: IntArray): Int = nums.drop(1).foldIndexed(1 to 1) { i, (inc, dec), n -> when { n > nums[i] -> {(dec + 1) to dec} n < nums[i] -> {inc to (inc + 1)} else -> inc to dec } }.let { maxOf(it.first, it.second) }}

