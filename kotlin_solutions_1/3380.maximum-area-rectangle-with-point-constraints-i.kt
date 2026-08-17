/*
 * @lc app=leetcode id=3380 lang=java
 *
 * [3380] Maximum Area Rectangle With Point Constraints I
 */

fun maxRectangleArea(points: Array<IntArray>): Int = points.indices.let { r -> r.flatMap { i -> r.flatMap { j -> r.flatMap { k -> r.map { l -> listOf(i, j, k, l) } } } }.filter { it.distinct().size == 4 }.map { it.map { idx -> points[idx] } }.filter { p -> p[0][0] == p[1][0] && p[2][0] == p[3][0] && p[0][1] == p[2][1] && p[1][1] == p[3][1] && p[0][0] < p[2][0] && p[0][1] < p[1][1] }.filter { p -> points.all { pt -> (pt[0] == p[0][0] && pt[1] == p[0][1]) || (pt[0] == p[1][0] && pt[1] == p[1][1]) || (pt[0] == p[2][0] && pt[1] == p[2][1]) || (pt[0] == p[3][0] && pt[1] == p[3][1]) || pt[0] !in p[0][0]..p[2][0] || pt[1] !in p[0][1]..p[1][1] } }.map { p -> (p[2][0] - p[0][0]) * (p[1][1] - p[0][1]) }.maxOrNull() ?: -1 }