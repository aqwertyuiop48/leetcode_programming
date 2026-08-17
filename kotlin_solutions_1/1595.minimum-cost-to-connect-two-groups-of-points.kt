/*
 * @lc app=leetcode id=1595 lang=kotlin
 *
 * [1595] Minimum Cost to Connect Two Groups of Points
 */

class Solution {
    fun connectTwoGroups(cost: List<List<Int>>): Int = cost.fold(IntArray(1 shl cost[0].size) { if (it == 0) 0 else 1e8.toInt() }) { dp, row -> IntArray(1 shl cost[0].size) { 1e8.toInt() }.also { ndp -> dp.indices.forEach { m -> if (dp[m] < 1e7.toInt()) row.indices.forEach { j -> ndp[m or (1 shl j)] = minOf(ndp[m or (1 shl j)], dp[m] + row[j]) } } }.also { ndp -> ndp.indices.forEach { m -> if (ndp[m] < 1e7.toInt()) row.indices.forEach { j -> ndp[m or (1 shl j)] = minOf(ndp[m or (1 shl j)], ndp[m] + row[j]) } } } }.last()
}