/*
 * @lc app=leetcode id=2934 lang=kotlin
 *
 * [2934] Minimum Operations to Maximize Last Elements in Arrays
 */

class Solution { fun minOperations(a: IntArray, b: IntArray): Int = { lastA: Int, lastB: Int -> (0 until a.size - 1).fold(0) { acc, i -> if (acc == -1) -1 else if (a[i] <= lastA && b[i] <= lastB) acc else if (a[i] <= lastB && b[i] <= lastA) acc + 1 else -1 } }.let { solve -> listOf(solve(a.last(), b.last()), solve(b.last(), a.last()).let { if (it == -1) -1 else it + 1 }).filter { it != -1 }.minOrNull() ?: -1 } }