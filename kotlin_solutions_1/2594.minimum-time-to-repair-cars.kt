/* @lc app=leetcode id=2594 lang=kotlin */
class Solution {
    fun repairCars(ranks: IntArray, cars: Int): Long = longArrayOf(1L, 1L * (ranks.minOrNull() ?: 100).toLong() * cars.toLong() * cars.toLong()).let { r -> generateSequence(longArrayOf(r[0], r[1], r[1])) { s -> if (s[0] <= s[1]) (s[0] + (s[1] - s[0]) / 2).let { m -> if (ranks.sumOf { kotlin.math.sqrt(m.toDouble() / it).toLong() } >= cars) longArrayOf(s[0], m - 1, m) else longArrayOf(m + 1, s[1], s[2]) } else null }.last()[2] }
}