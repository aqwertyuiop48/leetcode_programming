/*
 * @lc app=leetcode id=2442 lang=kotlin
 *
 * [2442] Count Number of Distinct Integers After Reverse Operations
 */
class Solution { fun countDistinctIntegers(nums: IntArray): Int = nums.flatMap { listOf(it, it.toString().reversed().toInt()) }.distinct().size }