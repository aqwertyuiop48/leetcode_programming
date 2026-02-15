/*
 * @lc app=leetcode id=886 lang=kotlin
 *
 * [886] Possible Bipartition
 */

class Solution { fun possibleBipartition(n: Int, dislikes: Array<IntArray>) = dislikes.fold(Array(n + 1) { mutableListOf<Int>() }) { graph, d -> graph.apply { this[d[0]].add(d[1]) .also{this[d[1]].add(d[0])} } }.let { graph -> IntArray(n + 1).let { color -> (1..n).all { start -> color[start] != 0 || generateSequence(mutableListOf(start).also { color[start] = 1 }) { curr -> curr.flatMap { node -> graph[node].filter { color[it] == 0 }.onEach { color[it] = 3 - color[node] } }.toMutableList().takeIf { it.isNotEmpty() } }.all { level -> level.none { node -> graph[node].any { color[it] == color[node] } } } } } } }

