/*
 * @lc app=leetcode id=745 lang=kotlin
 *
 * [745] Prefix and Suffix Search
 */

class WordFilter(words: Array<String>, val map: MutableMap<String, Int> = mutableMapOf<String, Int>().apply { words.indices.forEach { i -> (0..words[i].length).forEach { j -> (0..words[i].length).forEach { k -> this[words[i].take(j) + "#" + words[i].takeLast(k)] = i }}} }) { fun f(prefix: String, suffix: String): Int = map[prefix + "#" + suffix] ?: -1 }
