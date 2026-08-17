/*
 * @lc app=leetcode id=3430 lang=kotlin
 *
 * [3430] Maximum and Minimum Sums of at Most Size K Subarrays
 */

class Solution {
    fun minMaxSubarraySum(nums: IntArray, k: Int): Long = listOf(true, false).sumOf { isMin -> IntArray(nums.size + 2).also { it[0] = -1 }.let { stack -> arrayOf(0, 0, stack, 0L).let { initial -> generateSequence(initial) { s -> if (s[0] as Int > nums.size) null else if (s[1] as Int > 0 && (s[0] as Int == nums.size || if (isMin) nums[(s[2] as IntArray)[s[1] as Int]] >= nums[s[0] as Int] else nums[(s[2] as IntArray)[s[1] as Int]] <= nums[s[0] as Int])) arrayOf(s[0], (s[1] as Int) - 1, s[2], (s[3] as Long) + nums[(s[2] as IntArray)[s[1] as Int]] * ({ mlr: IntArray -> ({ bounds: IntArray -> if (bounds[1] - bounds[0] < k) (mlr[0] - bounds[0] + 1L) * (bounds[1] - mlr[0] + 1L) else if (mlr[0] - bounds[0] < bounds[1] - mlr[0]) (bounds[0]..mlr[0]).sumOf { l -> maxOf(minOf(mlr[2], l + k - 1) - mlr[0] + 1, 0).toLong() } else (mlr[0]..bounds[1]).sumOf { r -> maxOf(mlr[0] - maxOf(r - k + 1, mlr[1]) + 1, 0).toLong() } })(intArrayOf(maxOf(mlr[1], mlr[0] - k + 1), minOf(mlr[0] + k - 1, mlr[2]))) })(intArrayOf((s[2] as IntArray)[s[1] as Int], (s[2] as IntArray)[(s[1] as Int) - 1] + 1, (s[0] as Int) - 1))) else arrayOf((s[0] as Int) + 1, (s[1] as Int) + 1, (s[2] as IntArray).also { it[(s[1] as Int) + 1] = s[0] as Int }, s[3]) }.last()[3] as Long } }
}