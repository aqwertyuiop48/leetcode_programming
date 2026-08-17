/*
 * @lc app=leetcode id=1658 lang=kotlin
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

class Solution { fun minOperations(nums: IntArray, x: Int): Int = (nums.sum() - x).let { target -> if (target == 0) nums.size else if (target < 0) -1 else nums.foldIndexed(Triple(0, -1, mutableMapOf(0 to -1))) { i, (sum, maxLen, map), num -> (sum + num).also { map.getOrPut(it) { i } }.let { s -> Triple(s, if (map.containsKey(s - target)) maxOf(maxLen, i - map[s - target]!!) else maxLen, map) } }.second.let { if (it == -1) -1 else nums.size - it } } }