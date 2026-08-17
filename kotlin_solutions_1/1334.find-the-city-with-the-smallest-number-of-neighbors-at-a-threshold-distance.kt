/*
 * @lc app=leetcode id=1334 lang=kotlin
 *
 * [1334] Find the City With the Smallest Number of Neighbors at a Threshold Distance
 */

class Solution { fun findTheCity(n: Int, edges: Array<IntArray>, distanceThreshold: Int): Int = Array(n) { i -> IntArray(n) { j -> if (i == j) 0 else 1000001 } }.also { dist -> edges.forEach { (u, v, w) -> w.also { dist[u][v] = it }.also { dist[v][u] = it } } }.also { dist -> (0 until n).forEach { k -> (0 until n).forEach { i -> (0 until n).forEach { j -> dist[i][j] = minOf(dist[i][j], dist[i][k] + dist[k][j]) } } } }.let { dist -> (0 until n).map { i -> i to dist[i].count { it <= distanceThreshold } }.minWithOrNull(compareBy<Pair<Int, Int>> { it.second }.thenByDescending { it.first })?.first ?: 0 } }