/*
 * @lc app=leetcode id=500 lang=kotlin
 *
 * [500] Keyboard Row
 */

class Solution { fun findWords(words: Array<String>) = words.filter { word -> listOf("qwertyuiop", "asdfghjkl", "zxcvbnm").map { it.toList() }.any { it.containsAll(word.lowercase().toList()) } }.toTypedArray() }