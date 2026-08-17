/*
 * @lc app=leetcode id=3473 lang=kotlin
 *
 * [3473] Sum of K Subarrays With Length at Least M
 */

class Solution { fun maxSum(nums: IntArray, k: Int, m: Int): Int = IntArray(nums.size + 1).apply { nums.indices.forEach { i -> this[i + 1] = this[i] + nums[i] } }.let { pref -> Array(nums.size + 1) { Array(2) { IntArray(k + 1) { Int.MIN_VALUE } } }.let { memo -> kotlin.DeepRecursiveFunction<Int, Int> { st -> (st shr 12).let { i -> ((st shr 11) and 1).let { state -> (st and 0x7FF).let { j -> if (j == 0) 0 else if (i >= nums.size) -100000000 else if (memo[i][state][j] != Int.MIN_VALUE) memo[i][state][j] else (if (state == 0) maxOf(callRecursive(((i + 1) shl 12) or (0 shl 11) or j), if (i + m <= nums.size) (pref[i + m] - pref[i]) + callRecursive(((i + m) shl 12) or (1 shl 11) or (j - 1)) else -100000000) else maxOf(nums[i] + callRecursive(((i + 1) shl 12) or (1 shl 11) or j), callRecursive((i shl 12) or (0 shl 11) or j))).also { memo[i][state][j] = it } } } } }((0 shl 12) or (0 shl 11) or k)) } } }