/*
 * @lc app=leetcode id=720 lang=kotlin
 *
 * [720] Longest Word in Dictionary
 */

class Solution { fun longestWord(words: Array<String>): String = words.toSet().let { set -> words.filter { w -> (1..w.length).all { set.contains(w.take(it)) } } .sortedWith(compareByDescending<String> { it.length }.thenBy { it }) .firstOrNull() ?: "" } }

