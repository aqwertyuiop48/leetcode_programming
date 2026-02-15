/*
 * @lc app=leetcode id=882 lang=kotlin
 *
 * [882] Reachable Nodes In Subdivided Graph
 */

class Solution { fun reachableNodes(edges: Array<IntArray>, maxMoves: Int, n: Int) = edges.fold(Array(n) { mutableListOf<Pair<Int, Int>>() }) { graph, edge -> graph.apply { this[edge[0]].add(edge[1] to edge[2]) .also{this[edge[1]].add(edge[0] to edge[2])} } }.let { graph -> IntArray(n) { maxMoves + 1 }.apply { this[0] = 0 }.let { dist -> PriorityQueue<Pair<Int, Int>>(compareBy { it.first }).apply { add(0 to 0) }.let { pq -> generateSequence { pq.poll()?.takeIf { it.first < maxMoves } } .forEach { (d, u) -> if (d == dist[u]) graph[u].forEach { (v, w) -> if (d + w + 1 < dist[v]) (d + w + 1).also { dist[v] = it }.also { pq.add(it to v) } } } }.let { dist.count { it <= maxMoves } + edges.sumOf { edge -> minOf( (if (dist[edge[0]] > maxMoves) 0 else minOf(maxMoves - dist[edge[0]], edge[2])) + (if (dist[edge[1]] > maxMoves) 0 else minOf(maxMoves - dist[edge[1]], edge[2])), edge[2] ) } } } } }