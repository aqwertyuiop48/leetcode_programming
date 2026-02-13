/*
 * @lc app=leetcode id=214 lang=kotlin
 *
 * [214] Shortest Palindrome
 */

class Solution { fun shortestPalindrome(s: String): String = (s + "#" + s.reversed()).let { combined -> IntArray(combined.length).apply { (1 until combined.length).forEach { i -> this[i] = generateSequence(this[i - 1]) { j -> (j > 0 && combined[i] != combined[j]).takeIf { it }?.let { this[j - 1] } }.last().let { j -> if (combined[i] == combined[j]) j + 1 else 0 } } }.last().let { longestPrefix -> s.substring(longestPrefix).reversed() + s } } }
