/*
 * @lc app=leetcode id=2527 lang=kotlin
 *
 * [2527] Find Xor-Beauty of Array
 */

class Solution {fun xorBeauty(nums: IntArray) = nums.reduce { acc, num -> acc xor num }}
