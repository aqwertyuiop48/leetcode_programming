/*
 * @lc app=leetcode id=44 lang=kotlin
 *
 * [44] Wildcard Matching
 */



class Solution { fun isMatch(s: String, p: String): Boolean = (s.length to p.length).let { (n, m) -> Array(n + 1) { _ -> BooleanArray(m + 1) }.apply { this.apply { this[0][0] = true }.also { self -> (1..m).forEach { j -> if (p[j - 1] == '*') self[0][j] = self[0][j - 1] } } }.also { dp -> (1..n).forEach { i -> (1..m).forEach { j -> dp[i][j] = if (s[i - 1] == p[j - 1] || p[j - 1] == '?') dp[i - 1][j - 1] else if (p[j - 1] == '*') (dp[i - 1][j] || dp[i][j - 1]) else false } } }[n][m] } }