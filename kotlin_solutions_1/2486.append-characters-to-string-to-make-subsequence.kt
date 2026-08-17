/* @lc app=leetcode id=2486 lang=kotlin */
class Solution { fun appendCharacters(s: String, t: String): Int = s.fold(0) { i, c -> if (i < t.length && c == t[i]) i + 1 else i }.let { t.length - it } }