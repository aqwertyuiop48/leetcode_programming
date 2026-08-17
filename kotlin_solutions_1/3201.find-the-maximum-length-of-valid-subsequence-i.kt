/*
 * @lc app=leetcode id=3201 lang=kotlin
 *
 * [3201] Find the Maximum Length of Valid Subsequence I
 */
class Solution { fun maximumLength(nums: IntArray): Int = nums.fold(intArrayOf(0, 0, 0, 0)) { a, x -> if (x % 2 == 0) intArrayOf(a[0] + 1, a[1], a[3] + 1, a[3]) else intArrayOf(a[0], a[1] + 1, a[2], a[2] + 1) }.maxOrNull()!! }