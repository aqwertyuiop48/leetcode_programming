/*
 * @lc app=leetcode id=648 lang=kotlin
 *
 * [648] Replace Words
 */

class Solution { fun replaceWords(dictionary: List<String>, sentence: String): String = sentence.split(" ").joinToString(" ") { word -> dictionary.filter { word.startsWith(it) }.minByOrNull { it.length } ?: word } }
