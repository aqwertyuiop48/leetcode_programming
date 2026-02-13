/*
 * @lc app=leetcode id=151 lang=kotlin
 *
 * [151] Reverse Words in a String
 */

class Solution {fun reverseWords(s: String): String =s.trim().split("\\s+".toRegex()).reversed().joinToString(" ")}
