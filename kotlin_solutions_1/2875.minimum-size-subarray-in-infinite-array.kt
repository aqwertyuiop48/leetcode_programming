/*
 * @lc app=leetcode id=2875 lang=kotlin
 *
 * [2875] Minimum Size Subarray in Infinite Array
 */

class Solution { fun minSizeSubarray(nums: IntArray, target: Int): Int = nums.sumOf { it.toLong() }.let { S -> (target % S).toInt().let { rem -> ((target / S) * nums.size).let { base -> if (rem == 0) base.toInt() else HashMap<Long, Int>().apply { put(0L, -1) }.let { map -> LongArray(1).let { acc -> (0 until nums.size * 2).mapNotNull { i -> map.put((acc[0] + nums[i % nums.size]).also { acc[0] = it }, i).let { map[acc[0] - rem]?.let { prev -> i - prev } } }.minOrNull()?.let { (base + it).toInt() } ?: -1 } } } } } }