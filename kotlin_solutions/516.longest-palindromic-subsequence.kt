/*
 * @lc app=leetcode id=516 lang=kotlin
 *
 * [516] Longest Palindromic Subsequence
 */

class Solution { fun longestPalindromeSubseq(s: String) = longestPalindromicSubSequence(s) fun longestPalindromicSubSequence(s: String) = s.takeIf { it.length == 1 }?.let { 1 } ?: s.length.let { n -> Array(n) { IntArray(n) }.apply { s.forEachIndexed { index, _ -> this[index][index] = 1 } .also{ (2..n).forEach { len -> (0..n - len).forEach { i -> (i + len - 1).let { j -> this[i][j] = when { s[i] == s[j] -> {this[i + 1][j - 1] + 2} else -> {maxOf(this[i][j - 1], this[i + 1][j])} } } } } } }[0][n - 1] } }
