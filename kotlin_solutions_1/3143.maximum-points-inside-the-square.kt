/*
 * @lc app=leetcode id=3143 lang=kotlin
 *
 * [3143] Maximum Points Inside the Square
 */

class Solution { fun maxPointsInsideSquare(points: Array<IntArray>, s: String): Int = points.indices.groupBy { s[it] }.values.map { idxs -> idxs.map { points[it].maxOf { v -> Math.abs(v) } }.sorted() }.let { dists -> dists.mapNotNull { if (it.size > 1) it[1] else null }.minOrNull() ?: Int.MAX_VALUE }.let { limit -> points.count { points[it].maxOf { v -> Math.abs(v) } < limit } } }