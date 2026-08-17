/*
 * @lc app=leetcode id=3012 lang=kotlin
 *
 * [3012] Minimize Length of Array Using Operations
 */

class Solution { fun minimumArrayLength(nums: IntArray): Int = nums.minOrNull()!!.let { minVal -> if (nums.any { it % minVal != 0 }) 1 else (nums.count { it == minVal } + 1) / 2 } }