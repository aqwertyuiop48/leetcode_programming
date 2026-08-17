/*
 * @lc app=leetcode id=1390 lang=kotlin
 *
 * [1390] Four Divisors
 */

class Solution {
    fun sumFourDivisors(nums: IntArray): Int = nums.sumOf { n -> (1..Math.sqrt(n.toDouble()).toInt()).filter { n % it == 0 }.flatMap { if (it * it == n) listOf(it) else listOf(it, n / it) }.let { if (it.size == 4) it.sum() else 0 } }
}