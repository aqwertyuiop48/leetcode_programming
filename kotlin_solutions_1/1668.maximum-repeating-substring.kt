/*
 * @lc app=leetcode id=1668 lang=kotlin
 *
 * [1668] Maximum Repeating Substring
 */

class Solution { fun maxRepeating(sequence: String, word: String): Int = generateSequence(1) { it + 1 }.takeWhile { sequence.contains(word.repeat(it)) }.count() }