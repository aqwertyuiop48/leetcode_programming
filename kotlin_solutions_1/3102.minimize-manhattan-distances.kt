/*
 * @lc app=leetcode id=3102 lang=kotlin
 *
 * [3102] Minimize Manhattan Distances
 */

class Solution { fun minimumDistance(points: Array<IntArray>): Int = listOf(points.indices.minByOrNull { points[it][0] + points[it][1] }!!, points.indices.maxByOrNull { points[it][0] + points[it][1] }!!, points.indices.minByOrNull { points[it][0] - points[it][1] }!!, points.indices.maxByOrNull { points[it][0] - points[it][1] }!!).minOf { skip -> points.indices.filter { it != skip }.let { rem -> maxOf(rem.maxOf { points[it][0] + points[it][1] } - rem.minOf { points[it][0] + points[it][1] }, rem.maxOf { points[it][0] - points[it][1] } - rem.minOf { points[it][0] - points[it][1] }) } } }