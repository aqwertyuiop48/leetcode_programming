/*
 * @lc app=leetcode id=45 lang=kotlin
 *
 * [45] Jump Game II
 */

class Solution {fun jump(nums: IntArray): Int = if (nums.size <= 1) 0 else generateSequence(Triple(0, 0, 0)) { (jumps, currentEnd, farthest) -> if (currentEnd >= nums.size - 1) null else (0..currentEnd).fold(farthest) { far, i -> maxOf(far, i + nums[i]) }.let { newFarthest -> Triple(jumps + 1, newFarthest, newFarthest) } }.last().first}

