/*
 * @lc app=leetcode id=792 lang=kotlin
 *
 * [792] Number of Matching Subsequences
 */

class Solution { fun numMatchingSubseq(s: String, words: Array<String>): Int = words.count { word -> word.fold(0) { sIndex, char -> s.indexOf(char, sIndex).takeIf { it >= 0 }?.plus(1) ?: return@count false }.let { true } } }