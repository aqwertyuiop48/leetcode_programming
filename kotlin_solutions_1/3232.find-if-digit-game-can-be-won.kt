/* @lc app=leetcode id=3232 lang=kotlin */
class Solution { fun canAliceWin(nums: IntArray): Boolean = nums.filter { it < 10 }.sum() != nums.filter { it >= 10 }.sum() }