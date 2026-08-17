/*
 * @lc app=leetcode id=3152 lang=kotlin
 *
 * [3152] Special Array II
 */

class Solution { fun isArraySpecial(nums: IntArray, queries: Array<IntArray>): BooleanArray = IntArray(nums.size).apply { (1 until nums.size).forEach { i -> this[i] = this[i - 1] + if (nums[i] % 2 == nums[i - 1] % 2) 1 else 0 } }.let { p -> BooleanArray(queries.size) { i -> p[queries[i][1]] - p[queries[i][0]] == 0 } } }