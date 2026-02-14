/*
 * @lc app=leetcode id=647 lang=kotlin
 *
 * [647] Palindromic Substrings
 */

class Solution { fun countSubstrings(s: String): Int = s.indices.sumOf { i -> (0..minOf(i, s.lastIndex - i)).takeWhile { k -> s[i - k] == s[i + k] }.count() + (0..minOf(i, s.lastIndex - i - 1)).takeWhile { k -> s[i - k] == s[i + k + 1] }.count() } }
