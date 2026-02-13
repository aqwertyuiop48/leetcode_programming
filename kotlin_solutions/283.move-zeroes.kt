/*
 * @lc app=leetcode id=283 lang=kotlin
 *
 * [283] Move Zeroes
 */

class Solution {fun moveZeroes(nums: IntArray) = nums.indices.fold(0) { nonZeroIdx, i -> if (nums[i] != 0) nums[nonZeroIdx].also { temp -> nums[nonZeroIdx] = nums[i] }.also { temp -> nums[i] = temp }.let { nonZeroIdx + 1 } else nonZeroIdx }.let { }}
