/* @lc app=leetcode id=2138 lang=kotlin */
class Solution { fun divideString(s: String, k: Int, fill: Char): Array<String> = s.padEnd((s.length + k - 1) / k * k, fill).chunked(k).toTypedArray() }