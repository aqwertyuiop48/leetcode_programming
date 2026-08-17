/*
 * @lc app=leetcode id=1514 lang=kotlin
 *
 * [1514] Path with Maximum Probability
 */

class Solution { fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start_node: Int, end_node: Int): Double = Array(n) { mutableListOf<Pair<Int, Double>>() }.also { adj -> edges.indices.forEach { i -> adj[edges[i][0]].add(edges[i][1] to succProb[i]).also { adj[edges[i][1]].add(edges[i][0] to succProb[i]) } } }.let { adj -> DoubleArray(n).also { p -> p[start_node] = 1.0 }.let { p -> java.util.PriorityQueue<Pair<Int, Double>>(compareByDescending { it.second }).also { pq -> pq.add(start_node to 1.0).run { while (pq.isNotEmpty()) pq.poll().let { (u, prob) -> if (prob >= p[u]) adj[u].forEach { (v, w) -> if (p[u] * w > p[v]) p[v] = (p[u] * w).also { pq.add(v to it) } } } } }[end_node] } } }