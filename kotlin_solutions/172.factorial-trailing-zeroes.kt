/*
 * @lc app=leetcode id=172 lang=kotlin
 *
 * [172] Factorial Trailing Zeroes
 */

class Solution {fun trailingZeroes(n: Int): Int =generateSequence(n / 5) { it / 5 }.takeWhile { it > 0 }.sum()}