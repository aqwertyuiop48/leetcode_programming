/* @lc app=leetcode id=2745 lang=kotlin */
class Solution { fun longestString(x: Int, y: Int, z: Int): Int = (2 * minOf(x, y) + (if (x == y) 0 else 1) + z) * 2 }