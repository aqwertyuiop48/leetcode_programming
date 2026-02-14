/*
 * @lc app=leetcode id=752 lang=kotlin
 *
 * [752] Open the Lock
 */

class Solution { fun openLock(deadends: Array<String>, target: String): Int = deadends.toSet().let { dead -> if ("0000" in dead) -1 else mutableSetOf("0000").let { visited -> generateSequence(setOf("0000") to 0) { (queue, steps) -> queue.flatMap { curr -> (0..3).flatMap { i -> listOf( curr.substring(0, i) + ((curr[i] - '0' + 1) % 10) + curr.substring(i + 1), curr.substring(0, i) + ((curr[i] - '0' + 9) % 10) + curr.substring(i + 1) ) }.filter { it !in dead && visited.add(it) } }.toSet().takeIf { it.isNotEmpty() }?.let { it to steps + 1 } }.firstOrNull { target in it.first }?.second ?: -1 } } }
