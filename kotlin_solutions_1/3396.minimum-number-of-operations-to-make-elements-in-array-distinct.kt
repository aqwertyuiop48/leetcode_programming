/*
 * @lc app=leetcode id=3396 lang=java
 *
 * [3396] Minimum Number of Operations to Make Elements in Array Distinct
 */

fun minimumOperations(nums: IntArray): Int = (nums.size - 1 downTo 0).firstOrNull { i -> nums.slice(i until nums.size).let { it.size != it.toSet().size } }.let { if (it == null) 0 else (it / 3) + 1 }