/*
 * @lc app=leetcode id=798 lang=kotlin
 *
 * [798] Smallest Rotation with Highest Score
 */

class Solution { fun bestRotation(nums: IntArray): Int = nums.size.let { n -> IntArray(n).apply { nums.indices.forEach { i -> this[(i - nums[i] + 1 + n) % n]-- } }.let { loss -> (1 until n).fold(0) { res, i -> (loss[i - 1] + loss[i] + 1).also { loss[i] = it }.let { if (it > loss[res]) i else res } } } } }