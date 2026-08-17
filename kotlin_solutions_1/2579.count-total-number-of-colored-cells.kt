/* @lc app=leetcode id=2579 lang=kotlin */
class Solution { fun coloredCells(n: Int): Long = 1L + 2L * n.toLong() * (n.toLong() - 1) }