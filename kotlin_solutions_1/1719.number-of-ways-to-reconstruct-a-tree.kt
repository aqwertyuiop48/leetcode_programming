/*
 * @lc app=leetcode id=1719 lang=kotlin
 *
 * [1719] Number Of Ways To Reconstruct A Tree
 */

class Solution { fun checkWays(pairs: Array<IntArray>): Int = pairs.flatMap { it.toList() }.toSet().let { nodes -> HashMap<Int, HashSet<Int>>().apply { nodes.forEach { put(it, hashSetOf(it)) } }.apply { pairs.forEach { get(it[0])!!.add(it[1]).also { _ -> get(it[1])!!.add(it[0]) } } }.let { adj -> adj.keys.sortedByDescending { adj[it]!!.size }.let { sorted -> if (adj[sorted[0]]!!.size != sorted.size) 0 else sorted.foldIndexed(1) { i, res, u -> if (res == 0) 0 else sorted.take(i).filter { adj[u]!!.contains(it) }.lastOrNull()?.let { p -> if (adj[p]!!.containsAll(adj[u]!!)) (if (adj[u]!!.size == adj[p]!!.size) 2 else res) else 0 } ?: if (i == 0) res else 0 } } } }