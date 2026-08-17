/*
 * @lc app=leetcode id=2188 lang=kotlin
 *
 * [2188] Minimum Time to Finish the Race
 */
class Solution { fun minimumFinishTime(tires: Array<IntArray>, changeTime: Int, numLaps: Int): Int = LongArray(20) { 1000000000000000L }.let { best -> tires.forEach { tire -> longArrayOf(0L, tire[0].toLong()).let { state -> (1 until 20).takeWhile { state[1] <= tire[0] + changeTime }.forEach { j -> state.set(0, state[0] + state[1]).also { best.set(j, minOf(best[j], state[0])) }.also { state.set(1, state[1] * tire[1]) } } } }.run { LongArray(numLaps + 1).let { dp -> dp.set(0, -changeTime.toLong()).run { (1..numLaps).forEach { i -> dp.set(i, 1000000000000000L).run { (1..minOf(19, i)).forEach { j -> dp.set(i, minOf(dp[i], dp[i - j] + best[j] + changeTime)) } } } }.run { dp[numLaps].toInt() } } } }