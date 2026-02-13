/*
 * @lc app=leetcode id=125 lang=kotlin
 *
 * [125] Valid Palindrome
 */

class Solution {fun isPalindrome(s: String): Boolean =s.filter { it.isLetterOrDigit() }.lowercase().let { it == it.reversed() }}

