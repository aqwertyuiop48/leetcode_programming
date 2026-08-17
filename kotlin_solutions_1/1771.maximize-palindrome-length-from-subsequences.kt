/*
 * @lc app=leetcode id=1771 lang=kotlin
 *
 * [1771] Maximize Palindrome Length From Subsequences
 */
class Solution { fun longestPalindrome(word1: String, word2: String): Int = (word1 + word2).let { s -> Array(s.length) { IntArray(s.length) }.also { dp -> (s.indices).reversed().forEach { i -> (i until s.length).forEach { j -> dp[i][j] = if (i == j) 1 else if (s[i] == s[j]) (if (i + 1 > j - 1) 0 else dp[i + 1][j - 1]) + 2 else maxOf(dp[i + 1][j], dp[i][j - 1]) } } }.let { dp -> (0 until word1.length).maxOfOrNull { i -> (word1.length until s.length).filter { j -> s[i] == s[j] }.maxOfOrNull { j -> dp[i][j] } ?: 0 } ?: 0 } } }