/* @lc app=leetcode id=2185 lang=kotlin */
class Solution { fun prefixCount(words: Array<String>, pref: String): Int = words.count { it.startsWith(pref) } }