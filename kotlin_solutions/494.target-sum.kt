/*
 * @lc app=leetcode id=494 lang=kotlin
 *
 * [494] Target Sum
 */

class Solution { fun findTargetSumWays(nums: IntArray, target: Int): Int = nums.fold(mapOf(0 to 1)) { dp, num -> mutableMapOf<Int, Int>().apply { dp.forEach { (sum, cnt) -> put(sum + num, getOrDefault(sum + num, 0) + cnt) .also{put(sum - num, getOrDefault(sum - num, 0) + cnt)} } } }.getOrDefault(target, 0) }