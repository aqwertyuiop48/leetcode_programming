/*
 * @lc app=leetcode id=34 lang=kotlin
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */



class Solution {fun searchRange(nums: IntArray, target: Int): IntArray = if (nums.isEmpty() || nums.indexOf(target) == -1) intArrayOf(-1, -1) else intArrayOf(nums.indexOf(target), nums.size - nums.reversed().indexOf(target) - 1)}