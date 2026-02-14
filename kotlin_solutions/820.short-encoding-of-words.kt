/*
 * @lc app=leetcode id=820 lang=kotlin
 *
 * [820] Short Encoding of Words
 */

class Solution { fun minimumLengthEncoding(words: Array<String>): Int = words.distinct().sortedByDescending { it.length }.fold(mutableSetOf<String>()) { set, word -> set.apply { if (none { it.endsWith(word) }) add(word) } }.sumOf { it.length + 1 } }
