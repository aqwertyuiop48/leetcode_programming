/*
 * @lc app=leetcode id=357 lang=kotlin
 *
 * [357] Count Numbers with Unique Digits
 */

class Solution { fun countNumbersWithUniqueDigits(n: Int): Int = when (n) { 0 -> {1} else -> (2..minOf(n, 10)).fold(9 to 10) { (term, sum), i -> term * (11 - i) to sum + term * (11 - i) }.second } }
