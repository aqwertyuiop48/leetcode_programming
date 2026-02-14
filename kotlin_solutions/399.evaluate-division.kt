/*
 * @lc app=leetcode id=399 lang=kotlin
 *
 * [399] Evaluate Division
 */

class Solution {fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray = equations.indices.fold(mutableMapOf<String, MutableList<Pair<String, Double>>>()) { g, i -> g.apply { getOrPut(equations[i][0]) { mutableListOf() }.add(equations[i][1] to values[i]).let { getOrPut(equations[i][1]) { mutableListOf() }.add(equations[i][0] to 1.0 / values[i]) } } }.let { graph -> queries.map { (start, end) -> if (start !in graph || end !in graph) -1.0 else if (start == end) 1.0 else DeepRecursiveFunction<Triple<String, Double, Set<String>>, Double?> { (node, prod, visited) -> if (node == end) prod else graph[node]?.firstNotNullOfOrNull { (neighbor, weight) -> if (neighbor !in visited) callRecursive(Triple(neighbor, prod * weight, visited + node)) else null } }.invoke(Triple(start, 1.0, emptySet())) ?: -1.0 }.toDoubleArray() }}
