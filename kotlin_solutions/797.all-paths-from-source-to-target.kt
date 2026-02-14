/*
 * @lc app=leetcode id=797 lang=kotlin
 *
 * [797] All Paths From Source to Target
 */

class Solution { fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> { return aux(graph, 0) } fun aux(graph: Array<IntArray>, index: Int): List<List<Int>> { return if (index == graph.lastIndex) { listOf(listOf(index)) } else { graph[index].flatMap { child -> aux(graph, child) }.map { listOf(index) + it } } } }
