/* @lc app=leetcode id=2283 lang=kotlin */
class Solution { fun digitCount(num: String): Boolean = num.indices.all { i -> (num[i] - '0') == num.count { it - '0' == i } } }