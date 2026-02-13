/*
 * @lc app=leetcode id=127 lang=kotlin
 *
 * [127] Word Ladder
 */

class Solution { fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int = wordList.toHashSet().takeIf { endWord in it }?.let { dict -> generateSequence(setOf(beginWord) to 1) { (level, steps) -> dict.apply { removeAll(level) }.let { level.flatMap { word -> word.indices.flatMap { i -> ('a'..'z').mapNotNull { c -> word.toCharArray().apply { this[i] = c }.let { String(it) }.takeIf { it in dict } } } }.toSet().takeIf { it.isNotEmpty() }?.let { it to steps + 1 } } }.firstOrNull { (level, _) -> endWord in level }?.second } ?: 0 }
