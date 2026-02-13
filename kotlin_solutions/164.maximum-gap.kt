/*
 * @lc app=leetcode id=164 lang=kotlin
 *
 * [164] Maximum Gap
 */

class Solution {fun maximumGap(nums: IntArray): Int = if (nums.size < 2) 0 else nums.sorted().zipWithNext { a, b -> b - a }.maxOrNull() ?: 0}
