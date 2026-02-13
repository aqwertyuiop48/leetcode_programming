/*
 * @lc app=leetcode id=307 lang=kotlin
 *
 * [307] Range Sum Query - Mutable
 */


class FenwickTree(private val n: Int, private val t: IntArray = IntArray(n), private var nums: IntArray = IntArray(0)) { constructor(arr: IntArray) : this(arr.size, IntArray(arr.size), arr.clone()) { arr.indices.forEach { i -> add(i, arr[i]) } } private fun add(index: Int, value: Int) = generateSequence(index) { i -> (i or (i + 1)).takeIf { it < n } }.forEach { t[it] += value } fun update(index: Int, value: Int) = add(index, value - nums[index]).also { nums[index] = value } fun prefixSum(index: Int) = generateSequence(index) { i -> ((i and (i + 1)) - 1).takeIf { it >= 0 } }.sumOf { t[it] } } class NumArray(nums: IntArray, private val fenwickTree: FenwickTree = FenwickTree(nums)) { fun update(index: Int, `val`: Int) = fenwickTree.update(index, `val`) fun sumRange(left: Int, right: Int) = if (left <= 0) fenwickTree.prefixSum(right) else fenwickTree.prefixSum(right) - fenwickTree.prefixSum(left - 1) }
