/*
 * @lc app=leetcode id=35 lang=kotlin
 *
 * [35] Search Insert Position
 */

class Solution {fun searchInsert(nums: IntArray, target: Int): Int = nums.binarySearch(target).let { if (it >= 0) it else -it - 1 }}
