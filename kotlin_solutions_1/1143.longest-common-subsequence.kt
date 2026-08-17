/*
 * @lc app=leetcode id=1143 lang=kotlin
 *
 * [1143] Longest Common Subsequence
 */
class Solution { fun longestCommonSubsequence(s1: String, s2: String): Int = Array(s1.length + 1) { IntArray(s2.length + 1) }.also { dp -> (1..s1.length).forEach { i -> (1..s2.length).forEach { j -> dp[i][j] = if (s1[i - 1] == s2[j - 1]) dp[i - 1][j - 1] + 1 else maxOf(dp[i - 1][j], dp[i][j - 1]) } } }[s1.length][s2.length] }