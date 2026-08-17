/*
 * @lc app=leetcode id=1383 lang=kotlin
 *
 * [1383] Maximum Performance of a Team
 */

class Solution { fun maxPerformance(n: Int, speed: IntArray, efficiency: IntArray, k: Int): Int = speed.indices.map { efficiency[it] to speed[it] }.sortedByDescending { it.first }.fold(Triple(java.util.PriorityQueue<Int>(), 0L, 0L)) { (pq, sum, maxP), (e, s) -> (sum + s - if (pq.apply { add(s) }.size > k) pq.poll().toLong() else 0L).let { newSum -> Triple(pq, newSum, maxOf(maxP, newSum * e)) } }.third.let { (it % 1000000007).toInt() } }