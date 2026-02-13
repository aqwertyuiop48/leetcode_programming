/*
 * @lc app=leetcode id=312 lang=kotlin
 *
 * [312] Burst Balloons
 */

class Solution(private val dp: Array<IntArray> = Array(301) { IntArray(301) { -1 } }) {fun maxCoins(nums: IntArray): Int = solve(nums.toMutableList().apply { add(1).run{add(0, 1)} }.toIntArray(), 1, nums.size) fun solve(a: IntArray, i: Int, j: Int): Int = if (i > j) 0 else if (dp[i][j] != -1) dp[i][j] else (i..j).maxOf { indx -> a[i - 1] * a[indx] * a[j + 1] + solve(a, i, indx - 1) + solve(a, indx + 1, j) }.also { dp[i][j] = it }}
