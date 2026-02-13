/*
 * @lc app=leetcode id=187 lang=kotlin
 *
 * [187] Repeated DNA Sequences
 */

class Solution { fun findRepeatedDnaSequences(s: String): List<String> = (0..s.length - 10).map { s.substring(it, it + 10) } .groupingBy { it } .eachCount() .filter { it.value > 1 } .keys .toList() }

