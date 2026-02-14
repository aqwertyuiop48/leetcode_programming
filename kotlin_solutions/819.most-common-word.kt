/*
 * @lc app=leetcode id=819 lang=kotlin
 *
 * [819] Most Common Word
 */

class Solution { fun mostCommonWord(paragraph: String, banned: Array<String>): String = banned.toSet().let { b -> paragraph.lowercase().split(Regex("\\W+")).filter { it.isNotEmpty() && it !in b }.groupingBy { it }.eachCount().maxByOrNull { it.value }!!.key } }