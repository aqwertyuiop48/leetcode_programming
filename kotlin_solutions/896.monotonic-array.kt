/*
 * @lc app=leetcode id=896 lang=kotlin
 *
 * [896] Monotonic Array
 */

class Solution { fun isMonotonic(nums: IntArray) = nums.asSequence().zipWithNext().let { pairs -> pairs.all { it.first <= it.second } || pairs.all { it.first >= it.second } } }
