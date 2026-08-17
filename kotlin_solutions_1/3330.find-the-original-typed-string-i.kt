/*
 * @lc app=leetcode id=3330 lang=java
 *
 * [3330] Find the Original Typed String I
 */
fun possibleStringCount(word: String): Int = (1 until word.length).count { word[it] == word[it - 1] }.let { it + 1 }