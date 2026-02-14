/*
 * @lc app=leetcode id=813 lang=kotlin
 *
 * [813] Largest Sum of Averages
 */

class Solution {fun largestSumOfAverages(nums: IntArray, parts: Int): Double = nums.runningFold(0.0) { acc, n -> acc + n }.let { p -> (0 until parts - 1).fold(DoubleArray(nums.size) { i -> (p.last() - p[i]) / (nums.size - i) }) { dp, _ -> dp.apply { nums.indices.forEach { i -> (i + 1 until nums.size).forEach { j -> this[i] = maxOf(this[i], (p[j] - p[i]) / (j - i) + this[j]) } } } }[0] }}