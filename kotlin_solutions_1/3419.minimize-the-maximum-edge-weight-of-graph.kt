/*
 * @lc app=leetcode id=3419 lang=kotlin
 *
 * [3419] Minimize the Maximum Edge Weight of Graph
 */

class Solution {
    fun minMaxWeight(n: Int, edges: Array<IntArray>, threshold: Int): Int = Array(n) { mutableListOf<Pair<Int, Int>>() }.also { adj -> edges.forEach { adj[it[1]].add(it[0] to it[2]) } }.let { adj -> (0..20).fold(0 to 1000000 to -1) { (range, best), _ -> range.let { (low, high) -> if (low > high) (low to high) to best else ((low + high) / 2).let { mid -> if (BooleanArray(n).let { vis -> mutableListOf(0).let { q -> vis[0] = true.let { 1 }.let { initialCount -> (0 until n).fold(initialCount) { count, _ -> if (q.isEmpty()) count else q.removeAt(0).let { u -> adj[u].fold(count) { c, edge -> if (!vis[edge.first] && edge.second <= mid) vis[edge.first].let { vis[edge.first] = true }.let { q.add(edge.first) }.let { c + 1 } else c } } } } == n } }) (low to mid - 1) to mid else (mid + 1 to high) to best } } }.second }
}