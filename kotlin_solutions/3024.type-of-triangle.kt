/*
 * @lc app=leetcode id=3024 lang=kotlin
 *
 * [3024] Type of Triangle
 */

class Solution {fun triangleType(nums: IntArray) = nums.sorted().let { sorted -> if (sorted[0] + sorted[1] <= sorted[2]) "none" else when (nums.toSet().size) { 1 -> {"equilateral"} 2 -> {"isosceles"} else -> "scalene" } }}
