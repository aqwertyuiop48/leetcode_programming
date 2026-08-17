/* @lc app=leetcode id=1903 lang=kotlin */
class Solution { fun largestOddNumber(num: String): String = num.substring(0, num.indexOfLast { (it - '0') % 2 != 0 } + 1) }