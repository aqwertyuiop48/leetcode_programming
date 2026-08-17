/*
 * @lc app=leetcode id=1332 lang=kotlin
 *
 * [1332] Remove Palindromic Subsequences
 */

class Solution { fun removePalindromeSub(s: String): Int = if (s.isEmpty()) 0 else if (s == s.reversed()) 1 else 2 }