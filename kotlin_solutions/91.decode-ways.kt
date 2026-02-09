/*
 * @lc app=leetcode id=91 lang=kotlin
 *
 * [91] Decode Ways
 */

class Solution { fun numDecodings(s: String): Int = if (s.isEmpty() || s[0] == '0') 0 else s.drop(1).foldIndexed(1 to 1) { i, (prev, cur), c -> (if (c == '0') 0 else cur).let { oneDigit -> (if (s.substring(i, i + 2).toInt() in 10..26) prev else 0).let { twoDigit -> if (oneDigit == 0 && twoDigit == 0) return 0 else cur to (oneDigit + twoDigit) } } }.second }
