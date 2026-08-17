/* @lc app=leetcode id=1967 lang=kotlin */
class Solution { fun numOfStrings(patterns: Array<String>, word: String): Int = patterns.count { word.contains(it) } }