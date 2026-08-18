/* @lc app=leetcode id=3512 lang=kotlin */
class Solution { fun minOperations(nums: IntArray, k: Int): Int = (nums.fold(0L) { acc, x -> (acc + x) % k } % k).toInt() }