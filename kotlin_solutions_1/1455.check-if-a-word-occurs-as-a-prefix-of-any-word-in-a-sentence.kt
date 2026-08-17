/*
 * @lc app=leetcode id=1455 lang=kotlin
 *
 * [1455] Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */

class Solution { fun isPrefixOfWord(sentence: String, searchWord: String): Int = sentence.split(" ").indexOfFirst { it.startsWith(searchWord) }.let { if (it >= 0) it + 1 else -1 } }