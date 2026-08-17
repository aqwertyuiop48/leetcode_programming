/*
 * @lc app=leetcode id=2905 lang=kotlin
 *
 * [2905] Find Indices With Index and Value Difference II
 */

class Solution {
    fun findIndices(nums: IntArray, indexDiff: Int, valueDiff: Int): IntArray = (indexDiff until nums.size).fold(Triple(intArrayOf(-1, -1), 0, 0)) { (res, minI, maxI), j -> if (res[0] != -1) Triple(res, minI, maxI) else (j - indexDiff).let { i -> (if (nums[i] < nums[minI]) i else minI).let { newMin -> (if (nums[i] > nums[maxI]) i else maxI).let { newMax -> when { nums[j] - nums[newMin] >= valueDiff -> Triple(intArrayOf(newMin, j), newMin, newMax) nums[newMax] - nums[j] >= valueDiff -> Triple(intArrayOf(newMax, j), newMin, newMax) else -> Triple(res, newMin, newMax) } } } } }.first
}