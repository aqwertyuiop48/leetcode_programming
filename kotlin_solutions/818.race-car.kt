/*
 * @lc app=leetcode id=818 lang=kotlin
 *
 * [818] Race Car
 */

class Solution { fun racecar(target: Int): Int = IntArray(target + 1).also { dp -> (1..target).forEach { i -> (32 - i.countLeadingZeroBits()).let { n -> ((1 shl n) - 1).let { maxPos -> dp[i] = if (maxPos == i) n else (0 until n - 1).fold(n + 1 + dp[maxPos - i]) { m, j -> minOf(m, n + j + 1 + dp[i - (1 shl (n - 1)) + (1 shl j)]) } } } } }[target] }