/* @lc app=leetcode id=1884 lang=kotlin */
class Solution { fun twoEggDrop(n: Int): Int = Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * n)) / 2.0).toInt() }