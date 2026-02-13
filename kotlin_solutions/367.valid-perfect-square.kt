/*
 * @lc app=leetcode id=367 lang=kotlin
 *
 * [367] Valid Perfect Square
 */

class Solution {fun isPerfectSquare(num: Int): Boolean = generateSequence(1L) { it + 1 }.first { it * it >= num }.let { it * it == num.toLong() }}
