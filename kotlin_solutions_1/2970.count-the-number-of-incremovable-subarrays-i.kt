/*
 * @lc app=leetcode id=2970 lang=kotlin
 *
 * [2970] Count the Number of Incremovable Subarrays I
 */

class Solution { fun incremovableSubarrayCount(nums: IntArray): Int = (0 until nums.size).sumOf { i -> (i until nums.size).count { j -> nums.filterIndexed { idx, _ -> idx < i || idx > j }.let { rem -> rem.indices.all { k -> k == 0 || rem[k] > rem[k - 1] } } } } }