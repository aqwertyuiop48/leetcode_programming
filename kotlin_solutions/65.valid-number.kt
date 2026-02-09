/*
 * @lc app=leetcode id=65 lang=kotlin
 *
 * [65] Valid Number
 */

class Solution { fun isNumber(s: String) = listOf("Infinity", "f", "D").none(s::contains) && s.toDoubleOrNull() != null }

