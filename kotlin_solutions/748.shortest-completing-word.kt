/*
 * @lc app=leetcode id=748 lang=kotlin
 *
 * [748] Shortest Completing Word
 */

class Solution { fun shortestCompletingWord(licensePlate: String, words: Array<String>): String = licensePlate.filter { it.isLetter() }.lowercase().groupingBy { it }.eachCount().let { need -> words.filter { word -> word.lowercase().groupingBy { it }.eachCount().let { has -> need.all { (has[it.key] ?: 0) >= it.value } } } .minByOrNull { it.length }!! } }
