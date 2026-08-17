/*
 * @lc app=leetcode id=1915 lang=kotlin
 *
 * [1915] Number of Wonderful Substrings
 */

class Solution {
    fun wonderfulSubstrings(word: String): Long = word.fold(Triple(LongArray(1024).apply { this[0] = 1L }, 0, 0L)) { (count, mask, ans), char -> (mask xor (1 shl (char - 'a'))).let { nextMask -> Triple(count.also { it[nextMask]++ }, nextMask, ans + count[nextMask] + (0..9).sumOf { i -> count[nextMask xor (1 shl i)] }) } }.third
}