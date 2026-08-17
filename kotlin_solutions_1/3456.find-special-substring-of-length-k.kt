/*
 * @lc app=leetcode id=3456 lang=java
 *
 * [3456] Find Special Substring of Length K
 */
class Solution { fun hasSpecialSubstring(s: String, k: Int): Boolean = (0..s.length - k).any { i -> s.substring(i, i + k).all { it == s[i] } && (i == 0 || s[i - 1] != s[i]) && (i + k == s.length || s[i + k] != s[i]) } }