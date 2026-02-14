/*
 * @lc app=leetcode id=633 lang=kotlin
 *
 * [633] Sum of Square Numbers
 */

class Solution { fun judgeSquareSum(c: Int): Boolean = generateSequence(0L) { it + 1 }.takeWhile { it * it <= c }.any { a -> kotlin.math.sqrt((c - a * a).toDouble()).let { b -> b == b.toLong().toDouble() } } }

