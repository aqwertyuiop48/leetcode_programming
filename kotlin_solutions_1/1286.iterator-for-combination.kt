/*
 * @lc app=leetcode id=1286 lang=kotlin
 *
 * [1286] Iterator for Combination
 */

class CombinationIterator(characters: String, combinationLength: Int) : Iterator<String> by ((0 until (1 shl characters.length)).filter { Integer.bitCount(it) == combinationLength }.map { mask -> characters.indices.filter { index -> mask and (1 shl (characters.length - 1 - index)) != 0 }.joinToString("") { characters[it].toString() } }.sorted().iterator())