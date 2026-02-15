/*
 * @lc app=leetcode id=873 lang=kotlin
 *
 * [873] Length of Longest Fibonacci Subsequence
 */

class Solution { fun lenLongestFibSubseq(arr: IntArray) = arr.withIndex().associate { it.value to it.index }.let { pos -> Array(arr.size) { IntArray(arr.size) { 2 } }.let { dp -> (1 until arr.size).forEach { j -> (0 until j).forEach { i -> pos[arr[j] - arr[i]]?.takeIf { it < i }?.let { k -> dp[i][j] = dp[k][i] + 1 } } } .run{dp.maxOf { it.maxOrNull()!! }.takeIf { it >= 3 } ?: 0} } } }

