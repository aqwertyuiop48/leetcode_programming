/*
 * @lc app=leetcode id=41 lang=kotlin
 *
 * [41] First Missing Positive
 */

class Solution {fun firstMissingPositive(nums: IntArray): Int = (1..nums.size + 1).firstOrNull { n -> !nums.contains(n) } ?: 1}

