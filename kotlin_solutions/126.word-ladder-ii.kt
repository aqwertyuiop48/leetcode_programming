/*
 * @lc app=leetcode id=126 lang=kotlin
 *
 * [126] Word Ladder II
 */

class Solution {fun findLadders(beginWord: String, endWord: String, wordList: List<String>): List<List<String>> = object { lateinit var shortestPaths: (String, Map<String, List<String>>, Map<String, Int>) -> List<List<String>> }.apply { shortestPaths = { node, successors, distances -> if (distances[node] == 0) listOf(listOf(node)) else successors[node]?.filter { distances[it] == distances[node]!! - 1 }?.flatMap { s -> shortestPaths(s, successors, distances).map { listOf(node) + it } } ?: emptyList() } }.run { (listOf(beginWord) + wordList).takeIf { endWord in it }?.let { words -> words.associateWith { src -> wordList.filter { dst -> ((0..<min(src.length, dst.length)).count { src[it] != dst[it] } + abs(src.length - dst.length)) == 1 } }.let { successors -> successors.keys.associateWith { key -> if (key == endWord) 0 else words.size + 1 }.toMutableMap().apply { generateSequence(true) { updated -> updated.takeIf { it }?.let { successors.mapNotNull { (k, v) -> v.minOfOrNull { this[it]!! + 1 }?.takeIf { dist -> dist < this[k]!! }?.also { dist -> this[k] = dist } }.isNotEmpty() } }.last() }.let { distances -> shortestPaths(beginWord, successors, distances) } } } ?: emptyList() }}
