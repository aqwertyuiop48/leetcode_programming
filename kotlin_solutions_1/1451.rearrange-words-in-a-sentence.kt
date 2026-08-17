/*
 * @lc app=leetcode id=1451 lang=kotlin
 *
 * [1451] Rearrange Words in a Sentence
 */

class Solution { fun arrangeWords(text: String): String = text.lowercase().split(" ").sortedBy { it.length }.joinToString(" ").replaceFirstChar { it.uppercase() } }