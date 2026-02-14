/*
 * @lc app=leetcode id=834 lang=kotlin
 *
 * [834] Sum of Distances in Tree
 */

class Solution { fun sumOfDistancesInTree(n: Int, edges: Array<IntArray>): IntArray = List(n) { mutableListOf<Int>() }.apply { edges.forEach { (a, b) -> this[a].add(b).also { this[b].add(a) } } }.let { g -> MutableList(n) { 0 }.let { ans -> MutableList(n) { 1 }.let { cnt -> DeepRecursiveFunction<Triple<Int, Int, Boolean>, Unit> { (u, p, f) -> g[u].forEach { v -> (v != p).takeIf { it }?.run { (if (!f) ans.set(v, ans[u] - cnt[v] * 2 + n) else Unit).run { callRecursive(Triple(v, u, f)) }.run { if (f) cnt.set(u, cnt[u] + cnt[v]).also { _ -> ans[u] += ans[v] + cnt[v] } else Unit } } } }.run { invoke(Triple(0, -1, true)).run { invoke(Triple(0, -1, false)).run { ans.toIntArray() } } } } } } }