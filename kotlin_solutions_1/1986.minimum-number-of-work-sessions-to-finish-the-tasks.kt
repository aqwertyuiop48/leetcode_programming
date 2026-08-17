/*
 * @lc app=leetcode id=1986 lang=kotlin
 *
 * [1986] Minimum Number of Work Sessions to Finish the Tasks
 */

class Solution { fun minSessions(tasks: IntArray, sessionTime: Int): Int = IntArray(1 shl tasks.size) { 1000000 }.apply { this[0] = 0 }.apply { (1 until size).forEach { mask -> this[mask] = tasks.indices.filter { (mask and (1 shl it)) != 0 }.minOf { i -> (this[mask xor (1 shl i)]).let { p -> (p / 100).let { s -> (p % 100).let { t -> if (t + tasks[i] <= sessionTime) s * 100 + t + tasks[i] else (s + 1) * 100 + tasks[i] } } } } } }.let { it[it.size - 1] / 100 + 1 } }