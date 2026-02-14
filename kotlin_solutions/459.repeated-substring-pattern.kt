/*
 * @lc app=leetcode id=459 lang=kotlin
 *
 * [459] Repeated Substring Pattern
 */

class Solution { fun repeatedSubstringPattern(s: String): Boolean = (s + s).substring(1, s.length * 2 - 1).contains(s) }