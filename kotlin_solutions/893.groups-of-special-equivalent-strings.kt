/*
 * @lc app=leetcode id=893 lang=kotlin
 *
 * [893] Groups of Special-Equivalent Strings
 */

class Solution { fun numSpecialEquivGroups(words: Array<String>) = words.map { word -> word.filterIndexed { i, _ -> i % 2 == 0 }.toList().sorted().joinToString("") + "|" + word.filterIndexed { i, _ -> i % 2 == 1 }.toList().sorted().joinToString("") }.toSet().size }
