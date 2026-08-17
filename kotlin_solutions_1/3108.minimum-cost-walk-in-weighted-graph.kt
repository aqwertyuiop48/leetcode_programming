/*
 * @lc app=leetcode id=3108 lang=kotlin
 *
 * [3108] Minimum Cost Walk in Weighted Graph
 */

class Solution {
    fun minimumCost(n: Int, edges: Array<IntArray>, query: Array<IntArray>): IntArray = IntArray(n) { it }.let { p -> IntArray(n) { -1 }.let { c -> DeepRecursiveFunction<Int, Int> { u -> if (p[u] == u) u else callRecursive(p[u]).also { p[u] = it } }.let { find -> edges.forEach { e -> find(e[0]).let { u -> find(e[1]).let { v -> p[u] = v.also { c[v] = c[v] and c[u] and e[2] } } } }.run { IntArray(query.size) { i -> query[i].let { (u, v) -> if (u == v) 0 else find(u).let { ru -> find(v).let { rv -> if (ru != rv) -1 else c[ru] } } } } } } } }
}