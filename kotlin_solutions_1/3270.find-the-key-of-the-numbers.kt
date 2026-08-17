/*
 * @lc app=leetcode id=3270 lang=java
 *
 * [3270] Find the Key of the Numbers
 */

class Solution {
    fun generateKey(num1: Int, num2: Int, num3: Int): Int = listOf(1, 10, 100, 1000).sumOf { p -> minOf(num1 / p % 10, minOf(num2 / p % 10, num3 / p % 10)) * p }
}