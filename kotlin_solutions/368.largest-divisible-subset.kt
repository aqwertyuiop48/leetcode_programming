/*
 * @lc app=leetcode id=368 lang=kotlin
 *
 * [368] Largest Divisible Subset
 */

class Solution {fun largestDivisibleSubset(nums: IntArray): List<Int> = nums.sortedArray().let { sorted -> sorted.indices.fold(sorted.indices.map { 1 to -1 }) { dp, i -> (0 until i).fold(dp) { acc, j -> if (sorted[i] % sorted[j] == 0 && acc[j].first + 1 > acc[i].first) acc.toMutableList().apply { this[i] = acc[j].first + 1 to j } else acc } }.let { dp -> dp.indices.maxByOrNull { dp[it].first }!!.let { maxIdx -> generateSequence(maxIdx) { i -> dp[i].second.takeIf { it >= 0 } }.map { sorted[it] }.toList().reversed() } } }}

