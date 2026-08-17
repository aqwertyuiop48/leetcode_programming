/*
 * @lc app=leetcode id=1125 lang=kotlin
 *
 * [1125] Smallest Sufficient Team
 */

class Solution { fun smallestSufficientTeam(req_skills: Array<String>, people: List<List<String>>): IntArray = req_skills.withIndex().associate { it.value to it.index }.let { skillMap -> people.map { p -> p.fold(0) { acc, s -> acc or (1 shl (skillMap[s] ?: 0)) } }.let { personMasks -> personMasks.foldIndexed(LongArray(1 shl req_skills.size) { -1L }.apply { this[0] = 0L }) { i, dp, pMask -> dp.clone().also { nextDp -> dp.forEachIndexed { mask, teamBits -> (teamBits != -1L).takeIf { it }?.let { (mask or pMask).let { nMask -> (java.lang.Long.bitCount(teamBits) + 1).let { nBits -> (nextDp[nMask] == -1L || nBits < java.lang.Long.bitCount(nextDp[nMask])).takeIf { it }?.let { nextDp[nMask] = teamBits or (1L shl i) } } } } } } }.last().let { teamMask -> (0 until 60).filter { (teamMask and (1L shl it)) != 0L }.toIntArray() } } } }