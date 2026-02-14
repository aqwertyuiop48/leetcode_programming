/*
 * @lc app=leetcode id=643 lang=kotlin
 *
 * [643] Maximum Average Subarray I
 */

class Solution { fun findMaxAverage(nums: IntArray, k: Int): Double = nums.take(k).sum().toDouble().let { initialSum -> (k until nums.size).fold(initialSum to initialSum) { (sum, maxSum), r -> (sum + nums[r] - nums[r - k]).let { it to maxOf(maxSum, it) } }.second / k } }