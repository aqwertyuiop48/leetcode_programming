/*
 * @lc app=leetcode id=1655 lang=kotlin
 *
 * [1655] Distribute Repeating Integers
 */

class Solution { fun canDistribute(nums: IntArray, quantity: IntArray): Boolean = nums.toList().groupingBy { it }.eachCount().values.sortedDescending().take(10).let { counts -> IntArray(1 shl quantity.size) { m -> quantity.indices.filter { m and (1 shl it) != 0 }.sumOf { quantity[it] } }.let { sums -> counts.fold(BooleanArray(1 shl quantity.size).apply { this[0] = true }) { dp, c -> BooleanArray(dp.size) { mask -> dp[mask] || (0 until dp.size).any { sub -> (sub and mask) == sub && sums[sub] <= c && dp[mask xor sub] } } }[(1 shl quantity.size) - 1] } } }