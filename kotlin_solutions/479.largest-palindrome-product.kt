/*
 * @lc app=leetcode id=479 lang=kotlin
 *
 * [479] Largest Palindrome Product
 */

class Solution { fun largestPalindrome(n: Int): Int = if (n == 1) 9 else (10.0.pow(n) - 1).toLong().let { up -> (10.0.pow(n - 1).toLong()..up).reversed().asSequence().mapNotNull { num -> (num.toString() + num.toString().reversed()).toLong().let { value -> (up downTo 0).firstOrNull { i -> when { i * i < value || value / i > up -> {return@let null} value % i == 0L -> {true} else -> {false} } }?.let { (value % 1337).toInt() } } }.firstOrNull() ?: -1 } }
