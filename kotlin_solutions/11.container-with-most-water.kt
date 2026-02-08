/*
 * @lc app=leetcode id=11 lang=kotlin
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution { fun maxArea(height: IntArray): Int = generateSequence(Triple(0, height.size - 1, 0)) { (left, right, maxArea) -> (left < right).takeIf { it }?.let { ((right - left) * minOf(height[left], height[right])).let { area -> if (height[left] < height[right]) Triple(left + 1, right, maxOf(maxArea, area)) else Triple(left, right - 1, maxOf(maxArea, area)) } } }.last().third }
// @lc code=end

