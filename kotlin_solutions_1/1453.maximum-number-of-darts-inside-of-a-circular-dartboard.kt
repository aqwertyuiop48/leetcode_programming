/*
 * @lc app=leetcode id=1453 lang=kotlin
 *
 * [1453] Maximum Number of Darts Inside of a Circular Dartboard
 */

class Solution { fun numPoints(darts: Array<IntArray>, r: Int): Int = darts.indices.flatMap { i -> darts.indices.filter { j -> i != j }.mapNotNull { j -> Math.hypot((darts[i][0] - darts[j][0]).toDouble(), (darts[i][1] - darts[j][1]).toDouble()).let { d -> if (d > 2 * r) null else ((darts[i][0] + darts[j][0]) / 2.0 + Math.sqrt(r * r - d * d / 4.0) * (darts[j][1] - darts[i][1]) / d) to ((darts[i][1] + darts[j][1]) / 2.0 - Math.sqrt(r * r - d * d / 4.0) * (darts[j][0] - darts[i][0]) / d) } } }.map { (cx, cy) -> darts.count { Math.hypot(it[0] - cx, it[1] - cy) <= r + 1e-6 } }.maxOrNull() ?: 1 }