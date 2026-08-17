/*
 * @lc app=leetcode id=1995 lang=kotlin
 *
 * [1995] Count Special Quadruplets
 */

class Solution { fun countQuadruplets(nums: IntArray): Int = IntArray(301).let { freq -> (1 until nums.size - 1).fold(0) { total, c -> (0 until c - 1).forEach { a -> freq[nums[a] + nums[c - 1] + 100]++ }.run { total + (c + 1 until nums.size).sumOf { d -> if (nums[d] - nums[c] + 100 in 0..300) freq[nums[d] - nums[c] + 100] else 0 } } } } }