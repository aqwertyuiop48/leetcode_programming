/*
 * @lc app=leetcode id=802 lang=kotlin
 *
 * [802] Find Eventual Safe States
 */

class Solution { fun eventualSafeNodes(graph: Array<IntArray>): List<Int> = IntArray(graph.size).also { c -> DeepRecursiveFunction<Int, Boolean> { v -> c.set(v, 1).let { graph[v].all { if (c[it] == 0) callRecursive(it) else c[it] == 2 }.also { c[v] = if (it) 2 else 3 } } }.run { graph.indices.forEach { if (c[it] == 0) invoke(it) } } }.withIndex().filter { it.value == 2 }.map { it.index } }
