/* @lc app=leetcode id=1798 lang=kotlin */
class Solution { fun getMaximumConsecutive(coins: IntArray): Int = coins.sorted().fold(1) { res, c -> if (c <= res) res + c else res } }