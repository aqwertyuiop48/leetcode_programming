/*
 * @lc app=leetcode id=1335 lang=kotlin
 *
 * [1335] Minimum Difficulty of a Job Schedule
 */

class Solution { fun minDifficulty(jobDifficulty: IntArray, d: Int): Int = if (jobDifficulty.size < d) -1 else (1..d).fold(IntArray(jobDifficulty.size + 1) { 1000000 }.also { it[0] = 0 }) { prevDp, day -> IntArray(jobDifficulty.size + 1) { 1000000 }.also { newDp -> (day..jobDifficulty.size).forEach { i -> (i - 1 downTo day - 1).fold(0) { maxDiff, j -> maxOf(maxDiff, jobDifficulty[j]).also { curMax -> newDp[i] = minOf(newDp[i], prevDp[j] + curMax) } } } } }[jobDifficulty.size] }