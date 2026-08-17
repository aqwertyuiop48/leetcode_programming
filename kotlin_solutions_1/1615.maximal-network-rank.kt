/*
 * @lc app=leetcode id=1615 lang=kotlin
 *
 * [1615] Maximal Network Rank
 */

class Solution {
    fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int = IntArray(n).also { deg -> roads.forEach { (u, v) -> deg[u]++.also { deg[v]++ } } }.let { deg -> roads.flatMap { (u, v) -> listOf(u to v, v to u) }.toSet().let { adj -> (0 until n).flatMap { i -> (i + 1 until n).map { j -> deg[i] + deg[j] - if (i to j in adj) 1 else 0 } }.maxOrNull() ?: 0 } }
}