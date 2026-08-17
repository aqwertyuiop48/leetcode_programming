/*
 * @lc app=leetcode id=3209 lang=kotlin
 *
 * [3209] Number of Subarrays With AND Value of K
 */
class Solution { fun countSubarrays(nums: IntArray, k: Int): Long = nums.fold(0L to mapOf<Int, Long>()) { (ans, map), x -> map.entries.groupingBy { it.key and x }.fold(0L) { acc, e -> acc + e.value }.toMutableMap().also { it[x] = (it[x] ?: 0L) + 1L }.let { nextMap -> (ans + (nextMap[k] ?: 0L)) to nextMap } }.first }