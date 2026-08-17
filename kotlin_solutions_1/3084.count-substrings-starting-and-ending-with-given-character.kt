/* @lc app=leetcode id=3084 lang=kotlin */
class Solution { fun countSubstrings(s: String, c: Char): Long = s.count { it == c }.toLong().let { n -> n * (n + 1) / 2 } }