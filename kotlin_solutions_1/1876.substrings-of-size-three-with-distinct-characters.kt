/* @lc app=leetcode id=1876 lang=kotlin */
class Solution { fun countGoodSubstrings(s: String): Int = (0..s.length - 3).count { i -> s[i] != s[i + 1] && s[i] != s[i + 2] && s[i + 1] != s[i + 2] } }