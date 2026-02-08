/*
 * @lc app=leetcode id=5 lang=kotlin
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution { fun longestPalindrome(s: String): String = Array(s.length) { i -> BooleanArray(s.length) { i >= it } }.let { dp -> s.indices.fold(s.take(1)) { res, to -> (to - 1 downTo 0).fold(res) { r, from -> dp[from][to].let { dp[from][to] = s[from] == s[to] && dp[from + 1][to - 1] } .let { if (dp[from][to] && to - from + 1 > r.length) s.substring(from, to + 1) else r } } } } }
// @lc code=end

