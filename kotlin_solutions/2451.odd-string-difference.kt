/*
 * @lc app=leetcode id=2451 lang=kotlin
 *
 * [2451] Odd String Difference
 */

class Solution { fun oddString(words: Array<String>): String = words.map { word -> word.windowed(2).joinToString("") { (it[0] - it[1]).toString() } to word }.groupBy { it.first } .entries .firstOrNull { it.value.size == 1 } ?.value ?.first() ?.second ?: "" }
