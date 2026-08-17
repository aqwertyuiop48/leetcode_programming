/*
 * @lc app=leetcode id=2233 lang=kotlin
 *
 * [2233] Maximum Product After K Increments
 */

class Solution {
    fun maximumProduct(nums: IntArray, k: Int) = java.util.PriorityQueue<Int>().apply { nums.forEach { add(it) } }.also { pq -> repeat(k) { pq.add(pq.poll() + 1) } }.let { pq -> generateSequence { if (pq.isEmpty()) null else pq.poll() }.fold(1L) { acc, n -> (acc * n) % 1000000007 }.toInt() }
}