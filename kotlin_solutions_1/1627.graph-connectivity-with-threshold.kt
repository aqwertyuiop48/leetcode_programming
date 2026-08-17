/*
 * @lc app=leetcode id=1627 lang=kotlin
 *
 * [1627] Graph Connectivity With Threshold
 */

class Solution { fun areConnected(n: Int, threshold: Int, queries: Array<IntArray>): List<Boolean> = IntArray(n + 1) { it }.let { p -> DeepRecursiveFunction<Int, Int> { i -> if (p[i] == i) i else call(p[i]).also { p[i] = it } }.also { find -> (threshold + 1..n).forEach { z -> (2 * z..n step z).forEach { m -> p[find(m)] = find(z) } } } }.let { find -> queries.map { q -> find(q[0]) == find(q[1]) } } }