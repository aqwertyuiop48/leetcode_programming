/*
 * @lc app=leetcode id=878 lang=kotlin
 *
 * [878] Nth Magical Number
 */

class Solution( private val MOD: Int = 1_000_000_007, private var left: Long = 1L, private var right: Long = 0L ) { fun nthMagicalNumber(n: Int, a: Int, b: Int): Int { return (generateSequence(1L to 1L * minOf(a, b) * n) { (left, right) -> if (left < right) ((left + (right - left) / 2).let { mid -> if (mid / a + mid / b - mid / lcm(a, b) >= n) left to mid else (mid + 1) to right }) else null }.last().first % MOD).toInt() } fun lcm(a: Int, b: Int): Long = 1L * a * b / gcd(a, b) fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b) }