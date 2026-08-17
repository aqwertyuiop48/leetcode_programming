/*
 * @lc app=leetcode id=1192 lang=kotlin
 *
 * [1192] Critical Connections in a Network
 */

class Solution { fun criticalConnections(n: Int, connections: List<List<Int>>): List<List<Int>> = Array(n) { mutableListOf<Int>() }.apply { connections.forEach { (u, v) -> this[u].add(v).also { this[v].add(u) } } }.let { g -> IntArray(n).let { tin -> IntArray(n).let { low -> IntArray(1) { 1 }.let { timer -> mutableListOf<List<Int>>().also { res -> DeepRecursiveFunction<Pair<Int, Int>, Unit> { (u, p) -> timer[0]++.also { tin[u] = it }.also { low[u] = it }.also { g[u].forEach { v -> if (v != p) if (tin[v] > 0) low[u] = minOf(low[u], tin[v]) else callRecursive(v to u).also { low[u] = minOf(low[u], low[v]) }.also { if (low[v] > tin[u]) res.add(listOf(u, v)) } } } }(0 to -1) } } } } }