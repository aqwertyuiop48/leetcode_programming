/*
 * @lc app=leetcode id=1297 lang=kotlin
 *
 * [1297] Maximum Number of Occurrences of a Substring
 */

class Solution {
    fun maxFreq(s: String, maxLetters: Int, minSize: Int, maxSize: Int): Int =
        (0..s.length - minSize)
            .map { s.substring(it, it + minSize) }
            .filter { sub -> sub.toSet().size <= maxLetters }
            .groupingBy { it }
            .eachCount()
            .values
            .maxOrNull() ?: 0
}