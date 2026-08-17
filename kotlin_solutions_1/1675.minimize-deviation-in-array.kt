/*
 * @lc app=leetcode id=1675 lang=kotlin
 *
 * [1675] Minimize Deviation in Array
 */

class Solution { fun minimumDeviation(nums: IntArray): Int = java.util.PriorityQueue<Int>(compareByDescending { it }).also { pq -> nums.map { if (it % 2 != 0) it * 2 else it }.also { list -> list.forEach { pq.offer(it) } }.minOrNull()!!.let { initialMin -> generateSequence(Pair(initialMin, Int.MAX_VALUE)) { (minV, ans) -> if (pq.peek() % 2 == 0) pq.poll().let { maxV -> Pair(minOf(minV, maxV / 2), minOf(ans, maxV - minV)).also { pq.offer(maxV / 2) } } else null }.last().let { (minV, ans) -> minOf(ans, pq.peek() - minV) } } } }