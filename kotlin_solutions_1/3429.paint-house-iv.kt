/*
 * @lc app=leetcode id=3429 lang=kotlin
 *
 * [3429] Paint House IV
 */

class Solution {
    fun minCost(n: Int, cost: Array<IntArray>): Long = Array(3) { LongArray(3) }.let { dp -> (0 until n / 2).fold(dp) { cur, i -> Array(3) { LongArray(3) { 1000000000000000L } }.also { next -> (0..2).forEach { c1 -> (0..2).forEach { c2 -> if (c1 != c2) (0..2).forEach { pc1 -> (0..2).forEach { pc2 -> if (i == 0 || (c1 != pc1 && c2 != pc2)) next[c1][c2] = minOf(next[c1][c2], cur[pc1][pc2] + cost[i][c1] + cost[n - 1 - i][c2]) } } } } } }.let { finalDp -> finalDp.minOf { it.minOf { v -> v } } } }
}