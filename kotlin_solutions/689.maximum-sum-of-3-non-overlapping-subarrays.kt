/*
 * @lc app=leetcode id=689 lang=kotlin
 *
 * [689] Maximum Sum of 3 Non-Overlapping Subarrays
 */

class Solution { fun maxSumOfThreeSubarrays(nums: IntArray, k: Int): IntArray = IntArray(nums.size - k + 1) { i -> nums.slice(i until i + k).sum() }.let { sums -> IntArray(sums.size) { it }.apply { (1 until size).forEach { if (sums[it] > sums[this[it - 1]]) this[it] = it else this[it] = this[it - 1] } }.let { left -> IntArray(sums.size) { it }.apply { (size - 2 downTo 0).forEach { if (sums[it] >= sums[this[it + 1]]) this[it] = it else this[it] = this[it + 1] } }.let { right -> (k until sums.size - k).maxByOrNull { j -> sums[left[j - k]] + sums[j] + sums[right[j + k]] }!!.let { j -> intArrayOf(left[j - k], j, right[j + k]) } } } } }