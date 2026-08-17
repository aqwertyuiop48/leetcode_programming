/*
 * @lc app=leetcode id=1824 lang=kotlin
 *
 * [1824] Minimum Sideway Jumps
 */

class Solution { fun minSideJumps(obstacles: IntArray): Int = obstacles.fold(intArrayOf(1, 0, 1)) { dp, obs -> dp.apply { if (obs > 0) this[obs - 1] = 1000000 }.apply { (0..2).forEach { j -> if (j != obs - 1) this[j] = minOf(this[j], minOf(this[(j + 1) % 3], this[(j + 2) % 3]) + 1) } } }.minOrNull() ?: 0 }