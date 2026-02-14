/*
 * @lc app=leetcode id=524 lang=kotlin
 *
 * [524] Longest Word in Dictionary through Deleting
 */

class Solution { fun findLongestWord(s: String, d: List<String>) = d.fold("") { longest, word -> word.fold(0 to 0) { (idxS, idxW), _ -> generateSequence(idxS) { it + 1 }.takeWhile { it < s.length }.firstOrNull { s[it] == word.getOrNull(idxW) }?.let { (it + 1) to (idxW + 1) } ?: (s.length to idxW) }.let { (_, idxW) -> when { idxW == word.length && (word.length > longest.length || (word.length == longest.length && word < longest)) -> {word} else -> longest } } } }