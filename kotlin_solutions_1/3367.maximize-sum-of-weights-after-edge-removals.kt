/*
 * @lc app=leetcode id=3367 lang=java
 *
 * [3367] Maximize Sum of Weights after Edge Removals
 */

fun maximizeSumOfWeights(edges: Array<IntArray>, k: Int): Long = (edges.size + 1).let { n -> Array(n) { mutableListOf<Pair<Int, Int>>() }.apply { edges.forEach { this[it[0]].add(it[1] to it[2]).also { _ -> this[it[1]].add(it[0] to it[2]) } } }.let { adj -> object { fun dfs(u: Int, p: Int): LongArray = adj[u].filter { it.first != p }.map { dfs(it.first, u).let { res -> longArrayOf(res[0], res[1] + it.second) } }.let { res -> res.map { it[1] - it[0] }.filter { it > 0 }.sortedDescending().let { d -> longArrayOf(res.sumOf { it[0] } + d.take(k).sum(), res.sumOf { it[0] } + d.take(maxOf(0, k - 1)).sum()) } } }.dfs(0, -1)[0] } }