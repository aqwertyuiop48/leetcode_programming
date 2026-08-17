/* @lc app=leetcode id=2864 lang=kotlin */
class Solution { fun maximumOddBinaryNumber(s: String): String = s.count { it == '1' }.let { "1".repeat(it - 1) + "0".repeat(s.length - it) + "1" } }