/* @lc app=leetcode id=3223 lang=kotlin */
class Solution { fun minimumLength(s: String): Int = s.groupingBy { it }.eachCount().values.sumOf { if (it % 2 == 1) 1 else 2 } }