/*
 * @lc app=leetcode id=1202 lang=kotlin
 *
 * [1202] Smallest String With Swaps
 */

class Solution { fun smallestStringWithSwaps(s: String, pairs: List<List<Int>>): String = IntArray(s.length) { it }.let { parent -> DeepRecursiveFunction<Int, Int> { u -> if (parent[u] == u) u else callRecursive(parent[u]).also { parent[u] = it } }.let { find -> pairs.forEach { (u, v) -> parent[find(u)] = find(v) }.let { CharArray(s.length).also { res -> s.indices.groupBy { find(it) }.values.forEach { group -> group.map { s[it] }.sorted().zip(group.sorted()).forEach { (c, i) -> res[i] = c } } }.concatToString() } } } }