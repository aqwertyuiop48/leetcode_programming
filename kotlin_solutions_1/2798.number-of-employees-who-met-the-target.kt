/* @lc app=leetcode id=2798 lang=kotlin */
class Solution { fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int = hours.count { it >= target } }