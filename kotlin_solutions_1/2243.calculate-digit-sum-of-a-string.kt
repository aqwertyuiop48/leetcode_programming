/*
 * @lc app=leetcode id=2243 lang=kotlin
 *
 * [2243] Calculate Digit Sum of a String
 */

class Solution { fun digitSum(s: String, k: Int): String = generateSequence(s) { it.chunked(k).joinToString("") { chunk -> chunk.map { it - '0' }.sum().toString() } }.first { it.length <= k } }