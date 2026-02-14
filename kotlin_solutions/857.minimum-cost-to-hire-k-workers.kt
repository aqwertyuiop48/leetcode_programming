/*
 * @lc app=leetcode id=857 lang=kotlin
 *
 * [857] Minimum Cost to Hire K Workers
 */

import java.util.* class Solution { fun mincostToHireWorkers(quality: IntArray, wage: IntArray, k: Int): Double = wage.zip(quality).map { (w, q) -> (w.toDouble() / q) to q }.sortedBy { it.first }.let { sorted -> sorted.take(k).fold(PriorityQueue<Int>(k, Collections.reverseOrder<Int>()) to 0) { (heap, sum), (_, q) -> heap.apply { add(q) } to (sum + q) }.let { (heap, initialSum) -> sorted.drop(k).fold(initialSum * sorted[k - 1].first to heap) { (minCost, h), (ratio, q) -> h.poll().let { removed -> h.add(q) .run{minOf(minCost, (initialSum - removed + q + h.sumOf { it } - initialSum + removed - q) * ratio) to h} } }.first } } }

