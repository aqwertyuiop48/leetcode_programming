/*
 * @lc app=leetcode id=3366 lang=java
 *
 * [3366] Minimum Array Sum
 */

fun minArraySum(nums: IntArray, k: Int, op1: Int, op2: Int): Int = nums.fold(Array(op1 + 1) { IntArray(op2 + 1) { 0 } }) { dp, n -> Array(op1 + 1) { i -> IntArray(op2 + 1) { j -> minOf(dp[i][j] + n, if (i > 0) dp[i - 1][j] + (n + 1) / 2 else 1000000000, if (j > 0 && n >= k) dp[i][j - 1] + n - k else 1000000000, if (i > 0 && j > 0) minOf(if ((n + 1) / 2 >= k) dp[i - 1][j - 1] + (n + 1) / 2 - k else 1000000000, if (n >= k) dp[i - 1][j - 1] + (n - k + 1) / 2 else 1000000000) else 1000000000) } } }.let { dp -> dp.minOf { it.minOf { v -> v } } }