/*
 * @lc app=leetcode id=2942 lang=kotlin
 *
 * [2942] Find Words Containing Character
 */

class Solution { fun findWordsContaining(words: Array<String>, x: Char): List<Int> = words.indices.filter { words[it].contains(x) } }