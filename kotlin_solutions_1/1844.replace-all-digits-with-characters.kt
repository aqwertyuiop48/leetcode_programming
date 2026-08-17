/*
 * @lc app=leetcode id=1844 lang=kotlin
 *
 * [1844] Replace All Digits with Characters
 */
class Solution { fun replaceDigits(s: String): String = s.indices.map { i -> if (i % 2 == 0) s[i] else (s[i - 1].code + (s[i] - '0')).toChar() }.joinToString("") }