/*
 * @lc app=leetcode id=821 lang=kotlin
 *
 * [821] Shortest Distance to a Character
 */

class Solution { fun shortestToChar(s: String, c: Char): IntArray = s.indices.map { i -> s.indices.filter { s[it] == c }.minOfOrNull { kotlin.math.abs(it - i) } ?: 0 }.toIntArray()}