/*
 * @lc app=leetcode id=310 lang=kotlin
 *
 * [310] Minimum Height Trees
 */

class Solution {fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> = if (n == 1) listOf(0) else edges.fold(Array(n) { mutableListOf<Int>() } to IntArray(n)) { (graph, degree), (u, v) -> graph.also { it[u].add(v).run{it[v].add(u)}.run{degree[u]++}.run{degree[v]++} } to degree }.let { (graph, degree) -> intArrayOf(n).let { remaining -> generateSequence(degree.indices.filter { degree[it] == 1 }.toMutableList()) { leaves -> if (remaining[0] <= 2) null else leaves.flatMap { leaf -> graph[leaf].filter { degree[it]-- > 1 && degree[it] == 1 } }.toMutableList().takeIf { it.isNotEmpty() }.also { remaining[0] -= leaves.size } }.last() } }}

