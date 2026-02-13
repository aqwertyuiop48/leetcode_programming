/*
 * @lc app=leetcode id=279 lang=kotlin
 *
 * [279] Perfect Squares
 */

class Solution {fun numSquares(n: Int) = (1..n).fold(IntArray(n + 1) { it }) { dp, i -> (1..(Math.sqrt(i.toDouble()).toInt())).forEach { j -> dp[i] = minOf(dp[i], dp[i - j * j] + 1) }.let { dp } }[n]}
