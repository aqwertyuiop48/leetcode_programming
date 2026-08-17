/*
 * @lc app=leetcode id=2090 lang=kotlin
 *
 * [2090] K Radius Subarray Averages
 */

class Solution {
    fun getAverages(nums: IntArray, k: Int): IntArray = IntArray(nums.size) { -1 }.apply { LongArray(1).let { sum -> (2 * k + 1).let { win -> if (nums.size >= win) nums.indices.forEach { i -> sum.set(0, sum[0] + nums[i].toLong()).also { if (i >= win) sum.set(0, sum[0] - nums[i - win]) }.also { if (i >= win - 1) this.set(i - k, (sum[0] / win).toInt()) } } } } }
}