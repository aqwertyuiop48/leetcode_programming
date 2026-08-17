/*
 * @lc app=leetcode id=3123 lang=kotlin
 *
 * [3123] Find Edges in Shortest Paths
 */

class Solution {
    fun findAnswer(n: Int, edges: Array<IntArray>): BooleanArray = Array(n) { mutableListOf<Pair<Int, Int>>() }.also { adj -> edges.forEach { (u, v, w) -> adj[u].add(v to w).also { adj[v].add(u to w) } } }.let { adj -> { src: Int -> LongArray(n) { 1000000000000L }.also { dist -> java.util.PriorityQueue<Pair<Int, Long>>(compareBy { it.second }).apply { dist[src] = 0L.also { add(src to 0L) } }.let { pq -> generateSequence { pq.poll() }.forEach { (u, d) -> if (d == dist[u]) adj[u].forEach { (v, w) -> (d + w).let { nd -> if (nd < dist[v]) dist[v] = nd.also { pq.add(v to nd) } } } } } } }.let { dijkstra -> dijkstra(0).let { d0 -> dijkstra(n - 1).let { d1 -> BooleanArray(edges.size) { i -> edges[i].let { (u, v, w) -> d0[n - 1] < 1000000000000L && ((d0[u] + w + d1[v] == d0[n - 1]) || (d0[v] + w + d1[u] == d0[n - 1])) } } } } } }
}