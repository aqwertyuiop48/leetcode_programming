/*
 * @lc app=leetcode id=1262 lang=kotlin
 *
 * [1262] Greatest Sum Divisible by Three
 */

class Solution {
    fun maxSumDivThree(nums: IntArray): Int = IntArray(3) { if (it == 0) 0 else Int.MIN_VALUE }.also { dp -> nums.forEach { n -> dp.clone().forEach { v -> if (v >= 0) dp[(v + n) % 3] = maxOf(dp[(v + n) % 3], v + n) } } }[0]
}