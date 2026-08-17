/* @lc app=leetcode id=2358 lang=kotlin */
class Solution { fun maximumGroups(grades: IntArray): Int = ((Math.sqrt(grades.size * 8.0 + 1) - 1) / 2).toInt() }