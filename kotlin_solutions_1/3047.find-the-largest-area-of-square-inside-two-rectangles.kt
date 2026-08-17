/*
 * @lc app=leetcode id=3047 lang=kotlin
 *
 * [3047] Find the Largest Area of Square Inside Two Rectangles
 */

class Solution { fun largestSquareArea(bottomLeft: Array<IntArray>, topRight: Array<IntArray>): Long = bottomLeft.indices.flatMap { i -> (i + 1 until bottomLeft.size).map { j -> topRight[i][0].coerceAtMost(topRight[j][0]).minus(bottomLeft[i][0].coerceAtLeast(bottomLeft[j][0])).coerceAtMost(topRight[i][1].coerceAtMost(topRight[j][1]).minus(bottomLeft[i][1].coerceAtLeast(bottomLeft[j][1]))).coerceAtLeast(0).toLong().let { s -> s * s } } }.maxOrNull() ?: 0L }