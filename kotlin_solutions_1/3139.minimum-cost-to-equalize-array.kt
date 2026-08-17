/*
 * @lc app=leetcode id=3139 lang=kotlin
 *
 * [3139] Minimum Cost to Equalize Array
 */

class Solution { fun minCostToEqualizeArray(nums: IntArray, c1: Int, c2: Int): Int = nums.map { it.toLong() }.let { a -> a.size.toLong().let { n -> a.maxOrNull()!!.let { mx -> a.minOrNull()!!.let { mn -> a.sum().let { sum -> if (c1 * 2 <= c2 || n <= 2L) (((mx * n - sum) % 1000000007 * c1) % 1000000007).toInt() else (if (n > 2L) maxOf(0L, (2L * (mx - mn) - (mx * n - sum) + n - 3) / (n - 2L)) else 0L).let { k -> listOf(mx, mx + k, mx + k + 1, mx + k + 2).minOf { t -> (t * n - sum).let { sumD -> (t - mn).let { maxD -> (sumD - maxD).let { remD -> if (maxD > remD) remD * c2 + (maxD - remD) * c1 else (sumD / 2) * c2 + (sumD % 2) * c1 } } } } % 1000000007 }.toInt() } } } } } }