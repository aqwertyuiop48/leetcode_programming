/*
 * @lc app=leetcode id=78 lang=kotlin
 *
 * [78] Subsets
 */

class Solution {fun subsets(nums: IntArray): List<List<Int>> = nums.fold(listOf(listOf<Int>())) { acc, num -> acc + acc.map { it + num } }}
