/*
 * @lc app=leetcode id=327 lang=kotlin
 *
 * [327] Count of Range Sum
 */

class Solution {fun countRangeSum(nums: IntArray, lower: Int, upper: Int): Int = LongArray(nums.size + 1).apply { for (i in nums.indices) this[i + 1] = this[i] + nums[i] }.let { sums -> intArrayOf(0).let { count -> object { fun mergeSort(lo: Int, hi: Int): LongArray = if (lo == hi) longArrayOf(sums[lo]) else ((lo + hi) / 2).let { mid -> mergeSort(lo, mid) to mergeSort(mid + 1, hi) }.let { (left, right) -> intArrayOf(0, 0).also { ptrs -> left.forEach { leftSum -> Unit.also { while (ptrs[0] < right.size && right[ptrs[0]] - leftSum < lower) ptrs[0]++ }.also { while (ptrs[1] < right.size && right[ptrs[1]] - leftSum <= upper) ptrs[1]++ }.also { count[0] += ptrs[1] - ptrs[0] } } }.let { _ -> (left + right).sortedArray() } } }.run { mergeSort(0, sums.size - 1).let { count[0] } } } }}