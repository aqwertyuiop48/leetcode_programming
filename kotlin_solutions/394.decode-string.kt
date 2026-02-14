/*
 * @lc app=leetcode id=394 lang=kotlin
 *
 * [394] Decode String
 */

class Solution { companion object { private val pattern = Regex("""(\d+)\[([a-z]+)\]""") } fun decodeString(s: String): String = generateSequence(s) { s -> pattern.find(s)?.let { match -> match.destructured.let { (k, encodedString) -> s.replace(match.value, encodedString.repeat(k.toInt())) } } }.last() }

