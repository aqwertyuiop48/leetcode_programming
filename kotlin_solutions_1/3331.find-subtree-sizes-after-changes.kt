/*
 * @lc app=leetcode id=3331 lang=java
 *
 * [3331] Find Subtree Sizes After Changes
 */
fun findSubtreeSizes(parent: IntArray, s: String): IntArray = Array(parent.size) { mutableListOf<Int>() }.also { adj -> (1 until parent.size).forEach { adj[parent[it]].add(it) } }.let { adj -> IntArray(parent.size).also { newP -> object { fun dfs(u: Int, last: IntArray): Unit = (last[s[u].code - 'a'.code]).let { old -> newP.also { it[u] = if (old == -1) parent[u] else old }.run { last[s[u].code - 'a'.code] = u }.run { adj[u].forEach { dfs(it, last) } }.run { last[s[u].code - 'a'.code] = old } } }.dfs(0, IntArray(26) { -1 }) }.let { newP -> Array(parent.size) { mutableListOf<Int>() }.also { nAdj -> (1 until parent.size).forEach { nAdj[newP[it]].add(it) } }.let { nAdj -> IntArray(parent.size).also { ans -> object { fun dfs(u: Int): Int = (1 + nAdj[u].sumOf { dfs(it) }).also { ans[u] = it } }.dfs(0) } } } }