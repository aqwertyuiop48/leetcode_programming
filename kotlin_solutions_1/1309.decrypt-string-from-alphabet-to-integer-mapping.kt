/*
 * @lc app=leetcode id=1309 lang=kotlin
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 */
class Solution { fun freqAlphabets(s: String): String = Regex("""\d{2}#|\d""").findAll(s).map { ('a' + it.value.removeSuffix("#").toInt() - 1) }.joinToString("") }