/*
 * @lc app=leetcode id=2864 lang=java
 *
 * [2864] Maximum Odd Binary Number
 */

class Solution { public String maximumOddBinaryNumber(String s) { return "1".repeat((int)s.chars().filter(c -> c == '1').count() - 1) + "0".repeat((int)s.chars().filter(c -> c == '0').count()) + "1"; } }
