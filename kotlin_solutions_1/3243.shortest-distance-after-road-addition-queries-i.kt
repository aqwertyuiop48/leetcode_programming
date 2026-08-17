/*
 * @lc app=leetcode id=3243 lang=java
 *
 * [3243] Shortest Distance After Road Addition Queries I
 */
class Solution { fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray = Array(n) { mutableListOf<Int>() }.also { adj -> (0 until n - 1).forEach { i -> adj[i].add(i + 1) } }.let { adj -> queries.map { q -> adj[q[0]].add(q[1]).run { IntArray(n) { -1 }.also { d -> java.util.ArrayDeque<Int>().also { qu -> qu.add(0).run { d[0] = 0 }.run { while (qu.isNotEmpty()) qu.poll().let { u -> adj[u].forEach { v -> if (d[v] == -1) d[v] = d[u] + 1.also { qu.add(v) } } } } } }.let { d -> d[n - 1] } } }.toIntArray() } }