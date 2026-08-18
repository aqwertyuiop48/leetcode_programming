/*
 * @lc app=leetcode id=3423 lang=kotlin
 *
 * [3423] Maximum Difference Between Adjacent Elements in a Circular Array
 */

class Solution {
    fun maxAdjacentDistance(nums: IntArray): Int = nums.indices.maxOf { kotlin.math.abs(nums[it] - nums[(it + 1) % nums.size]) }
}