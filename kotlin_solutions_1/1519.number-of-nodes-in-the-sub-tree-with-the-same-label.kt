/*
 * @lc app=leetcode id=1519 lang=kotlin
 *
 * [1519] Number of Nodes in the Sub-Tree With the Same Label
 */

class Solution {
    fun countSubTrees(n: Int, edges: Array<IntArray>, labels: String): IntArray = IntArray(n).also { ans -> Array(n) { mutableListOf<Int>() }.apply { edges.forEach { e -> this[e[0]].add(e[1]).also { this[e[1]].add(e[0]) } } }.let { adj -> DeepRecursiveFunction<Pair<Int, Int>, IntArray> { (u, p) -> IntArray(26).apply { this[labels[u] - 'a'] = 1 }.apply { adj[u].forEach { v -> if (v != p) callRecursive(v to u).let { child -> (0..25).forEach { i -> this[i] += child[i] } } } }.apply { ans[u] = this[labels[u] - 'a'] } }.invoke(0 to -1) }
}