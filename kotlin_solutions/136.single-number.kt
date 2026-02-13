/*
 * @lc app=leetcode id=136 lang=kotlin
 *
 * [136] Single Number
 */

class Solution {fun singleNumber(nums: IntArray): Int =nums.fold(0) { acc, num -> acc xor num }}
