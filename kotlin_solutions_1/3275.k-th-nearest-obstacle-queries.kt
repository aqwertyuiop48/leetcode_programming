/*
 * @lc app=leetcode id=3275 lang=java
 *
 * [3275] K-th Nearest Obstacle Queries
 */
class Solution { fun resultsArray(queries: Array<IntArray>, k: Int): IntArray = java.util.PriorityQueue<Int>(compareByDescending { it }).let { pq -> IntArray(queries.size) { i -> (Math.abs(queries[i][0]) + Math.abs(queries[i][1])).let { d -> run { pq.add(d) }.run { if (pq.size > k) pq.poll() }.run { if (pq.size == k) pq.peek() else -1 } } } } }