/* @lc app=leetcode id=2568 lang=kotlin */
class Solution { fun minImpossibleOR(nums: IntArray): Int = nums.toSet().let { s -> generateSequence(1) { it * 2 }.first { it !in s } } }