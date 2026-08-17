/*
 * @lc app=leetcode id=1376 lang=kotlin
 *
 * [1376] Time Needed to Inform All Employees
 */

class Solution { fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int = Array(n) { mutableListOf<Int>() }.apply { manager.indices.forEach { i -> if (manager[i] != -1) this[manager[i]].add(i) } }.let { adj -> DeepRecursiveFunction<Int, Int> { u -> informTime[u] + (adj[u].maxOfOrNull { callRecursive(it) } ?: 0) }.invoke(headID) } }