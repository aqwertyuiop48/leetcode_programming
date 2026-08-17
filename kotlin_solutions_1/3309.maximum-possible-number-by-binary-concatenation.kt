/*
 * @lc app=leetcode id=3309 lang=java
 *
 * [3309] Maximum Possible Number by Binary Concatenation
 */

fun maxGoodNumber(nums: IntArray): Int = listOf(intArrayOf(0, 1, 2), intArrayOf(0, 2, 1), intArrayOf(1, 0, 2), intArrayOf(1, 2, 0), intArrayOf(2, 0, 1), intArrayOf(2, 1, 0)).map { p -> p.map { nums[it].toString(2) }.joinToString("").toInt(2) }.maxOrNull()!!