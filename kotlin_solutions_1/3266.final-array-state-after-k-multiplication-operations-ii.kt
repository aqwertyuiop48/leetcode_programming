/*
 * @lc app=leetcode id=3266 lang=java
 *
 * [3266] Final Array State After K Multiplication Operations II
 */

class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray = if (multiplier == 1) nums else java.util.PriorityQueue<LongArray>(compareBy({ it[0] }, { it[1] })).apply { nums.forEachIndexed { i, v -> add(longArrayOf(v.toLong(), i.toLong())) } }.let { pq -> (nums.maxOrNull()?.toLong() ?: 0L).let { maxV -> (0 until k).takeWhile { pq.peek()[0] <= maxV / multiplier }.forEach { pq.add(pq.poll().apply { this[0] *= multiplier }) }.let { opsDone -> (k - opsDone).let { rem -> (rem / nums.size).let { q -> (rem % nums.size).let { r -> (0 until nums.size).forEach { i -> pq.add(pq.poll().apply { this[0] = (this[0] % 1000000007L * java.math.BigInteger.valueOf(multiplier.toLong()).modPow(java.math.BigInteger.valueOf(q + if (i < r) 1L else 0L), java.math.BigInteger.valueOf(1000000007L)).toLong() % 1000000007L) }) }.let { IntArray(nums.size).apply { while (pq.isNotEmpty()) pq.poll().let { this[it[1].toInt()] = it[0].toInt() } } } } } } } }
}