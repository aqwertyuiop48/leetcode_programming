/*
 * @lc app=leetcode id=3438 lang=kotlin
 *
 * [3438] Find Valid Pair of Adjacent Digits in String
 */

class Solution {
    fun findValidPair(s: String): String = (0 until s.length - 1).firstOrNull { i -> s[i] != s[i + 1] && s.count { it == s[i] } == s[i] - '0' && s.count { it == s[i + 1] } == s[i + 1] - '0' }?.let { "${s[it]}${s[it + 1]}" } ?: ""
}