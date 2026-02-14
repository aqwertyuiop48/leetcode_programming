/*
 * @lc app=leetcode id=547 lang=kotlin
 *
 * [547] Number of Provinces
 */

class Solution { fun findCircleNum(isConnected: Array<IntArray>) = IntArray(isConnected.size) { it }.let { parent -> DeepRecursiveFunction<Int, Int> { x -> if (parent[x] == x) x else callRecursive(parent[x]).also { parent[x] = it }}.let { find -> isConnected.indices.onEach { i -> (i + 1..<isConnected.size).forEach { j -> if (isConnected[i][j] == 1) parent[find(i)] = find(j) }}.run { parent.indices.count { find(it) == it }}} } }