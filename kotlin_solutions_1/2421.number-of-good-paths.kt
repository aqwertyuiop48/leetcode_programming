/*
 * @lc app=leetcode id=2421 lang=kotlin
 *
 * [2421] Number of Good Paths
 */

class Solution { fun numberOfGoodPaths(vals: IntArray, edges: Array<IntArray>): Int = vals.size.let { n -> IntArray(n) { it }.let { parent -> IntArray(n) { 1 }.let { count -> DeepRecursiveFunction<Int, Int> { i -> if (parent[i] == i) i else callRecursive(parent[i]).also { parent[i] = it } }.let { find -> intArrayOf(n).let { ans -> edges.sortedBy { maxOf(vals[it[0]], vals[it[1]]) }.forEach { (u, v) -> find(u).let { ru -> find(v).let { rv -> if (ru != rv) { if (vals[ru] == vals[rv]) { run { ans[0] += count[ru] * count[rv] }.run { count[ru] += count[rv] }.run { parent[rv] = ru } } else if (vals[ru] > vals[rv]) { parent[rv] = ru } else { parent[ru] = rv } } } } }.run { ans[0] } } } } } }