/*
 * @lc app=leetcode id=3444 lang=java
 *
 * [3444] Minimum Increments for Target Multiples in an Array
 */
class Solution { fun minimumIncrements(nums: IntArray, target: IntArray): Int = (1 until (1 shl target.size)).map { mask -> target.indices.filter { (mask shr it) and 1 == 1 }.map { target[it].toLong() }.reduce { a, b -> (a * b) / java.math.BigInteger.valueOf(a).gcd(java.math.BigInteger.valueOf(b)).toLong() } }.let { lcms -> nums.fold(LongArray(1 shl target.size) { 1e15.toLong() }.also { it[0] = 0 }) { dp, x -> LongArray(1 shl target.size) { dp[it] }.also { next -> lcms.forEachIndexed { i, lcm -> (i + 1).let { mask -> (lcm - (x % lcm)).let { if (it == lcm) 0L else it }.let { cost -> (0 until (1 shl target.size)).forEach { prev -> next[prev or mask] = Math.min(next[prev or mask], dp[prev] + cost) } } } } } } }.last().toInt() } }