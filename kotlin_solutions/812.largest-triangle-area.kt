/*
 * @lc app=leetcode id=812 lang=kotlin
 *
 * [812] Largest Triangle Area
 */

class Solution { fun largestTriangleArea(points: Array<IntArray>): Double = points.indices.flatMap { i -> (i+1 until points.size).flatMap { j -> (j+1 until points.size).map { k -> 0.5 * Math.abs(points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1])) }}}.maxOrNull() ?: 0.0 }