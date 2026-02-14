/*
 * @lc app=leetcode id=446 lang=kotlin
 *
 * [446] Arithmetic Slices II - Subsequence
 */

class Solution { fun numberOfArithmeticSlices(nums: IntArray): Int = Array(nums.size) { mutableMapOf<Long, Int>() }.let { dp -> nums.indices.sumOf { i -> (0..<i).sumOf { j -> (nums[i].toLong() - nums[j]).let { diff -> dp[j].getOrDefault(diff, 0).also { cnt -> dp[i][diff] = dp[i].getOrDefault(diff, 0) + cnt + 1 } } } } } }
