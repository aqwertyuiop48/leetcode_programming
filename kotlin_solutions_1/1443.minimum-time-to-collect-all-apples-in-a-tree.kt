/*
 * @lc app=leetcode id=1443 lang=kotlin
 *
 * [1443] Minimum Time to Collect All Apples in a Tree
 */

class Solution { fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int = List(n) { mutableListOf<Int>() }.apply { edges.forEach { (u, v) -> this[u].add(v).also{this[v].add(u)} } }.let { adj -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (u, p) -> adj[u].filter { it != p }.sumOf { v -> callRecursive(v to u).let { res -> if (res > 0 || hasApple[v]) res + 2 else 0 } } }.invoke(0 to -1) } }