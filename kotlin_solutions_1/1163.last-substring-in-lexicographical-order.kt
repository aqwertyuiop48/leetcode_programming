/*
 * @lc app=leetcode id=1163 lang=kotlin
 *
 * [1163] Last Substring in Lexicographical Order
 */

class Solution { fun lastSubstring(s: String): String = generateSequence(Triple(0, 1, 0)) { (i, j, k) -> if (j + k < s.length) { if (s[i + k] == s[j + k]) Triple(i, j, k + 1) else if (s[i + k] < s[j + k]) maxOf(i + k + 1, j).let { ni -> Triple(ni, ni + 1, 0) } else Triple(i, j + k + 1, 0) } else null }.last().first.let { s.substring(it) } }