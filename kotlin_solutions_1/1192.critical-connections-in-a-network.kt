/*
 * @lc app=leetcode id=1192 lang=kotlin
 *
 * [1192] Critical Connections in a Network
 */

class Solution { fun criticalConnections(n: Int, connections: List<List<Int>>): List<List<Int>> = Array(n) { mutableListOf<Int>() }.also { graph -> connections.forEach { (a, b) -> graph[a].add(b).also { graph[b].add(a) } } }.let { graph -> IntArray(n).let { order -> IntArray(n).let { low -> IntArray(1).let { clock -> mutableListOf<List<Int>>().also { answer -> DeepRecursiveFunction<Pair<Int, Int>, Unit> { pair -> pair.first.let { node -> pair.second.let { parent -> (clock[0] + 1).also { clock[0] = it }.also { order[node] = it }.also { low[node] = it }.let { graph[node].forEach { next -> if (next != parent) if (order[next] == 0) callRecursive(next to node).also { low[node] = minOf(low[node], low[next]) }.also { if (low[next] > order[node]) answer.add(listOf(node, next)) } else low[node] = minOf(low[node], order[next]) } } } } }.also { it.invoke(0 to -1) } } } } } } }