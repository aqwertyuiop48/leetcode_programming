/*
 * @lc app=leetcode id=1178 lang=kotlin
 *
 * [1178] Number of Valid Words for Each Puzzle
 */

class Solution { fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> = mutableMapOf<Int, Int>().also { map -> words.forEach { w -> w.fold(0) { m, c -> m or (1 shl (c - 'a')) }.let { m -> map[m] = (map[m] ?: 0) + 1 } } }.let { map -> puzzles.map { p -> (1 shl (p[0] - 'a')).let { first -> p.fold(0) { m, c -> m or (1 shl (c - 'a')) }.let { mask -> generateSequence(mask) { if (it == 0) null else (it - 1) and mask }.sumOf { sub -> map[sub or first] ?: 0 } } } } } }