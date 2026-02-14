/*
 * @lc app=leetcode id=628 lang=kotlin
 *
 * [628] Maximum Product of Three Numbers
 */

class Solution { fun maximumProduct(nums: IntArray): Int = nums.sorted().let { s -> maxOf(s[s.lastIndex] * s[s.lastIndex - 1] * s[s.lastIndex - 2], s[0] * s[1] * s[s.lastIndex]) } }
