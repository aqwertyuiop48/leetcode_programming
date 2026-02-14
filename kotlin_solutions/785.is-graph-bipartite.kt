/*
 * @lc app=leetcode id=785 lang=kotlin
 *
 * [785] Is Graph Bipartite?
 */

class Solution { fun isBipartite(graph: Array<IntArray>): Boolean = IntArray(graph.size).let { colors -> DeepRecursiveFunction<Pair<Int, Int>, Boolean> { (node, color) -> if (colors[node] == 0) colors.set(node, color).let { graph[node].all { callRecursive(it to -color) } } else colors[node] == color }.run { graph.indices.all { invoke(it to (colors[it].takeIf { c -> c != 0 } ?: 1)) } } } }