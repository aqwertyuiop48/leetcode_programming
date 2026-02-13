/*
 * @lc app=leetcode id=347 lang=kotlin
 *
 * [347] Top K Frequent Elements
 */

class Solution {fun topKFrequent(nums: IntArray, k: Int) = nums.fold(mutableMapOf<Int, Int>()) { freq, n -> freq.apply { put(n, getOrDefault(n, 0) + 1) } }.entries.fold(PriorityQueue<Map.Entry<Int, Int>>(compareBy { it.value })) { pq, entry -> pq.apply { if (offer(entry) && size > k) poll() } }.map { it.key }.toIntArray()}