/*
 * @lc app=leetcode id=115 lang=kotlin
 *
 * [115] Distinct Subsequences
 */

class Solution {fun numDistinct(s: String, t: String): Int =IntArray(t.length + 1).apply { this[0] = 1 }.also { dp ->s.forEach { sourceChar ->(t.length downTo 1).forEach { j ->if (sourceChar == t[j - 1]) dp[j] += dp[j - 1]}}}[t.length]}

