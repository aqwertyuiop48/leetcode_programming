/*
 * @lc app=leetcode id=2097 lang=kotlin
 *
 * [2097] Valid Arrangement of Pairs
 */

class Solution {
    fun validArrangement(pairs: Array<IntArray>): Array<IntArray> = mutableMapOf<Int, MutableList<Int>>().let { adj -> mutableMapOf<Int, Int>().let { deg -> pairs.forEach { (u, v) -> adj.getOrPut(u) { mutableListOf() }.add(v).also { deg[u] = (deg[u] ?: 0) + 1 }.also { deg[v] = (deg[v] ?: 0) - 1 } }.let { deg.entries.find { it.value == 1 }?.key ?: pairs[0][0] }.let { start -> mutableListOf<Int>().let { path -> mutableListOf(start).apply { while (isNotEmpty()) last().let { u -> if (adj[u]?.isNotEmpty() == true) adj[u]!!.let { add(it.removeAt(it.size - 1)) } else path.add(removeAt(size - 1)) } } }.let { path.reversed().let { p -> Array(pairs.size) { i -> intArrayOf(p[i], p[i + 1]) } } } } } }
}