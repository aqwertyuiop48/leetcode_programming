/*
 * @lc app=leetcode id=3158 lang=kotlin
 *
 * [3158] Find the XOR of Numbers Which Appear Twice
 */

class Solution { fun duplicateNumbersXOR(nums: IntArray): Int = nums.groupBy { it }.filter { it.value.size == 2 }.keys.fold(0) { acc, v -> acc xor v } }