/*
 * @lc app=leetcode id=466 lang=kotlin
 *
 * [466] Count The Repetitions
 */

class Solution( val kToRepeatCount: MutableMap<Int, Int> = mutableMapOf(0 to 0), val nextIndexToK: MutableMap<Int, Int> = mutableMapOf(0 to 0) ) { fun getMaxRepetitions(s1: String, n1: Int, s2: String, n2: Int): Int = (1..n1).fold(0 to 0) { (j, repeatCount), k -> s1.fold(j to repeatCount) { (idx, count), c -> if (c == s2[idx]) { (idx + 1).let { newIdx -> if (newIdx == s2.length) 0 to count + 1 else newIdx to count } } else idx to count }.also { (newJ, newRepeatCount) -> nextIndexToK[newJ]?.let { start -> return kToRepeatCount[start]!!.let { prefixCount -> (prefixCount + (n1 - start) / (k - start) * (newRepeatCount - prefixCount) + kToRepeatCount[start + (n1 - start) % (k - start)]!! - prefixCount ) / n2 } } ?: run { kToRepeatCount[k] = newRepeatCount .also{nextIndexToK[newJ] = k} } } }.let { kToRepeatCount[n1]!! / n2 } }