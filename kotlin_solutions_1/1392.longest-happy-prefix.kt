/*
 * @lc app=leetcode id=1392 lang=kotlin
 *
 * [1392] Longest Happy Prefix
 */

class Solution {
    fun longestPrefix(s: String): String = IntArray(s.length).also { lps -> (1 until s.length).fold(0) { j, i -> generateSequence(j) { k -> if (k > 0 && s[i] != s[k]) lps[k - 1] else null }.first { k -> k == 0 || s[i] == s[k] }.let { k -> (if (s[i] == s[k]) k + 1 else 0).also { lps[i] = it } } } }.let { s.substring(0, it.last()) }
}