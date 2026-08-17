/*
 * @lc app=leetcode id=1828 lang=kotlin
 *
 * [1828] Queries on Number of Points Inside a Circle
 */

class Solution { fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray = queries.map { q -> points.count { p -> (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]) <= q[2] * q[2] } }.toIntArray() }