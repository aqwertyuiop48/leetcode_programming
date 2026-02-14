/*
 * @lc app=leetcode id=409 lang=kotlin
 *
 * [409] Longest Palindrome
 */

class Solution {fun longestPalindrome(s: String): Int = s.groupingBy { it }.eachCount().values.sumOf { it / 2 * 2 }.let { it + if (s.groupingBy { it }.eachCount().any { it.value % 2 == 1 }) 1 else 0 }}

