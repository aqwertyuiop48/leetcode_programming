/*
 * @lc app=leetcode id=564 lang=kotlin
 *
 * [564] Find the Closest Palindrome
 */

class Solution { fun nearestPalindromic(n: String) = n.let { num -> listOf( Math.pow(10.0, num.length.toDouble()).toLong() + 1, Math.pow(10.0, (num.length - 1).toDouble()).toLong() - 1 ).plus( num.substring(0, (num.length + 1) / 2).toLong().let { prefixNum -> (-1..1).map { delta -> (prefixNum + delta).toString().let { newPrefix -> if (num.length % 2 == 0) newPrefix + newPrefix.reversed() else newPrefix + newPrefix.dropLast(1).reversed() }.toLong() } } ).filter { it != num.toLong() }.minWithOrNull(compareBy<Long> { kotlin.math.abs(it - num.toLong()) }.thenBy { it }).toString() } }
