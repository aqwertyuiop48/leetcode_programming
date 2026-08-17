/*
 * @lc app=leetcode id=3097 lang=kotlin
 *
 * [3097] Shortest Subarray With OR at Least K II
 */

class Solution { fun minimumSubarrayLength(nums: IntArray, k: Int): Int = IntArray(32).apply { this[31] = Int.MAX_VALUE }.also { st -> nums.indices.forEach { right -> (0..29).forEach { b -> if ((nums[right] and (1 shl b)) != 0) st[b]++ }.also { while (st[30] <= right && (0..29).fold(0) { acc, b -> if (st[b] > 0) acc or (1 shl b) else acc } >= k) st.also { st[31] = minOf(st[31], right - st[30] + 1) }.also { (0..29).forEach { b -> if ((nums[st[30]] and (1 shl b)) != 0) st[b]-- } }.also { st[30]++ } } } }.let { st -> if (st[31] == Int.MAX_VALUE) -1 else st[31] } }