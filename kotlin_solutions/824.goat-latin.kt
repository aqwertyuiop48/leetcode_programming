/*
 * @lc app=leetcode id=824 lang=kotlin
 *
 * [824] Goat Latin
 */

class Solution { fun toGoatLatin(sentence: String): String = sentence.split(" ").mapIndexed { i, w -> (if (w[0].lowercaseChar() in "aeiou") w else w.drop(1) + w[0]) + "ma" + "a".repeat(i + 1) }.joinToString(" ") }