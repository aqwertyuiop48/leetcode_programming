/* @lc app=leetcode id=1961 lang=kotlin */
class Solution { fun isPrefixString(s: String, words: Array<String>): Boolean = (1..words.size).map { words.take(it).joinToString("") }.any { it == s } }