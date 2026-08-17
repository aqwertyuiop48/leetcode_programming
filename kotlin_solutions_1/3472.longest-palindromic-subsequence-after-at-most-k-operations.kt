/*
 * @lc app=leetcode id=3472 lang=kotlin
 *
 * [3472] Longest Palindromic Subsequence After at Most K Operations
 */

class Solution { fun longestPalindromicSubsequence(s: String, k: Int): Int = Array(s.length) { Array(s.length) { IntArray(k + 1) { -1 } } }.let { memo -> kotlin.DeepRecursiveFunction<Int, Int> { state -> state.let { st -> (st shr 16).let { i -> ((st shr 8) and 0xFF).let { j -> (st and 0xFF).let { w -> if (i > j) 0 else if (i == j) 1 else if (memo[i][j][w] != -1) memo[i][j][w] else maxOf(callRecursive(((i + 1) shl 16) or (j shl 8) or w), callRecursive((i shl 16) or ((j - 1) shl 8) or w), if (w >= kotlin.math.abs(s[i] - s[j]).let { minOf(it, 26 - it) }) 2 + callRecursive(((i + 1) shl 16) or ((j - 1) shl 8) or (w - kotlin.math.abs(s[i] - s[j]).let { minOf(it, 26 - it) })) else 0).also { memo[i][j][w] = it } } } } }(((0 shl 16) or ((s.length - 1) shl 8) or k)) } }