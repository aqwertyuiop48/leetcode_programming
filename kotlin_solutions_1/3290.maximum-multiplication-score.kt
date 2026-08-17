/*
 * @lc app=leetcode id=3290 lang=java
 *
 * [3290] Maximum Multiplication Score
 */

fun maxScore(a: IntArray, b: IntArray): Long = LongArray(4) { -1_000_000_000_000_000L }.let { dp -> b.fold(dp) { acc, bi -> acc.apply { acc[3] = Math.max(acc[3], acc[2] + a[3].toLong() * bi) }.apply { acc[2] = Math.max(acc[2], acc[1] + a[2].toLong() * bi) }.apply { acc[1] = Math.max(acc[1], acc[0] + a[1].toLong() * bi) }.apply { acc[0] = Math.max(acc[0], a[0].toLong() * bi) } }.let { it[3] } }