/*
 * @lc app=leetcode id=1046 lang=kotlin
 *
 * [1046] Last Stone Weight
 */

class Solution { fun lastStoneWeight(stones: IntArray): Int = java.util.PriorityQueue<Int>(compareByDescending { it }).apply { stones.forEach { add(it) } }.also { pq -> while (pq.size > 1) { (pq.poll() - pq.poll()).let { diff -> if (diff > 0) pq.add(diff) } } }.poll() ?: 0 }