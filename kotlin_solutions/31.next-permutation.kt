/*
 * @lc app=leetcode id=31 lang=kotlin
 *
 * [31] Next Permutation
 */

class Solution {fun nextPermutation(nums: IntArray) = nums.apply { (lastIndex - 1 downTo 0).firstOrNull { i -> (lastIndex downTo i + 1).firstOrNull { j -> nums[j] > nums[i] }?.let { j -> nums.run { get(i).let { temp -> set(i, get(j)).let { set(j, temp) }.let { sort(i + 1, lastIndex + 1) } } } } != null } ?: nums.sort() }}