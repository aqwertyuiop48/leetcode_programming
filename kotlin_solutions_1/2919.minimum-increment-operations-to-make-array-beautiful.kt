/*
 * @lc app=leetcode id=2919 lang=kotlin
 *
 * [2919] Minimum Increment Operations to Make Array Beautiful
 */

class Solution {
    fun minIncrementOperations(nums: IntArray, k: Int): Long = nums.fold(longArrayOf(0L, 0L, 0L)) { dp, x -> longArrayOf(dp[1], dp[2], minOf(dp[0], dp[1], dp[2]) + maxOf(0L, k.toLong() - x)) }.let { dp -> minOf(dp[0], dp[1], dp[2]) }
}