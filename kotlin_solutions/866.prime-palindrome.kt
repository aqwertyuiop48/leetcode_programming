/*
 * @lc app=leetcode id=866 lang=kotlin
 *
 * [866] Prime Palindrome
 */

class Solution { fun primePalindrome(n: Int): Int = when { n==1 -> {2} n in 10000000..99999999 -> {primePalindrome(100000000)} else -> generateSequence(n) { it + 1 }.first { num -> num.toString().let { s -> s == s.reversed() && (num < 2 || (2..kotlin.math.sqrt(num.toDouble()).toInt()).none { num % it == 0 }) } } } }

