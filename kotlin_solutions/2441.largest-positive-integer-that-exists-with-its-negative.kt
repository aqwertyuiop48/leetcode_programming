/*
 * @lc app=leetcode id=2441 lang=kotlin
 *
 * [2441] Largest Positive Integer That Exists With Its Negative
 */

class Solution {fun findMaxK(nums: IntArray) = nums.groupBy { abs(it) }.filter { it.value.count { it < 0 } > 0 && it.value.count { it > 0 } > 0 }.maxOfOrNull { it.key } ?: -1}