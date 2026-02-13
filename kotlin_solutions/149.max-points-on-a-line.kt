/*
 * @lc app=leetcode id=149 lang=kotlin
 *
 * [149] Max Points on a Line
 */
class Solution { fun maxPoints(points: Array<IntArray>): Int = if (points.size <= 2) points.size else points.indices.maxOf { i -> mutableMapOf<Pair<Int, Int>, Int>().let { slopes -> ((i + 1) until points.size).forEach { j -> (points[j][1] - points[i][1] to points[j][0] - points[i][0]).let { (dy, dx) -> when {dx == 0 -> {(1 to 0)}dy == 0 -> {(0 to 1)} else -> gcd(dy, dx).let { g -> (dy / g to dx / g) } }.let { normalized -> (if (normalized.second < 0) (-normalized.first to -normalized.second) else normalized).also { key -> slopes[key] = slopes.getOrDefault(key, 0) + 1 } } } }.let { (slopes.values.maxOrNull() ?: 0) + 1 } } } fun gcd(a: Int, b: Int): Int = if (b == 0) kotlin.math.abs(a) else gcd(b, a % b) }
