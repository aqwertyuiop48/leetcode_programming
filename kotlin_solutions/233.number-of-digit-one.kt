/*
 * @lc app=leetcode id=233 lang=kotlin
 *
 * [233] Number of Digit One
 */

class Solution {fun countDigitOne(n: Int): Int = generateSequence(1) { it * 10 }.takeWhile { it <= n }.fold(0) { ans, pow10 -> ans + (n / (pow10 * 10)) * pow10 + if (n % (pow10 * 10) >= pow10) minOf(n % (pow10 * 10) - pow10 + 1, pow10) else 0 }}
