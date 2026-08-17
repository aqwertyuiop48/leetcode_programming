/*
 * @lc app=leetcode id=3300 lang=java
 *
 * [3300] Minimum Element After Replacement With Digit Sum
 */

fun minElement(nums: IntArray): Int = nums.map { it.toString().sumOf { it - '0' } }.minOrNull() ?: 0