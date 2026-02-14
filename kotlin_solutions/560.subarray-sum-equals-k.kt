/*
 * @lc app=leetcode id=560 lang=kotlin
 *
 * [560] Subarray Sum Equals K
 */

class Solution { fun subarraySum(nums: IntArray, k: Int): Int = nums.fold(Pair(0 to mutableMapOf(0 to 1), 0)) { (acc, res), n -> acc.let { (sum, map) -> (sum + n).let { newSum -> (res + (map[newSum - k] ?: 0)).let { newRes -> map.also { it[newSum] = it.getOrDefault(newSum, 0) + 1 } .let { (newSum to it) to newRes } } } } }.second }

