/*
 * @lc app=leetcode id=696 lang=kotlin
 *
 * [696] Count Binary Substrings
 */

class Solution { fun countBinarySubstrings(s: String): Int = (1 until s.length).fold(Triple(0, 0, 1)) { (result, prev, curr), i -> if (s[i] == s[i - 1]) Triple(result, prev, curr + 1) else Triple(result + minOf(prev, curr), curr, 1) }.let { (result, prev, curr) -> result + minOf(prev, curr) } }
