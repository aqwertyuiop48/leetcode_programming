/*
 * @lc app=leetcode id=1377 lang=kotlin
 *
 * [1377] Frog Position After T Seconds
 */

class Solution { fun frogPosition(n: Int, edges: Array<IntArray>, t: Int, target: Int): Double = Array(n + 1) { mutableListOf<Int>() }.apply { edges.forEach { (u, v) -> this[u].add(v).let { this[v].add(u) } } }.let { adj -> DeepRecursiveFunction<Triple<Int, Int, Int>, Double> { (u, p, rem) -> adj[u].filter { it != p }.let { ch -> if (u == target) if (rem == 0 || ch.isEmpty()) 1.0 else 0.0 else if (rem == 0 || ch.isEmpty()) 0.0 else ch.sumOf { callRecursive(Triple(it, u, rem - 1)) } / ch.size } }.invoke(Triple(1, 0, t)) } }