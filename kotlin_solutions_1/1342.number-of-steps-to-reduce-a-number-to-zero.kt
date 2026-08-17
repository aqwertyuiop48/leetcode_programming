/* @lc app=leetcode id=1342 lang=kotlin */
class Solution { fun numberOfSteps(num: Int): Int = if (num == 0) 0 else Integer.toBinaryString(num).length - 1 + Integer.bitCount(num) }