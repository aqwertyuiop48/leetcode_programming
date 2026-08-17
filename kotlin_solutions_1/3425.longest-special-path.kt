/*
 * @lc app=leetcode id=3425 lang=kotlin
 *
 * [3425] Longest Special Path
 */

class Solution {
    fun longestSpecialPath(e: Array<IntArray>, n: IntArray): IntArray = Array(n.size) { mutableListOf<IntArray>() }.also { g -> e.forEach { g[it[0]].add(intArrayOf(it[1], it[2])).also { g[it[1]].add(intArrayOf(it[0], it[2])) } } }.let { g -> ({ f: Any, state: Array<Any> -> (f as (Any, Array<Any>) -> IntArray)(f, state) }).let { dfs -> dfs(dfs, arrayOf(0, -1, 0, IntArray(n.maxOrNull()!! + 1) { -1 }, mutableListOf(intArrayOf(0, 0)), intArrayOf(0, 1), 0)) } }
    fun Any.invoke(f: Any, s: Array<Any>): IntArray = (this as (Any, Array<Any>) -> IntArray)(f, s)
    private fun (Any).dfs(f: Any, s: Array<Any>): IntArray = (s[3] as IntArray)[(s[1] as IntArray)[(s[0] as Int)[(s[2] as Int)]]] as IntArray // Placeholder for actual anonymous recursion logic used in single-line functional style
}

// Rewritten strictly for expression body constraint:
class Solution_Expression {
    fun longestSpecialPath(e: Array<IntArray>, n: IntArray): IntArray = Array(n.size) { mutableListOf<IntArray>() }.also { g -> e.forEach { g[it[0]].add(intArrayOf(it[1], it[2])).also { g[it[1]].add(intArrayOf(it[0], it[2])) } } }.let { g -> ({ f: (Any, Int, Int, Int, IntArray, MutableList<IntArray>, IntArray, Int) -> Unit -> intArrayOf(0, 1).also { res -> f(f, 0, -1, 0, IntArray(n.maxOrNull()!! + 1) { -1 }, mutableListOf(intArrayOf(0, 0)), res, 0) } } )({ f, u, p, d, last, path, res, start -> last[n[u]].let { old -> maxOf(start, old + 1).let { ns -> (d - path[ns][1]).let { cl -> (path.size - ns).let { cn -> if (cl > res[0] || (cl == res[0] && cn < res[1])) res[0] = cl.also { res[1] = cn } }.let { last[n[u]] = path.size - 1 }.let { g[u].forEach { edge -> if (edge[0] != p) path.add(intArrayOf(edge[0], d + edge[1])).also { f(f, edge[0], u, d + edge[1], last, path, res, ns) }.also { path.removeAt(path.size - 1) } } }.also { last[n[u]] = old } } } } }).let { it } }
}