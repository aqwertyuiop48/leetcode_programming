/*
 * @lc app=leetcode id=3310 lang=java
 *
 * [3310] Remove Methods From Project
 */
fun remainingMethods(n: Int, k: Int, invocations: Array<IntArray>): List<Int> = Array(n) { mutableListOf<Int>() }.apply { invocations.forEach { this[it[0]].add(it[1]) } }.let { adj -> BooleanArray(n).also { susp -> mutableListOf(k).let { q -> susp.apply { susp[k] = true }.run { generateSequence(0) { it + 1 }.takeWhile { it < q.size }.forEach { head -> adj[q[head]].forEach { v -> if (!susp[v]) susp.apply { susp[v] = true }.run { q.add(v) } } } } } }.let { susp -> if (invocations.any { !susp[it[0]] && susp[it[1]] }) (0 until n).toList() else (0 until n).filter { !susp[it] } } }