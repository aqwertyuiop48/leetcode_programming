/* @lc app=leetcode id=2367 lang=kotlin */
class Solution { fun arithmeticTriplets(nums: IntArray, diff: Int): Int = nums.toSet().let { s -> nums.count { it + diff in s && it + 2 * diff in s } } }