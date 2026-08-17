/* @lc app=leetcode id=2592 lang=kotlin */
class Solution { fun maximizeGreatness(nums: IntArray): Int = nums.sorted().let { s -> s.fold(0) { i, x -> if (x > s[i]) i + 1 else i } } }