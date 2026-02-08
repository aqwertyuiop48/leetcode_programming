/*
 * @lc app=leetcode id=46 lang=kotlin
 *
 * [46] Permutations
 */

class Solution {fun permute(nums: IntArray): List<List<Int>> = if (nums.isEmpty()) listOf(emptyList()) else nums.indices.flatMap { i -> permute(nums.filterIndexed { idx, _ -> idx != i }.toIntArray()).map { listOf(nums[i]) + it } }}