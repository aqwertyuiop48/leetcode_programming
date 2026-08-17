/*
 * @lc app=leetcode id=3376 lang=java
 *
 * [3376] Minimum Time to Break Locks I
 */

fun findMinimumTime(strength: List<Int>, K: Int): Int = IntArray(1 shl strength.size) { 1000000000 }.apply { this[0] = 0 }.let { dp -> (0 until (1 shl strength.size)).forEach { m -> (strength.indices).filter { i -> (m and (1 shl i)) == 0 }.forEach { i -> (Integer.bitCount(m) * K + 1).let { x -> dp[m or (1 shl i)] = minOf(dp[m or (1 shl i)], dp[m] + (strength[i] + x - 1) / x) } } }.let { dp.last() } }