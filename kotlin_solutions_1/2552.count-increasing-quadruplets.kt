/*
 * @lc app=leetcode id=2552 lang=kotlin
 *
 * [2552] Count Increasing Quadruplets
 */

class Solution { fun countQuadruplets(nums: IntArray): Long = LongArray(nums.size).let { cnt -> longArrayOf(0).let { ans -> nums.indices.forEach { j -> intArrayOf(0).let { ps -> (0 until j).forEach { i -> if (nums[j] > nums[i]) ans[0] += cnt[i].also { ps[0]++ } else if (nums[j] < nums[i]) cnt[i] += ps[0].toLong() } } }.run { ans[0] } } } }