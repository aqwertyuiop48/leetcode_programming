/*
 * @lc app=leetcode id=1857 lang=kotlin
 *
 * [1857] Largest Color Value in a Directed Graph
 */
class Solution { fun largestPathValue(colors: String, edges: Array<IntArray>): Int = List(colors.length) { mutableListOf<Int>() }.let { adj -> IntArray(colors.length).let { deg -> edges.forEach { e -> adj[e[0]].add(e[1]).run { deg[e[1]]++ } }.run { Array(colors.length) { IntArray(26) }.let { dp -> java.util.ArrayDeque<Int>().apply { deg.indices.filter { deg[it] == 0 }.forEach { add(it) } }.let { q -> intArrayOf(0).let { processed -> generateSequence { if (q.isNotEmpty()) q.poll() else null }.forEach { u -> dp[u][colors[u] - 'a']++.run { processed[0]++ }.run { adj[u].forEach { v -> (0 until 26).forEach { c -> dp[v][c] = maxOf(dp[v][c], dp[u][c]) }.run { if (--deg[v] == 0) q.add(v) } } }.run { if (processed[0] < colors.length) -1 else dp.maxOf { it.maxOrNull() ?: 0 } } } } } } } }