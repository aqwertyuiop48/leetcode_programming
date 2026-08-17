/*
 * @lc app=leetcode id=1915 lang=kotlin
 *
 * [1915] Number of Wonderful Substrings
 */

class Solution { fun wonderfulSubstrings(word: String): Long = word.fold(Triple(LongArray(1024).also { it[0] = 1L }, 0, 0L)) { state, char -> (state.second xor (1 shl (char - 'a'))).let { mask -> state.first[mask].let { prior -> Triple(state.first.also { it[mask]++ }, mask, state.third + prior + (0..9).sumOf { bit -> state.first[mask xor (1 shl bit)] }) } } }.third }