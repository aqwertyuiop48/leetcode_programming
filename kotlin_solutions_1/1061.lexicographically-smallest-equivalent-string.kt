/*
 * @lc app=leetcode id=1061 lang=kotlin
 *
 * [1061] Lexicographically Smallest Equivalent String
 */

class Solution {
    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String = IntArray(26) { it }.also { p -> s1.zip(s2).forEach { (c1, c2) -> generateSequence(c1 - 'a') { p[it] }.first { p[it] == it }.let { r1 -> generateSequence(c2 - 'a') { p[it] }.first { p[it] == it }.let { r2 -> if (r1 < r2) p[r2] = r1 else p[r1] = r2 } } } }.let { p -> baseStr.map { c -> 'a' + generateSequence(c - 'a') { p[it] }.first { p[it] == it } }.joinToString("") }
}