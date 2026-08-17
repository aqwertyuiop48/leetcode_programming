/*
 * @lc app=leetcode id=1665 lang=kotlin
 *
 * [1665] Minimum Initial Energy to Finish Tasks
 */

class Solution { fun minimumEffort(tasks: Array<IntArray>): Int = tasks.sortedBy { it[1] - it[0] }.fold(0) { e, t -> maxOf(t[1], e + t[0]) } }