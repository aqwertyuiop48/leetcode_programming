/*
 * @lc app=leetcode id=268 lang=kotlin
 *
 * [268] Missing Number
 */

class Solution {fun missingNumber(nums: IntArray): Int {return (nums.size * (nums.size + 1) / 2) - nums.sum()}}