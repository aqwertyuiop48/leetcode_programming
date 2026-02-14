/*
 * @lc app=leetcode id=686 lang=kotlin
 *
 * [686] Repeated String Match
 */

class Solution { fun repeatedStringMatch(a: String, b: String): Int = generateSequence(1) { it + 1 }.first { a.repeat(it).length >= b.length + a.length }.let { max -> (1..max).firstOrNull { b in a.repeat(it) } ?: -1 } }

