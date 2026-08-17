/*
 * @lc app=leetcode id=2967 lang=kotlin
 *
 * [2967] Minimum Cost to Make Array Equalindromic
 */

class Solution { fun minimumCost(nums: IntArray): Long = nums.sorted().let { s -> s[s.size / 2].let { m -> listOf(generateSequence(m) { it - 1 }.first { "$it" == "$it".reversed() }, generateSequence(m) { it + 1 }.first { "$it" == "$it".reversed() }).minOf { p -> s.fold(0L) { acc, x -> acc + kotlin.math.abs(x.toLong() - p) } } } } }