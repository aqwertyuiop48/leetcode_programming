/*
 * @lc app=leetcode id=2172 lang=kotlin
 *
 * [2172] Maximum AND Sum of Array
 */
class Solution { fun maximumANDSum(A: IntArray, ns: Int): Int = intArrayOf(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049).let { p3 -> IntArray(p3[ns]).let { dp -> (1 until p3[ns]).forEach { mask -> (0 until ns).sumOf { j -> (mask / p3[j]) % 3 }.let { c -> if (c <= A.size) dp[mask] = (1..ns).maxOf { slot -> if ((mask / p3[slot - 1]) % 3 > 0) dp[mask - p3[slot - 1]] + (A[c - 1] and slot) else 0 } } }.run { dp.maxOrNull() ?: 0 } } }