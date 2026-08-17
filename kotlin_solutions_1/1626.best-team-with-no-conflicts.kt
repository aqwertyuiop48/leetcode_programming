/*
 * @lc app=leetcode id=1626 lang=kotlin
 *
 * [1626] Best Team With No Conflicts
 */

class Solution { fun bestTeamScore(scores: IntArray, ages: IntArray): Int = ages.indices.map { Pair(ages[it], scores[it]) }.sortedWith(compareBy({ it.first }, { it.second })).let { p -> IntArray(p.size).also { dp -> p.indices.forEach { i -> dp[i] = p[i].second + ((0 until i).filter { j -> p[j].second <= p[i].second }.maxOfOrNull { j -> dp[j] } ?: 0) } }.maxOrNull() ?: 0 } }