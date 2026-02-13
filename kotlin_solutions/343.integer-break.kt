/*
 * @lc app=leetcode id=343 lang=kotlin
 *
 * [343] Integer Break
 */

class Solution {fun integerBreak(n: Int): Int = when { n <= 3 -> {n - 1} n % 3 == 0 -> {Math.pow(3.0, (n / 3).toDouble()).toInt()} n % 3 == 1 -> {Math.pow(3.0, (n / 3 - 1).toDouble()).toInt() * 4} else -> Math.pow(3.0, (n / 3).toDouble()).toInt() * 2 }}