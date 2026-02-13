/*
 * @lc app=leetcode id=219 lang=kotlin
 *
 * [219] Contains Duplicate II
 */

class Solution {fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean =nums.withIndex().groupBy { it.value }.any { (_, indices) -> indices.zipWithNext { a, b -> b.index - a.index }.any { it <= k } }}