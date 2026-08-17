/*
 * @lc app=leetcode id=2920 lang=kotlin
 *
 * [2920] Maximum Points After Collecting Coins From All Nodes
 */

class Solution {
    fun maximumPoints(edges: Array<IntArray>, coins: IntArray, k: Int): Int = Array(coins.size) { mutableListOf<Int>() }.apply { edges.forEach { (u, v) -> this[u].add(v).also { this[v].add(u) } } }.let { adj -> Array(coins.size) { IntArray(14) { -1 } }.let { memo -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (u, p, v) -> if (v >= 14) 0 else if (memo[u][v] != -1) memo[u][v] else maxOf((coins[u] shr v) - k + adj[u].sumOf { if (it == p) 0 else callRecursive(Triple(it, u, v)) }, (coins[u] shr (v + 1)) + adj[u].sumOf { if (it == p) 0 else callRecursive(Triple(it, u, v + 1)) }).also { memo[u][v] = it } }(Triple(0, -1, 0)) } }
}