/*
 * @lc app=leetcode id=676 lang=kotlin
 *
 * [676] Implement Magic Dictionary
 */

class MagicDictionary(private var words: List<String> = emptyList()) { fun buildDict(dictionary: Array<String>) = run { words = dictionary.toList() } fun search(searchWord: String): Boolean = words.any { it.length == searchWord.length && it.indices.count { i -> it[i] != searchWord[i] } == 1 } }
