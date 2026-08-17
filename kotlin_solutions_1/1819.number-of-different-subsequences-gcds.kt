/*
 * @lc app=leetcode id=1819 lang=kotlin
 *
 * [1819] Number of Different Subsequences GCDs
 */

class Solution { fun countDifferentSubsequenceGCDs(nums: IntArray): Int = (nums.maxOrNull() ?: 0).let { max -> BooleanArray(max + 1).apply { nums.forEach { this[it] = true } }.let { has -> Array<((Int, Int) -> Int)?>(1) { null }.apply { this[0] = { a, b -> if (a == 0) b else this[0]!!(b % a, a) } }[0]!!.let { gcd -> (1..max).count { i -> (i..max step i).filter { has[it] }.fold(0) { g, x -> gcd(g, x) } == i } } } } }