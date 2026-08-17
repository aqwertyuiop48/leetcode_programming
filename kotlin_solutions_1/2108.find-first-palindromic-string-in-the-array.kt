/* @lc app=leetcode id=2108 lang=kotlin */
class Solution { fun firstPalindrome(words: Array<String>): String = words.firstOrNull { it == it.reversed() } ?: "" }