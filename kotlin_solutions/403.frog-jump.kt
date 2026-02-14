/*
 * @lc app=leetcode id=403 lang=kotlin
 *
 * [403] Frog Jump
 */

class Solution { fun canCross(stones: IntArray): Boolean = stones.indices.associateWith { mutableSetOf<Int>() }.apply { this[0]!!.add(0) }.let { dp -> stones.indices.forEach { i -> dp[i]!!.forEach { k -> listOf(k - 1, k, k + 1).forEach { next -> if (next > 0) stones.indexOf(stones[i] + next).takeIf { it > i }?.let { dp[it]!!.add(next) } } } }.let { dp[stones.lastIndex]!!.isNotEmpty() } } }

